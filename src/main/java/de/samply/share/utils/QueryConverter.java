package de.samply.share.utils;

import de.samply.share.model.common.And;
import de.samply.share.model.common.Attribute;
import de.samply.share.model.common.Between;
import de.samply.share.model.common.Eq;
import de.samply.share.model.common.Error;
import de.samply.share.model.common.Geq;
import de.samply.share.model.common.In;
import de.samply.share.model.common.Leq;
import de.samply.share.model.common.ObjectFactory;
import de.samply.share.model.common.Or;
import de.samply.share.model.common.Query;
import de.samply.share.model.common.QueryResultStatistic;
import de.samply.share.model.common.View;
import de.samply.share.model.common.ViewFields;
import de.samply.share.model.common.Where;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


/**
 * Utility class to transform and manipulate query objects.
 */
public class QueryConverter {

  public static final Logger logger = LoggerFactory.getLogger(QueryConverter.class);
  public static final String XMLNS_PATH_COMMON = "/common/";
  public static final String XMLNS_PATH_CCP = "/ccp/";
  public static final String XMLNS_PATH_OSSE = "/osse/";

  /**
   * Prohibit class instantiation since it only offers static methods.
   */
  private QueryConverter() {
  }

  /**
   * Unmarshal an object from xml.
   *
   * @param xml     the source xml string
   * @param context the jaxb context
   * @param clazz   the target class
   * @param <T>     the target type
   * @return the target object
   */
  public static <T> T unmarshal(String xml, JAXBContext context, Class<T> clazz)
      throws JAXBException {
    StringReader stringReader = new StringReader(xml);
    Object obj = context.createUnmarshaller().unmarshal(new StreamSource(stringReader));
    return (T) (obj instanceof JAXBElement ? ((JAXBElement) obj).getValue() : obj);
  }

  /**
   * Marshal an object to xml.
   *
   * @param object  the object to marshal
   * @param context the jaxb context, which has to be initalized with the correct class
   * @param <T>     the type of the object to marshal
   * @return the marshalled object
   */
  public static <T> String marshal(T object, JAXBContext context) {
    try {
      StringWriter stringWriter = new StringWriter();
      Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(Marshaller.JAXB_ENCODING, StandardCharsets.UTF_8.name());
      marshaller.marshal(object, stringWriter);
      return stringWriter.toString();
    } catch (JAXBException e) {
      logger.error(String.format("Exception while marshalling", e));
      return "";
    }
  }

  /**
   * Transforms a CCP Query to a common Query. Is used to transform queries that are transmitted via
   * REST interface from central search.
   *
   * @param ccpQuery the query in the ccp namespace
   * @return XML the query in the common namespace
   */
  public static Query convertCcpQueryToCommonQuery(de.samply.share.model.ccp.Query ccpQuery)
      throws JAXBException {
    String ccpQueryString = marshal(ccpQuery,
        JAXBContext.newInstance(de.samply.share.model.ccp.Query.class));
    ccpQueryString = ccpQueryString.replace(XMLNS_PATH_CCP, XMLNS_PATH_COMMON);
    Query commonQuery = xmlToQuery(ccpQueryString);
    commonQuery = insertRootGroup(commonQuery);
    return commonQuery;
  }

  /**
   * Transforms an OSSE Query to a common Query.
   *
   * @param osseQuery the query in the osse namespace
   * @return XML the query in the common namespace
   */
  public static Query convertOsseQueryToCommonQuery(de.samply.share.model.osse.Query osseQuery)
      throws JAXBException {
    String osseQueryString = marshal(osseQuery,
        JAXBContext.newInstance(de.samply.share.model.osse.Query.class));
    osseQueryString = osseQueryString.replace(XMLNS_PATH_OSSE, XMLNS_PATH_COMMON);
    Query commonQuery = xmlToQuery(osseQueryString);
    return commonQuery;
  }

