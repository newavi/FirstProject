
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.07 at 02:49:13 PM IST 
//


package in.gov.uidai.impl.dataportal.enrl_search_request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Demographics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Demographics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enrolment-number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enrolment-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dob-status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pincode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="po-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="po-type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="careof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="landmark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vtc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vtc-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sub-district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sub-district-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sub-district-local-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lang-code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="local-res-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="local-careof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="local-building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="local-street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="local-landmark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="local-locality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="local-vtc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="local-district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="local-state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="po-name-local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="information-sharing-consent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="residentPhoto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exceptionPhoto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCurrent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="updatedRefIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relation-info" type="{http://www.uidai.gov.in/server/model/enrl-search-request}Relation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Demographics", propOrder = {
    "eid",
    "name",
    "enrolmentNumber",
    "enrolmentDate",
    "gender",
    "dob",
    "dobStatus",
    "pincode",
    "poName",
    "poType",
    "careof",
    "building",
    "street",
    "landmark",
    "locality",
    "vtc",
    "vtcName",
    "district",
    "districtName",
    "subDistrict",
    "subDistrictName",
    "subDistrictLocalName",
    "state",
    "stateName",
    "mobile",
    "email",
    "langCode",
    "localResName",
    "localCareof",
    "localBuilding",
    "localStreet",
    "localLandmark",
    "localLocality",
    "localVtc",
    "localDistrict",
    "localState",
    "poNameLocal",
    "informationSharingConsent",
    "uid",
    "residentPhoto",
    "exceptionPhoto",
    "isCurrent",
    "updatedRefIds",
    "relationInfo"
})
public class Demographics {

