//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.15 at 07:13:19 PM IST 
//


package com.codenotfound.types.flightsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dteofjourney" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="flightname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fare" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "source",
    "destination",
    "dteofjourney",
    "flightname",
    "fare"
})
@XmlRootElement(name = "flightinfo")
public class Flightinfo {

    @XmlElement(required = true)
    protected String source;
    @XmlElement(required = true)
    protected String destination;
    @XmlElement(required = true)
    protected String dteofjourney;
    @XmlElement(required = true)
    protected String flightname;
    protected double fare;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the dteofjourney property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDteofjourney() {
        return dteofjourney;
    }

    /**
     * Sets the value of the dteofjourney property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDteofjourney(String value) {
        this.dteofjourney = value;
    }

    /**
     * Gets the value of the flightname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightname() {
        return flightname;
    }

    /**
     * Sets the value of the flightname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightname(String value) {
        this.flightname = value;
    }

    /**
     * Gets the value of the fare property.
     * 
     */
    public double getFare() {
        return fare;
    }

    /**
     * Sets the value of the fare property.
     * 
     */
    public void setFare(double value) {
        this.fare = value;
    }

}
