//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.25 at 05:48:09 PM CEST 
//


package es.rickyepoderi.wbxml.bind.wvcsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creag",
    "delgr",
    "getgp",
    "setgp"
})
@XmlRootElement(name = "GroupMgmtFunc")
public class GroupMgmtFunc {

    @XmlElement(name = "CREAG")
    protected CREAG creag;
    @XmlElement(name = "DELGR")
    protected DELGR delgr;
    @XmlElement(name = "GETGP")
    protected GETGP getgp;
    @XmlElement(name = "SETGP")
    protected SETGP setgp;

    /**
     * Gets the value of the creag property.
     * 
     * @return
     *     possible object is
     *     {@link CREAG }
     *     
     */
    public CREAG getCREAG() {
        return creag;
    }

    /**
     * Sets the value of the creag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CREAG }
     *     
     */
    public void setCREAG(CREAG value) {
        this.creag = value;
    }

    /**
     * Gets the value of the delgr property.
     * 
     * @return
     *     possible object is
     *     {@link DELGR }
     *     
     */
    public DELGR getDELGR() {
        return delgr;
    }

    /**
     * Sets the value of the delgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DELGR }
     *     
     */
    public void setDELGR(DELGR value) {
        this.delgr = value;
    }

    /**
     * Gets the value of the getgp property.
     * 
     * @return
     *     possible object is
     *     {@link GETGP }
     *     
     */
    public GETGP getGETGP() {
        return getgp;
    }

    /**
     * Sets the value of the getgp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GETGP }
     *     
     */
    public void setGETGP(GETGP value) {
        this.getgp = value;
    }

    /**
     * Gets the value of the setgp property.
     * 
     * @return
     *     possible object is
     *     {@link SETGP }
     *     
     */
    public SETGP getSETGP() {
        return setgp;
    }

    /**
     * Sets the value of the setgp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SETGP }
     *     
     */
    public void setSETGP(SETGP value) {
        this.setgp = value;
    }

}
