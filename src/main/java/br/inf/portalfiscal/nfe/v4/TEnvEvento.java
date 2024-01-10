//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v2.3.4 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.14 às 03:43:35 PM BRT 
//


package br.inf.portalfiscal.nfe.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * Tipo Lote de Envio
 *
 * <p>Classe Java de TEnvEvento complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType name="TEnvEvento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idLote"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;whiteSpace value="preserve"/&gt;
 *               &lt;pattern value="[0-9]{1,15}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="evento" type="{http://www.portalfiscal.inf.br/nfe}TEvento" maxOccurs="20"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TVerEnvEvento" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEnvEvento", namespace = "http://www.portalfiscal.inf.br/nfe", propOrder = {
    "idLote",
    "evento"
})
@XmlRootElement(name = "envEvento", namespace = "http://www.portalfiscal.inf.br/nfe")
@EqualsAndHashCode
@ToString
public class TEnvEvento {

  @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
  protected String idLote;
  @XmlElement(name = "evento", namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
  protected List<TEvento> evento;
  @XmlAttribute(name = "xmlns", required = false)
  protected String xmlns;
  @XmlAttribute(name = "versao", required = true)
  protected String versao;

  /**
   * Obtém o valor da propriedade idLote.
   *
   * @return possible object is {@link String }
   */
  public String getIdLote() {
    return idLote;
  }

  /**
   * Define o valor da propriedade idLote.
   *
   * @param value allowed object is {@link String }
   */
  public void setIdLote(String value) {
    this.idLote = value;
  }

  /**
   * Gets the value of the evento property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the evento property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getEvento().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link TEvento }
   */
  public List<TEvento> getEvento() {
    if (evento == null) {
      evento = new ArrayList<TEvento>();
    }
    return this.evento;
  }

  public String getXmlns() {
    return xmlns;
  }

  public void setXmlns(String xmlns) {
    this.xmlns = xmlns;
  }

  /**
   * Obtém o valor da propriedade versao.
   *
   * @return possible object is {@link String }
   */
  public String getVersao() {
    return versao;
  }

  /**
   * Define o valor da propriedade versao.
   *
   * @param value allowed object is {@link String }
   */
  public void setVersao(String value) {
    this.versao = value;
  }
}
