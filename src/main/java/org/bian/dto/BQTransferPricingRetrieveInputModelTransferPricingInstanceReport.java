package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransferPricingRetrieveInputModelTransferPricingInstanceReport
 */
public class BQTransferPricingRetrieveInputModelTransferPricingInstanceReport   {
  private String transferPricingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return transferPricingInstanceReportReference
  **/

  public String getTransferPricingInstanceReportReference() {
    return transferPricingInstanceReportReference;
  }

  public void setTransferPricingInstanceReportReference(String transferPricingInstanceReportReference) {
    this.transferPricingInstanceReportReference = transferPricingInstanceReportReference;
  }


}