  /**
   * Transforms a Common Query to a CCP Query.
   *
   * @param commonQuery the query in the common namespace
   * @return XML the query in the ccp namespace
   */
  public static de.samply.share.model.ccp.Query convertCommonQueryToCcpQuery(Query commonQuery)
      throws JAXBException {
    String commonQueryString = queryToXml(commonQuery);
    commonQueryString = commonQueryString.replace(XMLNS_PATH_COMMON, XMLNS_PATH_CCP);
    de.samply.share.model.ccp.Query ccpQuery = unmarshal(commonQueryString,
        JAXBContext.newInstance(de.samply.share.model.ccp.Query.class),
        de.samply.share.model.ccp.Query.class);
    return ccpQuery;
  }

  /**
   * Transforms a common Query to an OSSE Query.
   *
   * @param commonQuery the query in the common namespace
   * @return XML the query in the osse namespace
   */
  public static de.samply.share.model.osse.Query convertCommonQueryToOsseQuery(Query commonQuery)
      throws JAXBException {
    String commonQueryString = queryToXml(commonQuery);
    commonQueryString = commonQueryString.replace(XMLNS_PATH_COMMON, XMLNS_PATH_OSSE);
    de.samply.share.model.osse.Query osseQuery = unmarshal(commonQueryString,
        JAXBContext.newInstance(de.samply.share.model.osse.Query.class),
        de.samply.share.model.osse.Query.class);
    return osseQuery;
  }

  /**
   * Transforms a CCP View to a common View. Is used to transform queries that are transmitted via
   * REST interface from central search
   *
   * @param ccpView the view in the ccp namespace
   * @return XML the view in the common namespace
   */
  public static View convertCcpViewToCommonView(de.samply.share.model.ccp.View ccpView)
      throws JAXBException {
    String ccpViewString = marshal(ccpView,
        JAXBContext.newInstance(de.samply.share.model.ccp.View.class));
    ccpViewString = ccpViewString.replace(XMLNS_PATH_CCP, XMLNS_PATH_COMMON);
    return xmlToView(ccpViewString);
  }

  /**
   * Transforms an OSSE View to a common View.
   *
   * @param osseView the view in the osse namespace
   * @return XML the view in the common namespace
   */
  public static View convertOsseViewToCommonView(de.samply.share.model.osse.View osseView)
      throws JAXBException {
    String osseViewString = marshal(osseView,
        JAXBContext.newInstance(de.samply.share.model.osse.View.class));
    osseViewString = osseViewString.replace(XMLNS_PATH_OSSE, XMLNS_PATH_COMMON);
    View commonView = xmlToView(osseViewString);
    return commonView;
  }

  /**
   * Transforms a Common View to a CCP View.
   *
   * @param commonView the view in the common namespace
   * @return XML the view in the ccp namespace
   */
  public static de.samply.share.model.ccp.View convertCommonViewToCcpView(View commonView)
      throws JAXBException {
    String commonViewString = viewToXml(commonView);
    commonViewString = commonViewString.replace(XMLNS_PATH_COMMON, XMLNS_PATH_CCP);
    de.samply.share.model.ccp.View ccpView = unmarshal(commonViewString,
        JAXBContext.newInstance(de.samply.share.model.ccp.View.class),
        de.samply.share.model.ccp.View.class);
    return ccpView;
  }

  /**
   * Transforms a common View to an OSSE View.
   *
   * @param commonView the view in the common namespace
   * @return XML the view in the osse namespace
   */
  public static de.samply.share.model.osse.View convertCommonViewToOsseView(View commonView)
      throws JAXBException {
    String commonViewString = viewToXml(commonView);
    commonViewString = commonViewString.replace(XMLNS_PATH_COMMON, XMLNS_PATH_OSSE);
    de.samply.share.model.osse.View osseView = unmarshal(commonViewString,
        JAXBContext.newInstance(de.samply.share.model.osse.View.class),
        de.samply.share.model.osse.View.class);
    return osseView;
  }

