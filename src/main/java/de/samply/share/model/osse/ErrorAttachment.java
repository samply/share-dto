package de.samply.share.model.osse;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * Java class for ErrorAttachment complex type.
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="ErrorAttachment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorAttachment", namespace = "http://schema.samply.de/osse/Error", propOrder = {
    "any"
})
public class ErrorAttachment
    implements Serializable {

  private static final long serialVersionUID = 1L;
  @XmlAnyElement
  protected List<Element> any;

  /**
   * Gets the value of the any property.
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the any property.
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAny().add(newItem);
   * </pre>
   * Objects of the following type(s) are allowed in the list {@link Element }
   */
  public List<Element> getAny() {
    if (any == null) {
      any = new ArrayList<Element>();
    }
    return this.any;
  }

}
