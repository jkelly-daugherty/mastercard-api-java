//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.18 at 10:46:38 PM CST 
//


package com.mastercard.api.fraud.merchant.v1.domain.factory;

import com.mastercard.api.fraud.merchant.v1.domain.AddressType;
import com.mastercard.api.fraud.merchant.v1.domain.DriversLicenseType;
import com.mastercard.api.fraud.merchant.v1.domain.MerchantMatchType;
import com.mastercard.api.fraud.merchant.v1.domain.MerchantType;
import com.mastercard.api.fraud.merchant.v1.domain.PrincipalMatchType;
import com.mastercard.api.fraud.merchant.v1.domain.PrincipalType;
import com.mastercard.api.fraud.merchant.v1.domain.TerminatedMerchantType;
import com.mastercard.api.fraud.merchant.v1.domain.TerminationInquiry;
import com.mastercard.api.fraud.merchant.v1.domain.TerminationInquiryRequest;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mastercard.api.fraud.merchant.v1.domain package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mastercard.api.fraud.merchant.v1.domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MerchantMatchType }
     * 
     */
    public MerchantMatchType createMerchantMatchType() {
        return new MerchantMatchType();
    }

    /**
     * Create an instance of {@link TerminationInquiry }
     * 
     */
    public TerminationInquiry createTerminationInquiry() {
        return new TerminationInquiry();
    }

    /**
     * Create an instance of {@link DriversLicenseType }
     * 
     */
    public DriversLicenseType createDriversLicenseType() {
        return new DriversLicenseType();
    }

    /**
     * Create an instance of {@link PrincipalType }
     * 
     */
    public PrincipalType createPrincipalType() {
        PrincipalType principalType = new PrincipalType();
        principalType.setAddress(createAddressType());
        principalType.setDriversLicense(createDriversLicenseType());
        return principalType;
    }

    /**
     * Create an instance of {@link TerminationInquiryRequest }
     * 
     */
    public TerminationInquiryRequest createTerminationInquiryRequest() {
        TerminationInquiryRequest terminationInquiryRequest = new TerminationInquiryRequest();
        terminationInquiryRequest.setMerchant(createMerchantType());
        return terminationInquiryRequest;
    }

    /**
     * Create an instance of {@link MerchantType }
     * 
     */
    public MerchantType createMerchantType() {
        MerchantType merchantType = new MerchantType();
        merchantType.setAddress(createAddressType());
        return merchantType;
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link PrincipalMatchType }
     * 
     */
    public PrincipalMatchType createPrincipalMatchType() {
        return new PrincipalMatchType();
    }

    /**
     * Create an instance of {@link TerminatedMerchantType }
     * 
     */
    public TerminatedMerchantType createTerminatedMerchantType() {
        return new TerminatedMerchantType();
    }

}