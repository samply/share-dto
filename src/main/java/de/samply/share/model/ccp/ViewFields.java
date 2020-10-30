package de.samply.share.model.ccp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Java class for anonymous complex type.
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://schema.samply.de/ccp/MdrKey}MdrKey" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mdrKey"
})
@XmlRootElement(name = "ViewFields")
public class ViewFields
    implements Serializable {

  private static final long serialVersionUID = 1L;
  @XmlElement(name = "MdrKey", namespace = "http://schema.samply.de/ccp/MdrKey", required = true)
  protected List<String> mdrKey;

  /**
   * Gets the value of the mdrKey property.
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the mdrKey property.
   * For example, to add a new item, do as follows:
   * <pre>
   *    getMdrKey().add(newItem);
   * </pre>
   * Objects of the following type(s) are allowed in the list {@link String }
   */
  public List<String> getMdrKey() {
    if (mdrKey == null) {
      mdrKey = new ArrayList<String>();
    }
    return this.mdrKey;
  }

}
