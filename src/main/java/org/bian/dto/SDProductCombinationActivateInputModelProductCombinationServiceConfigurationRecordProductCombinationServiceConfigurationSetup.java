package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductCombinationActivateInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceConfigurationSetup
 */
public class SDProductCombinationActivateInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceConfigurationSetup   {
  private String productCombinationServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return productCombinationServiceConfigurationParameter
  **/

  public String getProductCombinationServiceConfigurationParameter() {
    return productCombinationServiceConfigurationParameter;
  }

  public void setProductCombinationServiceConfigurationParameter(String productCombinationServiceConfigurationParameter) {
    this.productCombinationServiceConfigurationParameter = productCombinationServiceConfigurationParameter;
  }


}

