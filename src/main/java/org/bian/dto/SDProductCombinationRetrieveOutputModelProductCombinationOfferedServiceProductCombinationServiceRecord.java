package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductCombinationRetrieveOutputModelProductCombinationOfferedServiceProductCombinationServiceRecordProductCombinationServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDProductCombinationRetrieveOutputModelProductCombinationOfferedServiceProductCombinationServiceRecord
 */
public class SDProductCombinationRetrieveOutputModelProductCombinationOfferedServiceProductCombinationServiceRecord   {
  private String productCombinationServiceType = null;

  private String productCombinationServiceVersion = null;

  private String productCombinationServiceDescription = null;

  private SDProductCombinationRetrieveOutputModelProductCombinationOfferedServiceProductCombinationServiceRecordProductCombinationServicePoliciesandGuidelines productCombinationServicePoliciesandGuidelines = null;

  private String productCombinationServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return productCombinationServiceType
  **/

  public String getProductCombinationServiceType() {
    return productCombinationServiceType;
  }

  public void setProductCombinationServiceType(String productCombinationServiceType) {
    this.productCombinationServiceType = productCombinationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return productCombinationServiceVersion
  **/

  public String getProductCombinationServiceVersion() {
    return productCombinationServiceVersion;
  }

  public void setProductCombinationServiceVersion(String productCombinationServiceVersion) {
    this.productCombinationServiceVersion = productCombinationServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return productCombinationServiceDescription
  **/

  public String getProductCombinationServiceDescription() {
    return productCombinationServiceDescription;
  }

  public void setProductCombinationServiceDescription(String productCombinationServiceDescription) {
    this.productCombinationServiceDescription = productCombinationServiceDescription;
  }


  /**
   * Get productCombinationServicePoliciesandGuidelines
   * @return productCombinationServicePoliciesandGuidelines
  **/

  public SDProductCombinationRetrieveOutputModelProductCombinationOfferedServiceProductCombinationServiceRecordProductCombinationServicePoliciesandGuidelines getProductCombinationServicePoliciesandGuidelines() {
    return productCombinationServicePoliciesandGuidelines;
  }

  public void setProductCombinationServicePoliciesandGuidelines(SDProductCombinationRetrieveOutputModelProductCombinationOfferedServiceProductCombinationServiceRecordProductCombinationServicePoliciesandGuidelines productCombinationServicePoliciesandGuidelines) {
    this.productCombinationServicePoliciesandGuidelines = productCombinationServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return productCombinationServiceSchedule
  **/

  public String getProductCombinationServiceSchedule() {
    return productCombinationServiceSchedule;
  }

  public void setProductCombinationServiceSchedule(String productCombinationServiceSchedule) {
    this.productCombinationServiceSchedule = productCombinationServiceSchedule;
  }


}