  /**
   * Transforms a CCP Error to a common Error. Is used to transform queries that are transmitted via
   * REST interface from central search
   *
   * @param ccpError the error in the ccp namespace
   * @return XML the error in the common namespace
   */
  public static Error convertCcpErrorToCommonError(de.samply.share.model.ccp.Error ccpError)
      throws JAXBException {
    String ccpErrorString = marshal(ccpError,
        JAXBContext.newInstance(de.samply.share.model.ccp.Error.class));
    ccpErrorString = ccpErrorString.replace(XMLNS_PATH_CCP, XMLNS_PATH_COMMON);
    return unmarshal(ccpErrorString,
        JAXBContext.newInstance(ObjectFactory.class),
        Error.class);
  }

  /**
   * Transforms an OSSE Error to a common Error.
   *
   * @param osseError the error in the osse namespace
   * @return XML the error in the common namespace
   */
  public static Error convertOsseErrorToCommonError(de.samply.share.model.osse.Error osseError)
      throws JAXBException {
    String osseErrorString = marshal(osseError,
        JAXBContext.newInstance(de.samply.share.model.osse.Error.class));
    osseErrorString = osseErrorString.replace(XMLNS_PATH_OSSE, XMLNS_PATH_COMMON);
    return unmarshal(osseErrorString,
        JAXBContext.newInstance(ObjectFactory.class),
        Error.class);
  }

  /**
   * Transforms a Common Error to a CCP Error.
   *
   * @param commonError the error in the common namespace
   * @return XML the error in the ccp namespace
   */
  public static de.samply.share.model.ccp.Error convertCommonErrorToCcpError(Error commonError)
      throws JAXBException {
    String commonErrorString = marshal(commonError, JAXBContext.newInstance(Error.class));
    commonErrorString = commonErrorString.replace(XMLNS_PATH_COMMON, XMLNS_PATH_CCP);
    de.samply.share.model.ccp.Error ccpError = unmarshal(commonErrorString,
        JAXBContext.newInstance(de.samply.share.model.ccp.Error.class),
        de.samply.share.model.ccp.Error.class);
    return ccpError;
  }

  /**
   * Transforms a common Error to an OSSE Error.
   *
   * @param commonError the error in the common namespace
   * @return XML the error in the osse namespace
   */
  public static de.samply.share.model.osse.Error convertCommonErrorToOsseError(Error commonError)
      throws JAXBException {
    String commonErrorString = marshal(commonError, JAXBContext.newInstance(Error.class));
    commonErrorString = commonErrorString.replace(XMLNS_PATH_COMMON, XMLNS_PATH_OSSE);
    de.samply.share.model.osse.Error osseError = unmarshal(commonErrorString,
        JAXBContext.newInstance(de.samply.share.model.osse.Error.class),
        de.samply.share.model.osse.Error.class);
    return osseError;
  }

  /**
   * Transforms an OSSE QueryResultStatistic to a common QueryResultStatistic.
   *
   * @param osseQueryResultStatistic the QueryResultStatistic in the osse namespace
   * @return the QueryResultStatistic in the common namespace
   */
  public static QueryResultStatistic convertOsseQueryResultStatisticToCommonQueryResult(
      de.samply.share.model.osse.QueryResultStatistic osseQueryResultStatistic)
      throws JAXBException {
    String osseQueryResultStatisticString = marshal(osseQueryResultStatistic,
        JAXBContext.newInstance(de.samply.share.model.osse.QueryResultStatistic.class));
    osseQueryResultStatisticString = osseQueryResultStatisticString
        .replace(XMLNS_PATH_OSSE, XMLNS_PATH_COMMON);
    return unmarshal(osseQueryResultStatisticString,
        JAXBContext.newInstance(de.samply.share.model.common.ObjectFactory.class),
        de.samply.share.model.common.QueryResultStatistic.class);
  }

