package de.samply.share.model.ccp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Java class for Ref complex type.
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="Ref"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="EntityId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ref", namespace = "http://schema.samply.de/ccp/Entity", propOrder = {
    "entityId"
})
public class Ref
    implements Serializable {

  private static final long serialVersionUID = 1L;
  @XmlElement(name = "EntityId", namespace = "")
  protected List<String> entityId;

  /**
   * Gets the value of the entityId property.
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the entityId property.
   * For example, to add a new item, do as follows:
   * <pre>
   *    getEntityId().add(newItem);
   * </pre>
   * Objects of the following type(s) are allowed in the list {@link String }
   */
  public List<String> getEntityId() {
    if (entityId == null) {
      entityId = new ArrayList<String>();
    }
    return this.entityId;
  }

}
