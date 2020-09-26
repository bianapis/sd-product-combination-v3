package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCombinationArrangementRetrieveInputModelProductCombinationArrangementInstanceReportRecord
 */
public class CRProductCombinationArrangementRetrieveInputModelProductCombinationArrangementInstanceReportRecord   {
  private String productCombinationArrangementInstanceReportReference = null;

  private String productCombinationArrangementInstanceReportType = null;

  private String productCombinationArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productCombinationArrangementInstanceReportReference
  **/

  public String getProductCombinationArrangementInstanceReportReference() {
    return productCombinationArrangementInstanceReportReference;
  }

  public void setProductCombinationArrangementInstanceReportReference(String productCombinationArrangementInstanceReportReference) {
    this.productCombinationArrangementInstanceReportReference = productCombinationArrangementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productCombinationArrangementInstanceReportType
  **/

  public String getProductCombinationArrangementInstanceReportType() {
    return productCombinationArrangementInstanceReportType;
  }

  public void setProductCombinationArrangementInstanceReportType(String productCombinationArrangementInstanceReportType) {
    this.productCombinationArrangementInstanceReportType = productCombinationArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productCombinationArrangementInstanceReportParameters
  **/

  public String getProductCombinationArrangementInstanceReportParameters() {
    return productCombinationArrangementInstanceReportParameters;
  }

  public void setProductCombinationArrangementInstanceReportParameters(String productCombinationArrangementInstanceReportParameters) {
    this.productCombinationArrangementInstanceReportParameters = productCombinationArrangementInstanceReportParameters;
  }


}