  /**
   * Transforms a common QueryResultStatistic to an OSSE QueryResultStatistic.
   *
   * @param commonQueryResultStatistic the QueryResultStatistic in the common namespace
   * @return the QueryResultStatistic in the osse namespace
   */
  public static de.samply.share.model.osse.QueryResultStatistic convertCommonQrsToOsseQrs(
      QueryResultStatistic commonQueryResultStatistic) throws JAXBException {
    String commonQueryResultStatisticString = marshal(commonQueryResultStatistic,
        JAXBContext.newInstance(de.samply.share.model.common.QueryResultStatistic.class));
    commonQueryResultStatisticString = commonQueryResultStatisticString
        .replace(XMLNS_PATH_COMMON, XMLNS_PATH_OSSE);
    de.samply.share.model.osse.QueryResultStatistic osseQueryResultStatistic = unmarshal(
        commonQueryResultStatisticString,
        JAXBContext.newInstance(de.samply.share.model.osse.QueryResultStatistic.class),
        de.samply.share.model.osse.QueryResultStatistic.class);
    return osseQueryResultStatistic;
  }

  /**
   * Serialize a query to XML.
   *
   * @param query the query
   * @return the XML formatted query
   */
  public static String queryToXml(Query query) throws JAXBException {
    return marshal(query, JAXBContext.newInstance(Query.class));
  }

  /**
   * Deserialize a common query from XML.
   *
   * @param xml the query in XML representation
   * @return the query object
   */
  public static Query xmlToQuery(String xml) throws JAXBException {
    return unmarshal(xml,
        JAXBContext.newInstance(Query.class),
        Query.class);
  }

  /**
   * Serialize a view to XML.
   *
   * @param view the {@link View} to be serialized
   * @return XML representation of the view
   */
  public static String viewToXml(View view) throws JAXBException {
    return marshal(view, JAXBContext.newInstance(View.class));
  }

  public static String viewToXml(de.samply.share.model.ccp.View view) throws JAXBException {
    return marshal(view, JAXBContext.newInstance(de.samply.share.model.ccp.View.class));
  }

  /**
   * Deserialize a common view from XML.
   *
   * @param xml XML representation of the view
   * @return the view object
   */
  public static View xmlToView(String xml) throws JAXBException {
    return unmarshal(xml,
        JAXBContext.newInstance(View.class),
        View.class);
  }

  /**
   * Deserialize a CCP query result from XML.
   *
   * @param xml XML representation of the query result
   * @return the query result object
   */
  public static de.samply.share.model.ccp.QueryResult ccpXmlToQueryResult(String xml)
      throws JAXBException {
    return unmarshal(xml,
        JAXBContext.newInstance(de.samply.share.model.ccp.ObjectFactory.class),
        de.samply.share.model.ccp.QueryResult.class);
  }

  // Maybe this has to be changed because of the "getValue" part?
  /*public static QueryResult ccpXmlToQueryResult(String xml) throws JAXBException {
    StringReader stringReader = new StringReader(xml);

    JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    JAXBElement<QueryResult> queryResultElement = jaxbUnmarshaller
        .unmarshal(new StreamSource(stringReader),
            QueryResult.class);
    return queryResultElement.getValue();
  }*/

  /**
   * Deserialize an OSSE query result from XML.
   *
   * @param xml XML representation of the query result
   * @return the query result object
   */
  public static de.samply.share.model.osse.QueryResult osseXmlToQueryResult(String xml)
      throws JAXBException {
    return unmarshal(xml,
        JAXBContext.newInstance(de.samply.share.model.osse.ObjectFactory.class),
        de.samply.share.model.osse.QueryResult.class);
  }


  /**
   * Insert an "AND" conjunction group as first child of the Where - if there is no "AND" or "OR"
   * yet.
   *
   * @param oldQuery the query to modify
   * @return the query with an AND as first child of the where
   */
  public static Query insertRootGroup(Query oldQuery) {
    Object firstChild = null;
    try {
      firstChild = oldQuery.getWhere().getAndOrEqOrLike().get(0);
    } catch (Exception e) {
      logger.debug("empty query received");
    }
    if (firstChild != null && (firstChild.getClass() == And.class
        || firstChild.getClass() == Or.class)) {
      return oldQuery;
    } else {
      Query newQuery = new Query();
      And and = new And();
      Where where = new Where();

      and.getAndOrEqOrLike().addAll(oldQuery.getWhere().getAndOrEqOrLike());
      where.getAndOrEqOrLike().add(and);

      newQuery.setGroupBy(oldQuery.getGroupBy());
      newQuery.setId(oldQuery.getId());
      newQuery.setOrderBy(oldQuery.getOrderBy());
      newQuery.setWhere(where);
      return newQuery;
    }
  }

