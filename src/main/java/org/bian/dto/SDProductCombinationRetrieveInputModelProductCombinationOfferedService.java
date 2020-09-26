package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductCombinationRetrieveInputModelProductCombinationOfferedServiceProductCombinationServiceRecord;

import javax.validation.Valid;
  
/**
 * SDProductCombinationRetrieveInputModelProductCombinationOfferedService
 */
public class SDProductCombinationRetrieveInputModelProductCombinationOfferedService   {
  private String productCombinationServiceReference = null;

  private SDProductCombinationRetrieveInputModelProductCombinationOfferedServiceProductCombinationServiceRecord productCombinationServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return productCombinationServiceReference
  **/

  public String getProductCombinationServiceReference() {
    return productCombinationServiceReference;
  }

  public void setProductCombinationServiceReference(String productCombinationServiceReference) {
    this.productCombinationServiceReference = productCombinationServiceReference;
  }


  /**
   * Get productCombinationServiceRecord
   * @return productCombinationServiceRecord
  **/

  public SDProductCombinationRetrieveInputModelProductCombinationOfferedServiceProductCombinationServiceRecord getProductCombinationServiceRecord() {
    return productCombinationServiceRecord;
  }

  public void setProductCombinationServiceRecord(SDProductCombinationRetrieveInputModelProductCombinationOfferedServiceProductCombinationServiceRecord productCombinationServiceRecord) {
    this.productCombinationServiceRecord = productCombinationServiceRecord;
  }


}

