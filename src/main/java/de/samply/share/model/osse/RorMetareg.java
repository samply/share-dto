package de.samply.share.model.osse;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Java class for RorMetareg complex type.
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="RorMetareg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.samply.de/osse/Entity}Entity"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RorMetareg", namespace = "http://schema.samply.de/osse/RorMetareg")
public class RorMetareg
    extends Entity
    implements Serializable {

  private static final long serialVersionUID = 1L;

}
