package br.inf.portalfiscal.nfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfProt", propOrder = {
    "dhRecbto",
    "nProt"
})
public class InfProt {

  @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
  protected String dhRecbto;
  @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
  protected String nProt;
}