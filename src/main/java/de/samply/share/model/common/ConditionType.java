package de.samply.share.model.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Java class for ConditionType complex type.
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="ConditionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{http://schema.samply.de/common/Query}And"/&gt;
 *         &lt;element ref="{http://schema.samply.de/common/Query}Eq"/&gt;
 *         &lt;element ref="{http://schema.samply.de/common/Query}Like"/&gt;
 *         &lt;element ref="{http://schema.samply.de/common/Query}Geq"/&gt;
 *         &lt;element ref="{http://schema.samply.de/common/Query}Gt"/&gt;
 *         &lt;element ref="{http://schema.samply.de/common/Query}IsNotNull"/&gt;
 *         &lt;element ref="{http://schema.samply.de/common/Query}IsNull"/&gt;
 *         &lt;element ref="{http://schema.samply.de/common/Query}Leq"/&gt;
 *         &lt;element ref="{http://schema.samply.de/common/Query}Lt"/&gt;
 *         &lt;element ref="{http://schema.samply.de/common/Query}Neq"/&gt;
 *         &lt;element ref="{http://schema.samply.de/common/Query}Or"/&gt;
 *         &lt;element ref="{http://schema.samply.de/common/Query}In"/&gt;
 *         &lt;element ref="{http://schema.samply.de/common/Query}Between"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionType", propOrder = {
    "andOrEqOrLike"
})
@XmlSeeAlso({
    Where.class,
    Or.class,
    And.class
})
public class ConditionType implements Serializable {

  private static final long serialVersionUID = 1L;
  @XmlElements({
      @XmlElement(name = "And", type = And.class),
      @XmlElement(name = "Eq", type = Eq.class),
      @XmlElement(name = "Like", type = Like.class),
      @XmlElement(name = "Geq", type = Geq.class),
      @XmlElement(name = "Gt", type = Gt.class),
      @XmlElement(name = "IsNotNull", type = IsNotNull.class),
      @XmlElement(name = "IsNull", type = IsNull.class),
      @XmlElement(name = "Leq", type = Leq.class),
      @XmlElement(name = "Lt", type = Lt.class),
      @XmlElement(name = "Neq", type = Neq.class),
      @XmlElement(name = "Or", type = Or.class),
      @XmlElement(name = "In", type = In.class),
      @XmlElement(name = "Between", type = Between.class)
  })
  protected List<Serializable> andOrEqOrLike;

  /**
   * Gets the value of the andOrEqOrLike property.
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the andOrEqOrLike property.
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAndOrEqOrLike().add(newItem);
   * </pre>
   * Objects of the following type(s) are allowed in the list {@link And } {@link Eq } {@link Like }
   * {@link Geq } {@link Gt } {@link IsNotNull } {@link IsNull } {@link Leq } {@link Lt } {@link Neq
   * } {@link Or } {@link In } {@link Between }
   */
  public List<Serializable> getAndOrEqOrLike() {
    if (andOrEqOrLike == null) {
      andOrEqOrLike = new ArrayList<Serializable>();
    }
    return this.andOrEqOrLike;
  }

}
