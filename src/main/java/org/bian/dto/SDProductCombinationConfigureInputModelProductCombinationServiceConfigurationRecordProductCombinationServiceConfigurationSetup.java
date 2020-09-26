package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceConfigurationSetup
 */
public class SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceConfigurationSetup   {
  private String productCombinationServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return productCombinationServiceConfigurationParameter
  **/

  public String getProductCombinationServiceConfigurationParameter() {
    return productCombinationServiceConfigurationParameter;
  }

  public void setProductCombinationServiceConfigurationParameter(String productCombinationServiceConfigurationParameter) {
    this.productCombinationServiceConfigurationParameter = productCombinationServiceConfigurationParameter;
  }


}

