package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductCombinationRetrieveOutputModelProductCombinationOfferedServiceProductCombinationServiceRecordProductCombinationServicePoliciesandGuidelines
 */
public class SDProductCombinationRetrieveOutputModelProductCombinationOfferedServiceProductCombinationServiceRecordProductCombinationServicePoliciesandGuidelines   {
  private String productCombinationServiceEligibility = null;

  private String productCombinationServiceIntendedUses = null;

  private String productCombinationServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return productCombinationServiceEligibility
  **/

  public String getProductCombinationServiceEligibility() {
    return productCombinationServiceEligibility;
  }

  public void setProductCombinationServiceEligibility(String productCombinationServiceEligibility) {
    this.productCombinationServiceEligibility = productCombinationServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return productCombinationServiceIntendedUses
  **/

  public String getProductCombinationServiceIntendedUses() {
    return productCombinationServiceIntendedUses;
  }

  public void setProductCombinationServiceIntendedUses(String productCombinationServiceIntendedUses) {
    this.productCombinationServiceIntendedUses = productCombinationServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return productCombinationServicePricingandTerms
  **/

  public String getProductCombinationServicePricingandTerms() {
    return productCombinationServicePricingandTerms;
  }

  public void setProductCombinationServicePricingandTerms(String productCombinationServicePricingandTerms) {
    this.productCombinationServicePricingandTerms = productCombinationServicePricingandTerms;
  }


}