    @XmlElement(required = true)
    protected String eid;
    protected String name;
    @XmlElement(name = "enrolment-number")
    protected String enrolmentNumber;
    @XmlElement(name = "enrolment-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enrolmentDate;
    protected String gender;
    @XmlSchemaType(name = "dateTime")
    protected String dob;
    @XmlElement(name = "dob-status")
    protected String dobStatus;
    protected String pincode;
    @XmlElement(name = "po-name")
    protected String poName;
    @XmlElement(name = "po-type")
    protected String poType;
    protected String careof;
    protected String building;
    protected String street;
    protected String landmark;
    protected String locality;
    protected String vtc;
    @XmlElement(name = "vtc-name")
    protected String vtcName;
    protected String district;
    @XmlElement(name = "district-name")
    protected String districtName;
    @XmlElement(name = "sub-district")
    protected String subDistrict;
    @XmlElement(name = "sub-district-name")
    protected String subDistrictName;
    @XmlElement(name = "sub-district-local-name")
    protected String subDistrictLocalName;
    protected String state;
    @XmlElement(name = "state-name")
    protected String stateName;
    protected String mobile;
    protected String email;
    @XmlElement(name = "lang-code")
    protected String langCode;
    @XmlElement(name = "local-res-name")
    protected String localResName;
    @XmlElement(name = "local-careof")
    protected String localCareof;
    @XmlElement(name = "local-building")
    protected String localBuilding;
    @XmlElement(name = "local-street")
    protected String localStreet;
    @XmlElement(name = "local-landmark")
    protected String localLandmark;
    @XmlElement(name = "local-locality")
    protected String localLocality;
    @XmlElement(name = "local-vtc")
    protected String localVtc;
    @XmlElement(name = "local-district")
    protected String localDistrict;
    @XmlElement(name = "local-state")
    protected String localState;
    @XmlElement(name = "po-name-local")
    protected String poNameLocal;
    @XmlElement(name = "information-sharing-consent")
    protected Boolean informationSharingConsent;
    protected String uid;
    protected String residentPhoto;
    protected String exceptionPhoto;
    protected Boolean isCurrent;
    protected List<String> updatedRefIds;
    @XmlElement(name = "relation-info", required = true)
    protected Relation relationInfo;

    /**
     * Gets the value of the eid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEid() {
        return eid;
    }

    /**
     * Sets the value of the eid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEid(String value) {
        this.eid = value;
    }

    /**
     * Gets the value of the name property.
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
     * Sets the value of the name property.
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
     * Gets the value of the enrolmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrolmentNumber() {
        return enrolmentNumber;
    }

    /**
     * Sets the value of the enrolmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrolmentNumber(String value) {
        this.enrolmentNumber = value;
    }

    /**
     * Gets the value of the enrolmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnrolmentDate() {
        return enrolmentDate;
    }

    /**
     * Sets the value of the enrolmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnrolmentDate(XMLGregorianCalendar value) {
        this.enrolmentDate = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDob(String value) {
        this.dob = value;
    }

    /**
     * Gets the value of the dobStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDobStatus() {
        return dobStatus;
    }

    /**
     * Sets the value of the dobStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDobStatus(String value) {
        this.dobStatus = value;
    }

    /**
     * Gets the value of the pincode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPincode() {
        return pincode;
    }

    /**
     * Sets the value of the pincode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPincode(String value) {
        this.pincode = value;
    }

    /**
     * Gets the value of the poName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoName() {
        return poName;
    }

    /**
     * Sets the value of the poName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoName(String value) {
        this.poName = value;
    }

    /**
     * Gets the value of the poType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoType() {
        return poType;
    }

    /**
     * Sets the value of the poType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoType(String value) {
        this.poType = value;
    }

    /**
     * Gets the value of the careof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareof() {
        return careof;
    }

    /**
     * Sets the value of the careof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareof(String value) {
        this.careof = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the landmark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandmark() {
        return landmark;
    }

    /**
     * Sets the value of the landmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandmark(String value) {
        this.landmark = value;
    }

    /**
     * Gets the value of the locality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocality(String value) {
        this.locality = value;
    }

    /**
     * Gets the value of the vtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVtc() {
        return vtc;
    }

    /**
     * Sets the value of the vtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVtc(String value) {
        this.vtc = value;
    }

    /**
     * Gets the value of the vtcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVtcName() {
        return vtcName;
    }

    /**
     * Sets the value of the vtcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVtcName(String value) {
        this.vtcName = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the districtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * Sets the value of the districtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictName(String value) {
        this.districtName = value;
    }

    /**
     * Gets the value of the subDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDistrict() {
        return subDistrict;
    }

    /**
     * Sets the value of the subDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDistrict(String value) {
        this.subDistrict = value;
    }

    /**
     * Gets the value of the subDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDistrictName() {
        return subDistrictName;
    }

    /**
     * Sets the value of the subDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDistrictName(String value) {
        this.subDistrictName = value;
    }

    /**
     * Gets the value of the subDistrictLocalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDistrictLocalName() {
        return subDistrictLocalName;
    }

    /**
     * Sets the value of the subDistrictLocalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDistrictLocalName(String value) {
        this.subDistrictLocalName = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the stateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * Sets the value of the stateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateName(String value) {
        this.stateName = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the langCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * Sets the value of the langCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangCode(String value) {
        this.langCode = value;
    }

    /**
     * Gets the value of the localResName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalResName() {
        return localResName;
    }

    /**
     * Sets the value of the localResName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalResName(String value) {
        this.localResName = value;
    }

    /**
     * Gets the value of the localCareof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCareof() {
        return localCareof;
    }

    /**
     * Sets the value of the localCareof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCareof(String value) {
        this.localCareof = value;
    }

    /**
     * Gets the value of the localBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalBuilding() {
        return localBuilding;
    }

    /**
     * Sets the value of the localBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalBuilding(String value) {
        this.localBuilding = value;
    }

    /**
     * Gets the value of the localStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalStreet() {
        return localStreet;
    }

    /**
     * Sets the value of the localStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalStreet(String value) {
        this.localStreet = value;
    }

    /**
     * Gets the value of the localLandmark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalLandmark() {
        return localLandmark;
    }

    /**
     * Sets the value of the localLandmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalLandmark(String value) {
        this.localLandmark = value;
    }

    /**
     * Gets the value of the localLocality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalLocality() {
        return localLocality;
    }

    /**
     * Sets the value of the localLocality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalLocality(String value) {
        this.localLocality = value;
    }

    /**
     * Gets the value of the localVtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalVtc() {
        return localVtc;
    }

    /**
     * Sets the value of the localVtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalVtc(String value) {
        this.localVtc = value;
    }

    /**
     * Gets the value of the localDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDistrict() {
        return localDistrict;
    }

    /**
     * Sets the value of the localDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDistrict(String value) {
        this.localDistrict = value;
    }

    /**
     * Gets the value of the localState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalState() {
        return localState;
    }

    /**
     * Sets the value of the localState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalState(String value) {
        this.localState = value;
    }

    /**
     * Gets the value of the poNameLocal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoNameLocal() {
        return poNameLocal;
    }

    /**
     * Sets the value of the poNameLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoNameLocal(String value) {
        this.poNameLocal = value;
    }

    /**
     * Gets the value of the informationSharingConsent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInformationSharingConsent() {
        return informationSharingConsent;
    }

    /**
     * Sets the value of the informationSharingConsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInformationSharingConsent(Boolean value) {
        this.informationSharingConsent = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the residentPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentPhoto() {
        return residentPhoto;
    }

    /**
     * Sets the value of the residentPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentPhoto(String value) {
        this.residentPhoto = value;
    }

    /**
     * Gets the value of the exceptionPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionPhoto() {
        return exceptionPhoto;
    }

    /**
     * Sets the value of the exceptionPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionPhoto(String value) {
        this.exceptionPhoto = value;
    }

    /**
     * Gets the value of the isCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCurrent() {
        return isCurrent;
    }

    /**
     * Sets the value of the isCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCurrent(Boolean value) {
        this.isCurrent = value;
    }

    /**
     * Gets the value of the updatedRefIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updatedRefIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdatedRefIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUpdatedRefIds() {
        if (updatedRefIds == null) {
            updatedRefIds = new ArrayList<String>();
        }
        return this.updatedRefIds;
    }

    /**
     * Gets the value of the relationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Relation }
     *     
     */
    public Relation getRelationInfo() {
        return relationInfo;
    }

    /**
     * Sets the value of the relationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Relation }
     *     
     */
    public void setRelationInfo(Relation value) {
        this.relationInfo = value;
    }

}
