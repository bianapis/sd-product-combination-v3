package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEmbeddedProductControlRetrieveOutputModelEmbeddedProductControlInstanceAnalysis
 */
public class BQEmbeddedProductControlRetrieveOutputModelEmbeddedProductControlInstanceAnalysis   {
  private Object embeddedProductControlInstanceAnalysisRecord = null;

  private String embeddedProductControlInstanceAnalysisReportType = null;

  private String embeddedProductControlInstanceAnalysisParameters = null;

  private Object embeddedProductControlInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return embeddedProductControlInstanceAnalysisRecord
  **/

  public Object getEmbeddedProductControlInstanceAnalysisRecord() {
    return embeddedProductControlInstanceAnalysisRecord;
  }

  public void setEmbeddedProductControlInstanceAnalysisRecord(Object embeddedProductControlInstanceAnalysisRecord) {
    this.embeddedProductControlInstanceAnalysisRecord = embeddedProductControlInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return embeddedProductControlInstanceAnalysisReportType
  **/

  public String getEmbeddedProductControlInstanceAnalysisReportType() {
    return embeddedProductControlInstanceAnalysisReportType;
  }

  public void setEmbeddedProductControlInstanceAnalysisReportType(String embeddedProductControlInstanceAnalysisReportType) {
    this.embeddedProductControlInstanceAnalysisReportType = embeddedProductControlInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return embeddedProductControlInstanceAnalysisParameters
  **/

  public String getEmbeddedProductControlInstanceAnalysisParameters() {
    return embeddedProductControlInstanceAnalysisParameters;
  }

  public void setEmbeddedProductControlInstanceAnalysisParameters(String embeddedProductControlInstanceAnalysisParameters) {
    this.embeddedProductControlInstanceAnalysisParameters = embeddedProductControlInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return embeddedProductControlInstanceAnalysisReport
  **/

  public Object getEmbeddedProductControlInstanceAnalysisReport() {
    return embeddedProductControlInstanceAnalysisReport;
  }

  public void setEmbeddedProductControlInstanceAnalysisReport(Object embeddedProductControlInstanceAnalysisReport) {
    this.embeddedProductControlInstanceAnalysisReport = embeddedProductControlInstanceAnalysisReport;
  }


}

