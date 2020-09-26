package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceAgreement
 */
public class SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceAgreement   {
  private String productCombinationServiceAgreementReference = null;

  private String productCombinationServiceUserReference = null;

  private String productCombinationServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return productCombinationServiceAgreementReference
  **/

  public String getProductCombinationServiceAgreementReference() {
    return productCombinationServiceAgreementReference;
  }

  public void setProductCombinationServiceAgreementReference(String productCombinationServiceAgreementReference) {
    this.productCombinationServiceAgreementReference = productCombinationServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return productCombinationServiceUserReference
  **/

  public String getProductCombinationServiceUserReference() {
    return productCombinationServiceUserReference;
  }

  public void setProductCombinationServiceUserReference(String productCombinationServiceUserReference) {
    this.productCombinationServiceUserReference = productCombinationServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return productCombinationServiceAgreementTermsandConditions
  **/

  public String getProductCombinationServiceAgreementTermsandConditions() {
    return productCombinationServiceAgreementTermsandConditions;
  }

  public void setProductCombinationServiceAgreementTermsandConditions(String productCombinationServiceAgreementTermsandConditions) {
    this.productCombinationServiceAgreementTermsandConditions = productCombinationServiceAgreementTermsandConditions;
  }


}

