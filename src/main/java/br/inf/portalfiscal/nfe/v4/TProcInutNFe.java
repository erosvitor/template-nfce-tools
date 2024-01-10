package br.inf.portalfiscal.nfe.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TProcInutNFe", propOrder = {
    "inutNFe",
    "retInutNFe"
})
@XmlRootElement(name = "procInutNFe", namespace = "http://www.portalfiscal.inf.br/nfe")
@EqualsAndHashCode
@ToString
public class TProcInutNFe {

  @XmlElement(required = true)
  protected TInutNFe inutNFe;
  @XmlElement(required = true)
  protected TRetInutNFe retInutNFe;
  @XmlAttribute(name = "versao", required = true)
  protected String versao;

  @XmlAttribute(name = "xmlns", required = false)
  protected String xmlns;

  public TInutNFe getInutNFe() {
    return inutNFe;
  }

  public void setInutNFe(TInutNFe inutNFe) {
    this.inutNFe = inutNFe;
  }

  public TRetInutNFe getRetInutNFe() {
    return retInutNFe;
  }

  public void setRetInutNFe(TRetInutNFe retInutNFe) {
    this.retInutNFe = retInutNFe;
  }

  public String getVersao() {
    return versao;
  }

  public void setVersao(String versao) {
    this.versao = versao;
  }

  public String getXmlns() {
    return xmlns;
  }

  public void setXmlns(String xmlns) {
    this.xmlns = xmlns;
  }
}
