package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceSubscription
 */
public class SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceSubscription   {
  private String productCombinationServiceSubscriberReference = null;

  private String productCombinationServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return productCombinationServiceSubscriberReference
  **/

  public String getProductCombinationServiceSubscriberReference() {
    return productCombinationServiceSubscriberReference;
  }

  public void setProductCombinationServiceSubscriberReference(String productCombinationServiceSubscriberReference) {
    this.productCombinationServiceSubscriberReference = productCombinationServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return productCombinationServiceSubscriberAccessProfile
  **/

  public String getProductCombinationServiceSubscriberAccessProfile() {
    return productCombinationServiceSubscriberAccessProfile;
  }

  public void setProductCombinationServiceSubscriberAccessProfile(String productCombinationServiceSubscriberAccessProfile) {
    this.productCombinationServiceSubscriberAccessProfile = productCombinationServiceSubscriberAccessProfile;
  }


}

