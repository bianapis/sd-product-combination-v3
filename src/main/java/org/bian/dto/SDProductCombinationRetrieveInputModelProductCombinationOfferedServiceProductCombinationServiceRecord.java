package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductCombinationRetrieveInputModelProductCombinationOfferedServiceProductCombinationServiceRecord
 */
public class SDProductCombinationRetrieveInputModelProductCombinationOfferedServiceProductCombinationServiceRecord   {
  private String productCombinationServiceVersion = null;


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


}

