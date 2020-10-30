package de.samply.share.model.ccp;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Java class for contact complex type.
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="contact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contact", namespace = "http://schema.samply.de/ccp/Inquiry", propOrder = {
    "title",
    "firstname",
    "lastname",
    "phone",
    "email",
    "organization"
})
public class Contact
    implements Serializable {

  private static final long serialVersionUID = 1L;
  protected String title;
  protected String firstname;
  @XmlElement(required = true)
  protected String lastname;
  protected String phone;
  protected String email;
  protected String organization;

  /**
   * Gets the value of the title property.
   *
   * @return possible object is {@link String }
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   *
   * @param value allowed object is {@link String }
   */
  public void setTitle(String value) {
    this.title = value;
  }

  /**
   * Gets the value of the firstname property.
   *
   * @return possible object is {@link String }
   */
  public String getFirstname() {
    return firstname;
  }

  /**
   * Sets the value of the firstname property.
   *
   * @param value allowed object is {@link String }
   */
  public void setFirstname(String value) {
    this.firstname = value;
  }

  /**
   * Gets the value of the lastname property.
   *
   * @return possible object is {@link String }
   */
  public String getLastname() {
    return lastname;
  }

  /**
   * Sets the value of the lastname property.
   *
   * @param value allowed object is {@link String }
   */
  public void setLastname(String value) {
    this.lastname = value;
  }

  /**
   * Gets the value of the phone property.
   *
   * @return possible object is {@link String }
   */
  public String getPhone() {
    return phone;
  }

  /**
   * Sets the value of the phone property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPhone(String value) {
    this.phone = value;
  }

  /**
   * Gets the value of the email property.
   *
   * @return possible object is {@link String }
   */
  public String getEmail() {
    return email;
  }

  /**
   * Sets the value of the email property.
   *
   * @param value allowed object is {@link String }
   */
  public void setEmail(String value) {
    this.email = value;
  }

  /**
   * Gets the value of the organization property.
   *
   * @return possible object is {@link String }
   */
  public String getOrganization() {
    return organization;
  }

  /**
   * Sets the value of the organization property.
   *
   * @param value allowed object is {@link String }
   */
  public void setOrganization(String value) {
    this.organization = value;
  }

}
