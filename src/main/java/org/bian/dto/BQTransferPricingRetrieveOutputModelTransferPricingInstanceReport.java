package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransferPricingRetrieveOutputModelTransferPricingInstanceReport
 */
public class BQTransferPricingRetrieveOutputModelTransferPricingInstanceReport   {
  private Object transferPricingInstanceReportRecord = null;

  private String transferPricingInstanceReportType = null;

  private String transferPricingInstanceReportParameters = null;

  private Object transferPricingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return transferPricingInstanceReportRecord
  **/

  public Object getTransferPricingInstanceReportRecord() {
    return transferPricingInstanceReportRecord;
  }

  public void setTransferPricingInstanceReportRecord(Object transferPricingInstanceReportRecord) {
    this.transferPricingInstanceReportRecord = transferPricingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return transferPricingInstanceReportType
  **/

  public String getTransferPricingInstanceReportType() {
    return transferPricingInstanceReportType;
  }

  public void setTransferPricingInstanceReportType(String transferPricingInstanceReportType) {
    this.transferPricingInstanceReportType = transferPricingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return transferPricingInstanceReportParameters
  **/

  public String getTransferPricingInstanceReportParameters() {
    return transferPricingInstanceReportParameters;
  }

  public void setTransferPricingInstanceReportParameters(String transferPricingInstanceReportParameters) {
    this.transferPricingInstanceReportParameters = transferPricingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return transferPricingInstanceReport
  **/

  public Object getTransferPricingInstanceReport() {
    return transferPricingInstanceReport;
  }

  public void setTransferPricingInstanceReport(Object transferPricingInstanceReport) {
    this.transferPricingInstanceReport = transferPricingInstanceReport;
  }


}

