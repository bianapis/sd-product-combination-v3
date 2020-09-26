package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCombinationArrangementRetrieveOutputModelProductCombinationArrangementInstanceAnalysis
 */
public class CRProductCombinationArrangementRetrieveOutputModelProductCombinationArrangementInstanceAnalysis   {
  private String productCombinationArrangementInstanceAnalysisData = null;

  private String productCombinationArrangementInstanceAnalysisReportType = null;

  private Object productCombinationArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productCombinationArrangementInstanceAnalysisData
  **/

  public String getProductCombinationArrangementInstanceAnalysisData() {
    return productCombinationArrangementInstanceAnalysisData;
  }

  public void setProductCombinationArrangementInstanceAnalysisData(String productCombinationArrangementInstanceAnalysisData) {
    this.productCombinationArrangementInstanceAnalysisData = productCombinationArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productCombinationArrangementInstanceAnalysisReportType
  **/

  public String getProductCombinationArrangementInstanceAnalysisReportType() {
    return productCombinationArrangementInstanceAnalysisReportType;
  }

  public void setProductCombinationArrangementInstanceAnalysisReportType(String productCombinationArrangementInstanceAnalysisReportType) {
    this.productCombinationArrangementInstanceAnalysisReportType = productCombinationArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productCombinationArrangementInstanceAnalysisReport
  **/

  public Object getProductCombinationArrangementInstanceAnalysisReport() {
    return productCombinationArrangementInstanceAnalysisReport;
  }

  public void setProductCombinationArrangementInstanceAnalysisReport(Object productCombinationArrangementInstanceAnalysisReport) {
    this.productCombinationArrangementInstanceAnalysisReport = productCombinationArrangementInstanceAnalysisReport;
  }


}

