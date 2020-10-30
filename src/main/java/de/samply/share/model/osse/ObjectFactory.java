package de.samply.share.model.osse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each Java content interface and Java element interface
 * generated in the de.samply.share.model.osse package.
 * An ObjectFactory allows you to programatically
 * construct new instances of the Java representation for XML content. The Java representation of
 * XML content can consist of schema derived interfaces and classes representing the binding of
 * schema type definitions, element declarations and model groups.  Factory methods for each of
 * these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private static final QName _MdrKey_QNAME = new QName("http://schema.samply.de/osse/MdrKey",
      "MdrKey");
  private static final QName _Value_QNAME = new QName("http://schema.samply.de/osse/Value",
      "Value");
  private static final QName _Inquiry_QNAME = new QName("http://schema.samply.de/osse/Inquiry",
      "Inquiry");
  private static final QName _Contact_QNAME = new QName("http://schema.samply.de/osse/Inquiry",
      "Contact");
  private static final QName _Info_QNAME = new QName("http://schema.samply.de/osse/Inquiry",
      "Info");
  private static final QName _LowerBound_QNAME = new QName("http://schema.samply.de/osse/Value",
      "LowerBound");
  private static final QName _UpperBound_QNAME = new QName("http://schema.samply.de/osse/Value",
      "UpperBound");
  private static final QName _Patient_QNAME = new QName("http://schema.samply.de/osse/Patient",
      "Patient");
  private static final QName _Container_QNAME = new QName("http://schema.samply.de/osse/Container",
      "Container");
  private static final QName _Entity_QNAME = new QName("http://schema.samply.de/osse/Entity",
      "Entity");
  private static final QName _QueryResult_QNAME = new QName(
      "http://schema.samply.de/osse/QueryResult", "QueryResult");
  private static final QName _RorMetareg_QNAME = new QName(
      "http://schema.samply.de/osse/RorMetareg", "RorMetareg");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes
   * for package: de.samply.share.model.osse
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link Attribute }.
   */
  public Attribute createAttribute() {
    return new Attribute();
  }

  /**
   * Create an instance of {@link Error }.
   */
  public Error createError() {
    return new Error();
  }

  /**
   * Create an instance of {@link ErrorAttachment }.
   */
  public ErrorAttachment createErrorAttachment() {
    return new ErrorAttachment();
  }

  /**
   * Create an instance of {@link Inquiry }.
   */
  public Inquiry createInquiry() {
    return new Inquiry();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Inquiry }{@code >}}.
   */
  @XmlElementDecl(namespace = "http://schema.samply.de/osse/Inquiry", name = "Inquiry")
  public JAXBElement<Inquiry> createInquiry(Inquiry value) {
    return new JAXBElement<Inquiry>(_Inquiry_QNAME, Inquiry.class, null, value);
  }

  /**
   * Create an instance of {@link Contact }.
   */
  public Contact createContact() {
    return new Contact();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Contact }{@code >}}.
   */
  @XmlElementDecl(namespace = "http://schema.samply.de/osse/Inquiry", name = "Contact")
  public JAXBElement<Contact> createContact(Contact value) {
    return new JAXBElement<Contact>(_Contact_QNAME, Contact.class, null, value);
  }

  /**
   * Create an instance of {@link Info }.
   */
  public Info createInfo() {
    return new Info();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Info }{@code >}}.
   */
  @XmlElementDecl(namespace = "http://schema.samply.de/osse/Inquiry", name = "Info")
  public JAXBElement<Info> createInfo(Info value) {
    return new JAXBElement<Info>(_Info_QNAME, Info.class, null, value);
  }

  /**
   * Create an instance of {@link Order }.
   */
  public Order createOrder() {
    return new Order();
  }

  /**
   * Create an instance of {@link OrderBy }.
   */
  public OrderBy createOrderBy() {
    return new OrderBy();
  }

  /**
   * Create an instance of {@link Query }.
   */
  public Query createQuery() {
    return new Query();
  }

  /**
   * Create an instance of {@link Where }.
   */
  public Where createWhere() {
    return new Where();
  }

  /**
   * Create an instance of {@link ConditionType }.
   */
  public ConditionType createConditionType() {
    return new ConditionType();
  }

  /**
   * Create an instance of {@link And }.
   */
  public And createAnd() {
    return new And();
  }

  /**
   * Create an instance of {@link Eq }.
   */
  public Eq createEq() {
    return new Eq();
  }

  /**
   * Create an instance of {@link Like }.
   */
  public Like createLike() {
    return new Like();
  }

  /**
   * Create an instance of {@link NotLike }.
   */
  public NotLike createNotLike() {
    return new NotLike();
  }

  /**
   * Create an instance of {@link Geq }.
   */
  public Geq createGeq() {
    return new Geq();
  }

  /**
   * Create an instance of {@link Gt }.
   */
  public Gt createGt() {
    return new Gt();
  }

  /**
   * Create an instance of {@link IsNotNull }.
   */
  public IsNotNull createIsNotNull() {
    return new IsNotNull();
  }

  /**
   * Create an instance of {@link IsNull }.
   */
  public IsNull createIsNull() {
    return new IsNull();
  }

  /**
   * Create an instance of {@link Leq }.
   */
  public Leq createLeq() {
    return new Leq();
  }

  /**
   * Create an instance of {@link Lt }.
   */
  public Lt createLt() {
    return new Lt();
  }

  /**
   * Create an instance of {@link Neq }.
   */
  public Neq createNeq() {
    return new Neq();
  }

  /**
   * Create an instance of {@link Or }.
   */
  public Or createOr() {
    return new Or();
  }

  /**
   * Create an instance of {@link In }.
   */
  public In createIn() {
    return new In();
  }

  /**
   * Create an instance of {@link MultivalueAttribute }.
   */
  public MultivalueAttribute createMultivalueAttribute() {
    return new MultivalueAttribute();
  }

  /**
   * Create an instance of {@link Between }.
   */
  public Between createBetween() {
    return new Between();
  }

  /**
   * Create an instance of {@link RangeAttribute }.
   */
  public RangeAttribute createRangeAttribute() {
    return new RangeAttribute();
  }

  /**
   * Create an instance of {@link GroupBy }.
   */
  public GroupBy createGroupBy() {
    return new GroupBy();
  }

  /**
   * Create an instance of {@link View }.
   */
  public View createView() {
    return new View();
  }

  /**
   * Create an instance of {@link ViewFields }.
   */
  public ViewFields createViewFields() {
    return new ViewFields();
  }

  /**
   * Create an instance of {@link Patient }.
   */
  public Patient createPatient() {
    return new Patient();
  }


  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Patient }{@code >}}.
   */
  @XmlElementDecl(namespace = "http://schema.samply.de/osse/Patient", name = "Patient")
  public JAXBElement<Patient> createPatient(Patient value) {
    return new JAXBElement<Patient>(_Patient_QNAME, Patient.class, null, value);
  }

  /**
   * Create an instance of {@link Case }.
   */
  public Case createCase() {
    return new Case();
  }

  /**
   * Create an instance of {@link Entity }.
   */
  public Entity createEntity() {
    return new Entity();
  }


  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}}.
   */
  @XmlElementDecl(namespace = "http://schema.samply.de/osse/Entity", name = "Entity")
  public JAXBElement<Entity> createEntity(Entity value) {
    return new JAXBElement<Entity>(_Entity_QNAME, Entity.class, null, value);
  }

  /**
   * Create an instance of {@link Container }.
   */
  public Container createContainer() {
    return new Container();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Container }{@code >}}.
   */
  @XmlElementDecl(namespace = "http://schema.samply.de/osse/Container", name = "Container")
  public JAXBElement<Container> createContainer(Container value) {
    return new JAXBElement<Container>(_Container_QNAME, Container.class, null, value);
  }

  /**
   * Create an instance of {@link Ref }.
   */
  public Ref createRef() {
    return new Ref();
  }

  /**
   * Create an instance of {@link Sample }.
   */
  public Sample createSample() {
    return new Sample();
  }

  /**
   * Create an instance of {@link QueryResult }.
   */
  public QueryResult createQueryResult() {
    return new QueryResult();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}.
   */
  @XmlElementDecl(namespace = "http://schema.samply.de/osse/QueryResult", name = "QueryResult")
  public JAXBElement<QueryResult> createQueryResult(QueryResult value) {
    return new JAXBElement<QueryResult>(_QueryResult_QNAME, QueryResult.class, null, value);
  }

  /**
   * Create an instance of {@link QueryResultStatistic }.
   */
  public QueryResultStatistic createQueryResultStatistic() {
    return new QueryResultStatistic();
  }

  /**
   * Create an instance of {@link RorMetareg }.
   */
  public RorMetareg createRorMetareg() {
    return new RorMetareg();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link RorMetareg }{@code >}}.
   */
  @XmlElementDecl(namespace = "http://schema.samply.de/osse/RorMetareg", name = "RorMetareg")
  public JAXBElement<RorMetareg> createRorMetareg(RorMetareg value) {
    return new JAXBElement<RorMetareg>(_RorMetareg_QNAME, RorMetareg.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}.
   */
  @XmlElementDecl(namespace = "http://schema.samply.de/osse/MdrKey", name = "MdrKey")
  public JAXBElement<String> createMdrKey(String value) {
    return new JAXBElement<String>(_MdrKey_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}.
   */
  @XmlElementDecl(namespace = "http://schema.samply.de/osse/Value", name = "Value")
  public JAXBElement<String> createValue(String value) {
    return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}.
   */
  @XmlElementDecl(namespace = "http://schema.samply.de/osse/Value", name = "LowerBound", substitutionHeadNamespace = "http://schema.samply.de/osse/Value", substitutionHeadName = "Value")
  public JAXBElement<String> createLowerBound(String value) {
    return new JAXBElement<String>(_LowerBound_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}.
   */
  @XmlElementDecl(namespace = "http://schema.samply.de/osse/Value", name = "UpperBound", substitutionHeadNamespace = "http://schema.samply.de/osse/Value", substitutionHeadName = "Value")
  public JAXBElement<String> createUpperBound(String value) {
    return new JAXBElement<String>(_UpperBound_QNAME, String.class, null, value);
  }


}
