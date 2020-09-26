package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransferPricingRetrieveOutputModelTransferPricingInstanceAnalysis
 */
public class BQTransferPricingRetrieveOutputModelTransferPricingInstanceAnalysis   {
  private Object transferPricingInstanceAnalysisRecord = null;

  private String transferPricingInstanceAnalysisReportType = null;

  private String transferPricingInstanceAnalysisParameters = null;

  private Object transferPricingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return transferPricingInstanceAnalysisRecord
  **/

  public Object getTransferPricingInstanceAnalysisRecord() {
    return transferPricingInstanceAnalysisRecord;
  }

  public void setTransferPricingInstanceAnalysisRecord(Object transferPricingInstanceAnalysisRecord) {
    this.transferPricingInstanceAnalysisRecord = transferPricingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return transferPricingInstanceAnalysisReportType
  **/

  public String getTransferPricingInstanceAnalysisReportType() {
    return transferPricingInstanceAnalysisReportType;
  }

  public void setTransferPricingInstanceAnalysisReportType(String transferPricingInstanceAnalysisReportType) {
    this.transferPricingInstanceAnalysisReportType = transferPricingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return transferPricingInstanceAnalysisParameters
  **/

  public String getTransferPricingInstanceAnalysisParameters() {
    return transferPricingInstanceAnalysisParameters;
  }

  public void setTransferPricingInstanceAnalysisParameters(String transferPricingInstanceAnalysisParameters) {
    this.transferPricingInstanceAnalysisParameters = transferPricingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return transferPricingInstanceAnalysisReport
  **/

  public Object getTransferPricingInstanceAnalysisReport() {
    return transferPricingInstanceAnalysisReport;
  }

  public void setTransferPricingInstanceAnalysisReport(Object transferPricingInstanceAnalysisReport) {
    this.transferPricingInstanceAnalysisReport = transferPricingInstanceAnalysisReport;
  }


}

