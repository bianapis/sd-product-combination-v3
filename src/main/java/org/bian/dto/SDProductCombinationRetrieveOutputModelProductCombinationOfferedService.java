package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductCombinationRetrieveOutputModelProductCombinationOfferedServiceProductCombinationServiceRecord;

import javax.validation.Valid;
  
/**
 * SDProductCombinationRetrieveOutputModelProductCombinationOfferedService
 */
public class SDProductCombinationRetrieveOutputModelProductCombinationOfferedService   {
  private String productCombinationServiceReference = null;

  private SDProductCombinationRetrieveOutputModelProductCombinationOfferedServiceProductCombinationServiceRecord productCombinationServiceRecord = null;


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

  public SDProductCombinationRetrieveOutputModelProductCombinationOfferedServiceProductCombinationServiceRecord getProductCombinationServiceRecord() {
    return productCombinationServiceRecord;
  }

  public void setProductCombinationServiceRecord(SDProductCombinationRetrieveOutputModelProductCombinationOfferedServiceProductCombinationServiceRecord productCombinationServiceRecord) {
    this.productCombinationServiceRecord = productCombinationServiceRecord;
  }


}

