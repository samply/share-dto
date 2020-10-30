package de.samply.share.model.osse;

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
 *         &lt;element ref="{http://schema.samply.de/osse/Query}Order" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "order"
})
@XmlRootElement(name = "OrderBy")
public class OrderBy
    implements Serializable {

  private static final long serialVersionUID = 1L;
  @XmlElement(name = "Order", required = true)
  protected List<Order> order;

  /**
   * Gets the value of the order property.
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the order property.
   * For example, to add a new item, do as follows:
   * <pre>
   *    getOrder().add(newItem);
   * </pre>
   * Objects of the following type(s) are allowed in the list {@link Order }
   */
  public List<Order> getOrder() {
    if (order == null) {
      order = new ArrayList<Order>();
    }
    return this.order;
  }

}
