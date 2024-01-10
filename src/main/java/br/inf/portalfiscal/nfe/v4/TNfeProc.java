//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.26 às 12:30:05 PM BRT 
//


package br.inf.portalfiscal.nfe.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * Tipo da NF-e processada
 *
 * <p>Classe Java de TNfeProc complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType name="TNfeProc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NFe" type="{http://www.portalfiscal.inf.br/nfe}TNFe"/>
 *         &lt;element name="protNFe" type="{http://www.portalfiscal.inf.br/nfe}TProtNFe"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TVerNFe" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNfeProc", namespace = "http://www.portalfiscal.inf.br/nfe", propOrder = {
    "nFe",
    "protNFe"
})
@XmlRootElement(name = "nfeProc", namespace = "http://www.portalfiscal.inf.br/nfe")
@EqualsAndHashCode
@ToString
public class TNfeProc {

  @XmlElement(name = "NFe", namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
  protected TNFe nFe;
  @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
  protected TProtNFe protNFe;
  @XmlAttribute(name = "versao", required = true)
  protected String versao;
  @XmlAttribute(name = "xmlns", required = false)
  protected String xmlns;

  /**
   * Obtém o valor da propriedade nFe.
   *
   * @return possible object is {@link TNFe }
   */
  public TNFe getNFe() {
    return nFe;
  }

  /**
   * Define o valor da propriedade nFe.
   *
   * @param value allowed object is {@link TNFe }
   */
  public void setNFe(TNFe value) {
    this.nFe = value;
  }

  /**
   * Obtém o valor da propriedade protNFe.
   *
   * @return possible object is {@link TProtNFe }
   */
  public TProtNFe getProtNFe() {
    return protNFe;
  }

  /**
   * Define o valor da propriedade protNFe.
   *
   * @param value allowed object is {@link TProtNFe }
   */
  public void setProtNFe(TProtNFe value) {
    this.protNFe = value;
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

  /**
   * Obtém o valor da propriedade xmlns.
   *
   * @return possible object is {@link String }
   */
  public String getXmlns() {
    return xmlns;
  }

  /**
   * Define o valor da propriedade xmlns.
   *
   * @param value allowed object is {@link String }
   */
  public void setXmlns(String value) {
    this.xmlns = value;
  }
}
