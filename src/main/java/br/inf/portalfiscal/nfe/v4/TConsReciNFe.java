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
 * Tipo Pedido de Consulta do Recido do Lote de Notas Fiscais Eletrônicas
 *
 * <p>Classe Java de TConsReciNFe complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType name="TConsReciNFe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/>
 *         &lt;element name="nRec" type="{http://www.portalfiscal.inf.br/nfe}TRec"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TVerNFe" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TConsReciNFe", namespace = "http://www.portalfiscal.inf.br/nfe", propOrder = {
    "tpAmb",
    "nRec"
})
@XmlRootElement(name = "consReciNFe", namespace = "http://www.portalfiscal.inf.br/nfe")
@EqualsAndHashCode
@ToString
public class TConsReciNFe {

  @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
  protected String tpAmb;
  @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
  protected String nRec;
  @XmlAttribute(name = "versao", required = true)
  protected String versao;
  @XmlAttribute(name = "xmlns", required = true)
  protected String xmlns;

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
   * Obtém o valor da propriedade nRec.
   *
   * @return possible object is {@link String }
   */
  public String getNRec() {
    return nRec;
  }

  /**
   * Define o valor da propriedade nRec.
   *
   * @param value allowed object is {@link String }
   */
  public void setNRec(String value) {
    this.nRec = value;
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
