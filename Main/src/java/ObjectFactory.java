//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.07 at 02:49:13 PM IST 
//

package in.gov.uidai.impl.dataportal.enrl_search_request;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the in.gov.uidai.server.model.enrl_search_request package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: in.gov.uidai.server.model.enrl_search_request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnrlSearchResponse }
     * 
     */
    public EnrlSearchResponse createEnrlSearchResponse() {
        return new EnrlSearchResponse();
    }

    /**
     * Create an instance of {@link EnrolmentRecord }
     * 
     */
    public EnrolmentRecord createEnrolmentRecord() {
        return new EnrolmentRecord();
    }

    /**
     * Create an instance of {@link Relation }
     * 
     */
    public Relation createRelation() {
        return new Relation();
    }

    /**
     * Create an instance of {@link ProcessingInfo }
     * 
     */
    public ProcessingInfo createProcessingInfo() {
        return new ProcessingInfo();
    }

    /**
     * Create an instance of {@link Demographics }
     * 
     */
    public Demographics createDemographics() {
        return new Demographics();
    }

}