  /**
   * Currently, Centraxx does not know of the "between" and "in" operators. Replace Between with an
   * "and"-combination of geq and leq Replace In with an "or"-combination of eq.
   *
   * @param query the original query
   * @return the query with the replacements
   */
  public static Query substituteOperators(Query query) {
    Query newQuery = new Query();
    newQuery.setGroupBy(query.getGroupBy());
    newQuery.setId(query.getId());
    newQuery.setOrderBy(query.getOrderBy());

    Where newWhere = new Where();
    try {
      newWhere.getAndOrEqOrLike().add(replaceOperators(query.getWhere().getAndOrEqOrLike().get(0)));
    } catch (NullPointerException | IndexOutOfBoundsException e) {
      logger.trace("Empty query...don't exchange anything");
    }
    newQuery.setWhere(newWhere);
    return newQuery;
  }

  /**
   * Replace "between" with a combination of GT and LT and replace "in" with a list of attributes,
   * joined with "or".
   *
   * @param object the object to recursively replace the operators in
   * @return the object with replaced operators
   */
  private static Serializable replaceOperators(Serializable object) {
    if (object.getClass() == And.class) {
      And and = (And) object;
      And and2 = new And();

      for (Serializable o : and.getAndOrEqOrLike()) {
        Serializable o2 = replaceOperators(o);
        and2.getAndOrEqOrLike().add(o2);
      }
      return and2;
    } else if (object.getClass() == Or.class) {
      Or or = (Or) object;
      Or or2 = new Or();

      for (Serializable o : or.getAndOrEqOrLike()) {
        Serializable o2 = replaceOperators(o);
        or2.getAndOrEqOrLike().add(o2);
      }
      return or2;
    } else if (object.getClass() == Between.class) {
      return replaceBetween((Between) object);
    } else if (object.getClass() == In.class) {
      return replaceIn((In) object);
    } else {
      return object;
    }
  }

  /**
   * Replace all "Between" elements with an AND combination of geq and leq.
   *
   * @param between the between element that will be replaced
   * @return the and element, consisting of a geq and a leq
   */
  private static And replaceBetween(Between between) {
    ObjectFactory objectFactory = new ObjectFactory();

    Attribute attrFrom = new Attribute();
    attrFrom.setMdrKey(between.getRangeAttribute().getMdrKey());
    attrFrom.setValue(objectFactory.createValue(between.getRangeAttribute().getLowerBound()));
    Geq geq = new Geq();
    geq.setAttribute(attrFrom);

    Attribute attrTo = new Attribute();
    attrTo.setMdrKey(between.getRangeAttribute().getMdrKey());
    attrTo.setValue(objectFactory.createValue(between.getRangeAttribute().getUpperBound()));
    Leq leq = new Leq();
    leq.setAttribute(attrTo);

    And and = new And();
    and.getAndOrEqOrLike().add(leq);
    and.getAndOrEqOrLike().add(geq);
    return and;
  }

  /**
   * Replace all "In" elements with an OR combination of eq.
   *
   * @param in the in element that will be replaced
   * @return the or element, consisting of 1 or more eq elements
   */
  private static Or replaceIn(In in) {
    Or or = new Or();

    for (JAXBElement<String> value : in.getMultivalueAttribute().getValue()) {
      Eq eq = new Eq();
      Attribute attr = new Attribute();
      attr.setMdrKey(in.getMultivalueAttribute().getMdrKey());
      attr.setValue(value);
      eq.setAttribute(attr);
      or.getAndOrEqOrLike().add(eq);
    }

    return or;
  }

