//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v2.3.4 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.14 às 03:43:35 PM BRT
//


package br.inf.portalfiscal.nfe.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.w3._2000._09.xmldsig_.SignatureType;


/**
 * Tipo Evento
 *
 * <p>Classe Java de TEvento complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType name="TEvento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infEvento"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="cOrgao" type="{http://www.portalfiscal.inf.br/nfe}TCOrgaoIBGE"/&gt;
 *                   &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpjOpc"/&gt;
 *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/&gt;
 *                   &lt;element name="dhEvento" type="{http://www.portalfiscal.inf.br/nfe}TDateTimeUTC"/&gt;
 *                   &lt;element name="tpEvento"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;pattern value="[0-9]{6}"/&gt;
 *                         &lt;enumeration value="110111"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="nSeqEvento"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;pattern value="[1-9]|[1][0-9]{0,1}|20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="verEvento"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;enumeration value="1.00"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="detEvento"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="descEvento"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                   &lt;enumeration value="Cancelamento"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="nProt" type="{http://www.portalfiscal.inf.br/nfe}TProt"/&gt;
 *                             &lt;element name="xJust" type="{http://www.portalfiscal.inf.br/nfe}TJust"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="versao" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;enumeration value="1.00"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Id" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID"&gt;
 *                       &lt;pattern value="ID[0-9]{52}"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TVerEvento" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEvento", propOrder = {
    "infEvento",
    "signature"
})
@XmlRootElement(name = "evento", namespace = "http://www.portalfiscal.inf.br/nfe")
@EqualsAndHashCode
@ToString
public class TEvento {

  @XmlElement(required = true)
  protected InfEvento infEvento;
  @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
  protected SignatureType signature;
  @XmlAttribute(name = "versao", required = true)
  protected String versao;

  /**
   * Obtém o valor da propriedade infEvento.
   *
   * @return possible object is {@link InfEvento }
   */
  public InfEvento getInfEvento() {
    return infEvento;
  }

  /**
   * Define o valor da propriedade infEvento.
   *
   * @param value allowed object is {@link InfEvento }
   */
  public void setInfEvento(InfEvento value) {
    this.infEvento = value;
  }

  /**
   * Obtém o valor da propriedade signature.
   *
   * @return possible object is {@link SignatureType }
   */
  public SignatureType getSignature() {
    return signature;
  }

  /**
   * Define o valor da propriedade signature.
   *
   * @param value allowed object is {@link SignatureType }
   */
  public void setSignature(SignatureType value) {
    this.signature = value;
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
   * <p>Classe Java de anonymous complex type.
   *
   * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
   *
   * <pre>
   * &lt;complexType&gt;
   *   &lt;complexContent&gt;
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *       &lt;sequence&gt;
   *         &lt;element name="cOrgao" type="{http://www.portalfiscal.inf.br/nfe}TCOrgaoIBGE"/&gt;
   *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/&gt;
   *         &lt;choice&gt;
   *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpjOpc"/&gt;
   *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/&gt;
   *         &lt;/choice&gt;
   *         &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/&gt;
   *         &lt;element name="dhEvento" type="{http://www.portalfiscal.inf.br/nfe}TDateTimeUTC"/&gt;
   *         &lt;element name="tpEvento"&gt;
   *           &lt;simpleType&gt;
   *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
   *               &lt;whiteSpace value="preserve"/&gt;
   *               &lt;pattern value="[0-9]{6}"/&gt;
   *               &lt;enumeration value="110111"/&gt;
   *             &lt;/restriction&gt;
   *           &lt;/simpleType&gt;
   *         &lt;/element&gt;
   *         &lt;element name="nSeqEvento"&gt;
   *           &lt;simpleType&gt;
   *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
   *               &lt;whiteSpace value="preserve"/&gt;
   *               &lt;pattern value="[1-9]|[1][0-9]{0,1}|20"/&gt;
   *             &lt;/restriction&gt;
   *           &lt;/simpleType&gt;
   *         &lt;/element&gt;
   *         &lt;element name="verEvento"&gt;
   *           &lt;simpleType&gt;
   *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
   *               &lt;whiteSpace value="preserve"/&gt;
   *               &lt;enumeration value="1.00"/&gt;
   *             &lt;/restriction&gt;
   *           &lt;/simpleType&gt;
   *         &lt;/element&gt;
   *         &lt;element name="detEvento"&gt;
   *           &lt;complexType&gt;
   *             &lt;complexContent&gt;
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
   *                 &lt;sequence&gt;
   *                   &lt;element name="descEvento"&gt;
   *                     &lt;simpleType&gt;
   *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
   *                         &lt;whiteSpace value="preserve"/&gt;
   *                         &lt;enumeration value="Cancelamento"/&gt;
   *                       &lt;/restriction&gt;
   *                     &lt;/simpleType&gt;
   *                   &lt;/element&gt;
   *                   &lt;element name="nProt" type="{http://www.portalfiscal.inf.br/nfe}TProt"/&gt;
   *                   &lt;element name="xJust" type="{http://www.portalfiscal.inf.br/nfe}TJust"/&gt;
   *                 &lt;/sequence&gt;
   *                 &lt;attribute name="versao" use="required"&gt;
   *                   &lt;simpleType&gt;
   *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
   *                       &lt;whiteSpace value="preserve"/&gt;
   *                       &lt;enumeration value="1.00"/&gt;
   *                     &lt;/restriction&gt;
   *                   &lt;/simpleType&gt;
   *                 &lt;/attribute&gt;
   *               &lt;/restriction&gt;
   *             &lt;/complexContent&gt;
   *           &lt;/complexType&gt;
   *         &lt;/element&gt;
   *       &lt;/sequence&gt;
   *       &lt;attribute name="Id" use="required"&gt;
   *         &lt;simpleType&gt;
   *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID"&gt;
   *             &lt;pattern value="ID[0-9]{52}"/&gt;
   *           &lt;/restriction&gt;
   *         &lt;/simpleType&gt;
   *       &lt;/attribute&gt;
   *     &lt;/restriction&gt;
   *   &lt;/complexContent&gt;
   * &lt;/complexType&gt;
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "cOrgao",
      "tpAmb",
      "cnpj",
      "cpf",
      "chNFe",
      "dhEvento",
      "tpEvento",
      "nSeqEvento",
      "verEvento",
      "detEvento"
  })
  public static class InfEvento {

    @XmlElement(required = true)
    protected String cOrgao;
    @XmlElement(required = true)
    protected String tpAmb;
    @XmlElement(name = "CNPJ")
    protected String cnpj;
    @XmlElement(name = "CPF")
    protected String cpf;
    @XmlElement(required = true)
    protected String chNFe;
    @XmlElement(required = true)
    protected String dhEvento;
    @XmlElement(required = true)
    protected String tpEvento;
    @XmlElement(required = true)
    protected String nSeqEvento;
    @XmlElement(required = true)
    protected String verEvento;
    @XmlElement(required = true)
    protected DetEvento detEvento;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Obtém o valor da propriedade cOrgao.
     *
     * @return possible object is {@link String }
     */
    public String getCOrgao() {
      return cOrgao;
    }

    /**
     * Define o valor da propriedade cOrgao.
     *
     * @param value allowed object is {@link String }
     */
    public void setCOrgao(String value) {
      this.cOrgao = value;
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
     * Obtém o valor da propriedade cnpj.
     *
     * @return possible object is {@link String }
     */
    public String getCNPJ() {
      return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     *
     * @param value allowed object is {@link String }
     */
    public void setCNPJ(String value) {
      this.cnpj = value;
    }

    /**
     * Obtém o valor da propriedade cpf.
     *
     * @return possible object is {@link String }
     */
    public String getCPF() {
      return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     *
     * @param value allowed object is {@link String }
     */
    public void setCPF(String value) {
      this.cpf = value;
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
     * Obtém o valor da propriedade dhEvento.
     *
     * @return possible object is {@link String }
     */
    public String getDhEvento() {
      return dhEvento;
    }

    /**
     * Define o valor da propriedade dhEvento.
     *
     * @param value allowed object is {@link String }
     */
    public void setDhEvento(String value) {
      this.dhEvento = value;
    }

    /**
     * Obtém o valor da propriedade tpEvento.
     *
     * @return possible object is {@link String }
     */
    public String getTpEvento() {
      return tpEvento;
    }

    /**
     * Define o valor da propriedade tpEvento.
     *
     * @param value allowed object is {@link String }
     */
    public void setTpEvento(String value) {
      this.tpEvento = value;
    }

    /**
     * Obtém o valor da propriedade nSeqEvento.
     *
     * @return possible object is {@link String }
     */
    public String getNSeqEvento() {
      return nSeqEvento;
    }

    /**
     * Define o valor da propriedade nSeqEvento.
     *
     * @param value allowed object is {@link String }
     */
    public void setNSeqEvento(String value) {
      this.nSeqEvento = value;
    }

    /**
     * Obtém o valor da propriedade verEvento.
     *
     * @return possible object is {@link String }
     */
    public String getVerEvento() {
      return verEvento;
    }

    /**
     * Define o valor da propriedade verEvento.
     *
     * @param value allowed object is {@link String }
     */
    public void setVerEvento(String value) {
      this.verEvento = value;
    }

    /**
     * Obtém o valor da propriedade detEvento.
     *
     * @return possible object is {@link DetEvento }
     */
    public DetEvento getDetEvento() {
      return detEvento;
    }

    /**
     * Define o valor da propriedade detEvento.
     *
     * @param value allowed object is {@link DetEvento }
     */
    public void setDetEvento(DetEvento value) {
      this.detEvento = value;
    }

    /**
     * Obtém o valor da propriedade id.
     *
     * @return possible object is {@link String }
     */
    public String getId() {
      return id;
    }

    /**
     * Define o valor da propriedade id.
     *
     * @param value allowed object is {@link String }
     */
    public void setId(String value) {
      this.id = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     *
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta
     * classe.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="descEvento"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *               &lt;enumeration value="Cancelamento"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="nProt" type="{http://www.portalfiscal.inf.br/nfe}TProt"/&gt;
     *         &lt;element name="xJust" type="{http://www.portalfiscal.inf.br/nfe}TJust"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="versao" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;whiteSpace value="preserve"/&gt;
     *             &lt;enumeration value="1.00"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "descEvento",
        "cOrgaoAutor",
        "tpAutor",
        "verAplic",
        "nProt",
        "xJust",
        "chNFeRef"
    })
    public static class DetEvento {

      @XmlElement(required = true)
      protected String descEvento;
      @XmlElement(required = true)
      protected String nProt;
      @XmlElement(required = true)
      protected String xJust;
      @XmlAttribute(name = "versao", required = true)
      protected String versao;
      @XmlElement(name = "cOrgaoAutor")
      protected String cOrgaoAutor;
      @XmlElement(name = "tpAutor")
      protected String tpAutor;
      @XmlElement(name = "verAplic")
      protected String verAplic;
      @XmlElement(name = "chNFeRef")
      protected String chNFeRef;

      /**
       * Obtém o valor da propriedade cOrgaoAutor.
       *
       * @return possible object is {@link String }
       */
      public String getcOrgaoAutor() {
        return cOrgaoAutor;
      }

      /**
       * Define o valor da propriedade cOrgaoAutor.
       *
       * @param value allowed object is {@link String }
       */
      public void setcOrgaoAutor(String cOrgaoAutor) {
        this.cOrgaoAutor = cOrgaoAutor;
      }

      /**
       * Obtém o valor da propriedade tpAutor.
       *
       * @return possible object is {@link String }
       */
      public String getTpAutor() {
        return tpAutor;
      }

      /**
       * Define o valor da propriedade tpAutor.
       *
       * @param value allowed object is {@link String }
       */
      public void setTpAutor(String tpAutor) {
        this.tpAutor = tpAutor;
      }

      /**
       * Obtém o valor da propriedade verAplic.
       *
       * @return possible object is {@link String }
       */
      public String getVerAplic() {
        return verAplic;
      }

      /**
       * Define o valor da propriedade verAplic.
       *
       * @param value allowed object is {@link String }
       */
      public void setVerAplic(String verAplic) {
        this.verAplic = verAplic;
      }

      /**
       * Obtém o valor da propriedade chNFeRef.
       *
       * @return possible object is {@link String }
       */
      public String getChNFeRef() {
        return chNFeRef;
      }

      /**
       * Define o valor da propriedade chNFeRef.
       *
       * @param value allowed object is {@link String }
       */
      public void setChNFeRef(String chNFeRef) {
        this.chNFeRef = chNFeRef;
      }

      /**
       * Obtém o valor da propriedade descEvento.
       *
       * @return possible object is {@link String }
       */
      public String getDescEvento() {
        return descEvento;
      }

      /**
       * Define o valor da propriedade descEvento.
       *
       * @param value allowed object is {@link String }
       */
      public void setDescEvento(String value) {
        this.descEvento = value;
      }

      /**
       * Obtém o valor da propriedade nProt.
       *
       * @return possible object is {@link String }
       */
      public String getNProt() {
        return nProt;
      }

      /**
       * Define o valor da propriedade nProt.
       *
       * @param value allowed object is {@link String }
       */
      public void setNProt(String value) {
        this.nProt = value;
      }

      /**
       * Obtém o valor da propriedade xJust.
       *
       * @return possible object is {@link String }
       */
      public String getXJust() {
        return xJust;
      }

      /**
       * Define o valor da propriedade xJust.
       *
       * @param value allowed object is {@link String }
       */
      public void setXJust(String value) {
        this.xJust = value;
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

  }

}
