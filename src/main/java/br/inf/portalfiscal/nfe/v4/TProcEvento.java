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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * Tipo procEvento
 * 
 * <p>Classe Java de TProcEvento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TProcEvento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="evento" type="{http://www.portalfiscal.inf.br/nfe}TEvento"/&gt;
 *         &lt;element name="retEvento" type="{http://www.portalfiscal.inf.br/nfe}TRetEvento"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TVerEvento" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TProcEvento", propOrder = {
    "evento",
    "retEvento"
})
@XmlRootElement(name = "procEvento", namespace = "http://www.portalfiscal.inf.br/nfe")
@EqualsAndHashCode
@ToString
public class TProcEvento {

    @XmlElement(required = true)
    protected TEvento evento;
    @XmlElement(required = true)
    protected TRetEvento retEvento;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    @XmlAttribute(name = "xmlns", required = false)
    protected String xmlns;

    /**
     * Obtém o valor da propriedade evento.
     * 
     * @return
     *     possible object is
     *     {@link TEvento }
     *     
     */
    public TEvento getEvento() {
        return evento;
    }

    /**
     * Define o valor da propriedade evento.
     * 
     * @param value
     *     allowed object is
     *     {@link TEvento }
     *     
     */
    public void setEvento(TEvento value) {
        this.evento = value;
    }

    /**
     * Obtém o valor da propriedade retEvento.
     * 
     * @return
     *     possible object is
     *     {@link TRetEvento }
     *     
     */
    public TRetEvento getRetEvento() {
        return retEvento;
    }

    /**
     * Define o valor da propriedade retEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link TRetEvento }
     *     
     */
    public void setRetEvento(TRetEvento value) {
        this.retEvento = value;
    }

    /**
     * Obtém o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }
}
