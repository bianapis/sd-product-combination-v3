package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransferPricingRetrieveInputModelTransferPricingInstanceAnalysis;
import org.bian.dto.BQTransferPricingRetrieveInputModelTransferPricingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTransferPricingRetrieveInputModel
 */
public class BQTransferPricingRetrieveInputModel   {
  private Object transferPricingRetrieveActionTaskRecord = null;

  private String transferPricingRetrieveActionRequest = null;

  private BQTransferPricingRetrieveInputModelTransferPricingInstanceReport transferPricingInstanceReport = null;

  private BQTransferPricingRetrieveInputModelTransferPricingInstanceAnalysis transferPricingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return transferPricingRetrieveActionTaskRecord
  **/

  public Object getTransferPricingRetrieveActionTaskRecord() {
    return transferPricingRetrieveActionTaskRecord;
  }

  public void setTransferPricingRetrieveActionTaskRecord(Object transferPricingRetrieveActionTaskRecord) {
    this.transferPricingRetrieveActionTaskRecord = transferPricingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return transferPricingRetrieveActionRequest
  **/

  public String getTransferPricingRetrieveActionRequest() {
    return transferPricingRetrieveActionRequest;
  }

  public void setTransferPricingRetrieveActionRequest(String transferPricingRetrieveActionRequest) {
    this.transferPricingRetrieveActionRequest = transferPricingRetrieveActionRequest;
  }


  /**
   * Get transferPricingInstanceReport
   * @return transferPricingInstanceReport
  **/

  public BQTransferPricingRetrieveInputModelTransferPricingInstanceReport getTransferPricingInstanceReport() {
    return transferPricingInstanceReport;
  }

  public void setTransferPricingInstanceReport(BQTransferPricingRetrieveInputModelTransferPricingInstanceReport transferPricingInstanceReport) {
    this.transferPricingInstanceReport = transferPricingInstanceReport;
  }


  /**
   * Get transferPricingInstanceAnalysis
   * @return transferPricingInstanceAnalysis
  **/

  public BQTransferPricingRetrieveInputModelTransferPricingInstanceAnalysis getTransferPricingInstanceAnalysis() {
    return transferPricingInstanceAnalysis;
  }

  public void setTransferPricingInstanceAnalysis(BQTransferPricingRetrieveInputModelTransferPricingInstanceAnalysis transferPricingInstanceAnalysis) {
    this.transferPricingInstanceAnalysis = transferPricingInstanceAnalysis;
  }


}

