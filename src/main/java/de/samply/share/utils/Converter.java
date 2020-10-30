package de.samply.share.utils;

import static de.samply.share.utils.QueryConverter.marshal;
import static de.samply.share.utils.QueryConverter.unmarshal;

import de.samply.share.model.common.Container;
import de.samply.share.model.common.Patient;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Converter {

  public static final Logger logger = LoggerFactory.getLogger(Converter.class);
  public static final String XMLNS_PATH_COMMON = "/common/";
  public static final String XMLNS_PATH_CCP = "/ccp/";
  public static final String XMLNS_PATH_OSSE = "/osse/";

  private Converter() {

  }

  /**
   * Convert a osse container to a common container.
   * @param osseContainer osse container
   * @return common container
   * @throws JAXBException jaxbException
   */
  public static Container convertOsseContainerToCommonContainer(
      de.samply.share.model.osse.Container osseContainer) throws JAXBException {
    String osseContainerString = "";
    osseContainerString = marshal(osseContainer,
        JAXBContext.newInstance(de.samply.share.model.osse.Container.class));
    osseContainerString = osseContainerString.replace(XMLNS_PATH_OSSE, XMLNS_PATH_COMMON);
    return unmarshal(osseContainerString, JAXBContext.newInstance(Container.class),
        Container.class);
  }

  /**
   * Convert a ccp container to a common container.
   * @param ccpContainer ccp container
   * @return common container
   * @throws JAXBException jaxbException
   */
  public static Container convertCcpContainerToCommonContainer(
      de.samply.share.model.ccp.Container ccpContainer) throws JAXBException {
    String ccpContainerString = "";
    ccpContainerString = marshal(ccpContainer,
        JAXBContext.newInstance(de.samply.share.model.ccp.Container.class));
    ccpContainerString = ccpContainerString.replace(XMLNS_PATH_CCP, XMLNS_PATH_COMMON);
    return unmarshal(ccpContainerString, JAXBContext.newInstance(Container.class),
        Container.class);
  }

  /**
   * Convert a common container to a ccp container.
   * @param commonContainer common container
   * @return ccp container
   * @throws JAXBException jaxbException
   */
  public static de.samply.share.model.ccp.Container convertCommonContainerToCcpContainer(
      Container commonContainer) throws JAXBException {
    String commonContainerString = "";
    commonContainerString = marshal(commonContainer, JAXBContext.newInstance(Container.class));
    commonContainerString = commonContainerString.replace(XMLNS_PATH_COMMON, XMLNS_PATH_CCP);
    return unmarshal(commonContainerString,
        JAXBContext.newInstance(de.samply.share.model.ccp.Container.class),
        de.samply.share.model.ccp.Container.class);
  }

  /**
   * Convert a common container to a osse container.
   * @param commonContainer common container
   * @return osse container
   * @throws JAXBException jaxbException
   */
  public static de.samply.share.model.osse.Container convertCommonContainerToOsseContainer(
      Container commonContainer) throws JAXBException {
    String commonContainerString = "";
    commonContainerString = marshal(commonContainer, JAXBContext.newInstance(Container.class));
    commonContainerString = commonContainerString.replace(XMLNS_PATH_COMMON, XMLNS_PATH_OSSE);
    return unmarshal(commonContainerString,
        JAXBContext.newInstance(de.samply.share.model.osse.Container.class),
        de.samply.share.model.osse.Container.class);
  }

  /**
   * Convert a osse patient to a common patient.
   * @param patient osse patient
   * @return common patient
   * @throws JAXBException jaxbException
   */
  public static Patient convertOssePatientToCommonPatient(
      de.samply.share.model.osse.Patient patient) throws JAXBException {
    String ossePatientString = "";
    ossePatientString = marshal(patient,
        JAXBContext.newInstance(de.samply.share.model.osse.Patient.class));
    ossePatientString = ossePatientString.replace(XMLNS_PATH_OSSE, XMLNS_PATH_COMMON);
    return unmarshal(ossePatientString, JAXBContext.newInstance(Patient.class),
        Patient.class);
  }

  /**
   * Convert a ccp patient to a common patient.
   * @param patient ccp patient
   * @return common patient
   * @throws JAXBException jaxbException
   */
  public static Patient convertCcpPatientToCommonPatient(de.samply.share.model.ccp.Patient patient)
      throws JAXBException {
    String ccpPatientString = "";
    ccpPatientString = marshal(patient,
        JAXBContext.newInstance(de.samply.share.model.ccp.Patient.class));
    ccpPatientString = ccpPatientString.replace(XMLNS_PATH_CCP, XMLNS_PATH_COMMON);
    return unmarshal(ccpPatientString, JAXBContext.newInstance(Patient.class),
        Patient.class);
  }


}
