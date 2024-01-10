package br.inf.portalfiscal.nfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNfeProc", namespace = "http://www.portalfiscal.inf.br/nfe", propOrder = {
    "protNFe"
})
@XmlRootElement(name = "nfeProc", namespace = "http://www.portalfiscal.inf.br/nfe")
public class TNfeProc {

  @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
  protected TProtNFe protNFe;
}