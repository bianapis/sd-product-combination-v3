package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductCombinationActivateInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDProductCombinationActivateInputModelProductCombinationServiceConfigurationRecord
 */
public class SDProductCombinationActivateInputModelProductCombinationServiceConfigurationRecord   {
  private String productCombinationServiceConfigurationSettingReference = null;

  private String productCombinationServiceConfigurationSettingType = null;

  private SDProductCombinationActivateInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceConfigurationSetup productCombinationServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return productCombinationServiceConfigurationSettingReference
  **/

  public String getProductCombinationServiceConfigurationSettingReference() {
    return productCombinationServiceConfigurationSettingReference;
  }

  public void setProductCombinationServiceConfigurationSettingReference(String productCombinationServiceConfigurationSettingReference) {
    this.productCombinationServiceConfigurationSettingReference = productCombinationServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return productCombinationServiceConfigurationSettingType
  **/

  public String getProductCombinationServiceConfigurationSettingType() {
    return productCombinationServiceConfigurationSettingType;
  }

  public void setProductCombinationServiceConfigurationSettingType(String productCombinationServiceConfigurationSettingType) {
    this.productCombinationServiceConfigurationSettingType = productCombinationServiceConfigurationSettingType;
  }


  /**
   * Get productCombinationServiceConfigurationSetup
   * @return productCombinationServiceConfigurationSetup
  **/

  public SDProductCombinationActivateInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceConfigurationSetup getProductCombinationServiceConfigurationSetup() {
    return productCombinationServiceConfigurationSetup;
  }

  public void setProductCombinationServiceConfigurationSetup(SDProductCombinationActivateInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceConfigurationSetup productCombinationServiceConfigurationSetup) {
    this.productCombinationServiceConfigurationSetup = productCombinationServiceConfigurationSetup;
  }


}