  /**
   * Removes all provided attributes (and their parent nodes if necessary) from a view.
   *
   * @param view       the view
   * @param attributes the attributes to remove
   * @return the view
   */
  public static View removeAttributesFromView(View view, List<String> attributes) {
    if (attributes == null || attributes.size() < 1) {
      return view;
    }

    try {

      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("//*[text()='");
      stringBuilder.append(attributes.get(0));

      for (int i = 1; i < attributes.size(); ++i) {
        stringBuilder.append("' or text()='");
        stringBuilder.append(attributes.get(i));
      }

      stringBuilder.append("']");
      XPathFactory xpf = XPathFactory.newInstance();
      XPath xpath = xpf.newXPath();
      XPathExpression expression = xpath.compile(stringBuilder.toString());

      String xml = viewToXml(view);
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      Document document = dbf.newDocumentBuilder().parse(new InputSource(new StringReader(xml)));
      NodeList matchingKeyNodes = (NodeList) expression.evaluate(document, XPathConstants.NODESET);

      for (int j = 0; j < matchingKeyNodes.getLength(); ++j) {
        Node n = matchingKeyNodes.item(j);
        Node parentNode = n.getParentNode();
        if (parentNode.getNodeName().endsWith("ViewFields")) {
          logger.trace("This is a viewfield. Only remove the single node.");
          parentNode.removeChild(n);
        } else if (parentNode.getNodeName().endsWith("Attribute")) {
          logger.trace("This is part of the query. Remove the whole operator node as well.");
          Node operatorNode = parentNode.getParentNode().getParentNode();
          operatorNode.removeChild(parentNode.getParentNode());
        } else {
          logger.trace(
              "This is part of the query. Remove the whole operator node as well."
                  + " There is no attribute element...only remove the direct parent.");
          Node operatorNode = parentNode.getParentNode();
          operatorNode.removeChild(parentNode);
        }
      }

      // Now we have to check, if any nodes below the Where Node are empty and remove them
      removeEmptyNodes(document);

      TransformerFactory tf = TransformerFactory.newInstance();
      Transformer t = tf.newTransformer();
      StringWriter sw = new StringWriter();
      t.transform(new DOMSource(document), new StreamResult(sw));

      return xmlToView(sw.toString());

    } catch (JAXBException | SAXException | IOException | ParserConfigurationException
        | XPathExpressionException | TransformerException e) {
      logger.error("Exception caught: ", e);
    }

    logger.error(
        "There was an error while trying to remove attributes from view. Returning original View.");
    return view;
  }

  /**
   * Remove any given attribute from the query.
   *
   * @param query      the query in which the attributes shall be removed
   * @param attributes a list of attributes to remove
   * @return the query without the attributes in the provided list
   */
  public static Query removeAttributesFromQuery(Query query, List<String> attributes) {
    View view = new View();
    view.setQuery(query);
    // Just add a dummy for the sake of having a view...it will be instantly removed
    view.setViewFields(new ViewFields());
    view.getViewFields().getMdrKey().add("placeholder");
    view = removeAttributesFromView(view, attributes);
    return view.getQuery();
  }

  /**
   * Removes the empty nodes below a given node.
   *
   * @param node the rootnode
   */
  public static void removeEmptyNodes(Node node) {
    NodeList list = node.getChildNodes();
    for (int i = 0; i < list.getLength(); i++) {
      removeEmptyNodes(list.item(i));
    }
    boolean emptyElement =
        node.getNodeType() == Node.ELEMENT_NODE && node.getChildNodes().getLength() == 0;
    boolean emptyText =
        node.getNodeType() == Node.TEXT_NODE && node.getNodeValue().trim().isEmpty();
    boolean nodeIsWhereNode =
        node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().contains("Where");
    if ((emptyElement || emptyText) && !nodeIsWhereNode) {
      node.getParentNode().removeChild(node);
    }
  }

}
