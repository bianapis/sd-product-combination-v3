package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCombinationArrangementRetrieveInputModelProductCombinationArrangementInstanceAnalysis
 */
public class CRProductCombinationArrangementRetrieveInputModelProductCombinationArrangementInstanceAnalysis   {
  private String productCombinationArrangementInstanceAnalysisReference = null;

  private String productCombinationArrangementInstanceAnalysisReportType = null;

  private String productCombinationArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productCombinationArrangementInstanceAnalysisReference
  **/

  public String getProductCombinationArrangementInstanceAnalysisReference() {
    return productCombinationArrangementInstanceAnalysisReference;
  }

  public void setProductCombinationArrangementInstanceAnalysisReference(String productCombinationArrangementInstanceAnalysisReference) {
    this.productCombinationArrangementInstanceAnalysisReference = productCombinationArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productCombinationArrangementInstanceAnalysisParameters
  **/

  public String getProductCombinationArrangementInstanceAnalysisParameters() {
    return productCombinationArrangementInstanceAnalysisParameters;
  }

  public void setProductCombinationArrangementInstanceAnalysisParameters(String productCombinationArrangementInstanceAnalysisParameters) {
    this.productCombinationArrangementInstanceAnalysisParameters = productCombinationArrangementInstanceAnalysisParameters;
  }


}

