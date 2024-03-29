//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v2.3.4 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.10.07 às 12:06:08 PM BRT 
//


package br.inf.portalfiscal.nfe.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Pedido de Consulta da Situação Atual da Nota Fiscal Eletrônica
 *
 * <p>Classe Java de TConsSitNFe complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType name="TConsSitNFe"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/&gt;
 *         &lt;element name="xServ"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TServ"&gt;
 *               &lt;enumeration value="CONSULTAR"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TVerConsSitNFe" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TConsSitNFe", propOrder = {
    "tpAmb",
    "xServ",
    "chNFe"
})
@XmlRootElement(name = "consSitNFe", namespace = "http://www.portalfiscal.inf.br/nfe")
public class TConsSitNFe {

  @XmlElement(required = true)
  protected String tpAmb;
  @XmlElement(required = true)
  protected String xServ;
  @XmlElement(required = true)
  protected String chNFe;
  @XmlAttribute(name = "versao", required = true)
  protected String versao;
  @XmlAttribute(name = "xmlns", required = false)
  protected String xmlns;

  public String getXmlns() {
    return xmlns;
  }

  public void setXmlns(String xmlns) {
    this.xmlns = xmlns;
  }

  /**
   * Obtém o valor da propriedade tpAmb.
   *
   * @return possible object is {@link String }
   */
  public String getTpAmb() {
    return tpAmb;
  }

  /**
   * Define o valor da propriedade tpAmb.
   *
   * @param value allowed object is {@link String }
   */
  public void setTpAmb(String value) {
    this.tpAmb = value;
  }

  /**
   * Obtém o valor da propriedade xServ.
   *
   * @return possible object is {@link String }
   */
  public String getXServ() {
    return xServ;
  }

  /**
   * Define o valor da propriedade xServ.
   *
   * @param value allowed object is {@link String }
   */
  public void setXServ(String value) {
    this.xServ = value;
  }

  /**
   * Obtém o valor da propriedade chNFe.
   *
   * @return possible object is {@link String }
   */
  public String getChNFe() {
    return chNFe;
  }

  /**
   * Define o valor da propriedade chNFe.
   *
   * @param value allowed object is {@link String }
   */
  public void setChNFe(String value) {
    this.chNFe = value;
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
