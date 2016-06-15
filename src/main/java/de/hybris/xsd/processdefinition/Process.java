//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.06.15 alle 05:33:44 PM CEST 
//


package de.hybris.xsd.processdefinition;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextParameter" type="{http://www.hybris.de/xsd/processdefinition}contextParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.hybris.de/xsd/processdefinition}nodes" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.hybris.de/xsd/processdefinition}name" />
 *       &lt;attribute name="start" use="required" type="{http://www.hybris.de/xsd/processdefinition}name" />
 *       &lt;attribute name="onError" type="{http://www.hybris.de/xsd/processdefinition}name" />
 *       &lt;attribute name="processClass" type="{http://www.hybris.de/xsd/processdefinition}name" default="de.hybris.platform.processengine.model.BusinessProcessModel" />
 *       &lt;attribute name="defaultNodeGroup" type="{http://www.hybris.de/xsd/processdefinition}name" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contextParameter",
    "nodes"
})
@XmlRootElement(name = "process")
public class Process {

    protected List<ContextParameter> contextParameter;
    @XmlElements({
        @XmlElement(name = "action", type = Action.class),
        @XmlElement(name = "scriptAction", type = ScriptAction.class),
        @XmlElement(name = "split", type = Split.class),
        @XmlElement(name = "wait", type = Wait.class),
        @XmlElement(name = "end", type = End.class),
        @XmlElement(name = "join", type = Join.class),
        @XmlElement(name = "notify", type = Notify.class)
    })
    protected List<Object> nodes;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "start", required = true)
    protected String start;
    @XmlAttribute(name = "onError")
    protected String onError;
    @XmlAttribute(name = "processClass")
    protected String processClass;
    @XmlAttribute(name = "defaultNodeGroup")
    protected String defaultNodeGroup;

    /**
     * Gets the value of the contextParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contextParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContextParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextParameter }
     * 
     * 
     */
    public List<ContextParameter> getContextParameter() {
        if (contextParameter == null) {
            contextParameter = new ArrayList<ContextParameter>();
        }
        return this.contextParameter;
    }

    /**
     * Gets the value of the nodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action }
     * {@link ScriptAction }
     * {@link Split }
     * {@link Wait }
     * {@link End }
     * {@link Join }
     * {@link Notify }
     * 
     * 
     */
    public List<Object> getNodes() {
        if (nodes == null) {
            nodes = new ArrayList<Object>();
        }
        return this.nodes;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà start.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * Imposta il valore della proprietà start.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * Recupera il valore della proprietà onError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnError() {
        return onError;
    }

    /**
     * Imposta il valore della proprietà onError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnError(String value) {
        this.onError = value;
    }

    /**
     * Recupera il valore della proprietà processClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessClass() {
        if (processClass == null) {
            return "de.hybris.platform.processengine.model.BusinessProcessModel";
        } else {
            return processClass;
        }
    }

    /**
     * Imposta il valore della proprietà processClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessClass(String value) {
        this.processClass = value;
    }

    /**
     * Recupera il valore della proprietà defaultNodeGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultNodeGroup() {
        return defaultNodeGroup;
    }

    /**
     * Imposta il valore della proprietà defaultNodeGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultNodeGroup(String value) {
        this.defaultNodeGroup = value;
    }

}
