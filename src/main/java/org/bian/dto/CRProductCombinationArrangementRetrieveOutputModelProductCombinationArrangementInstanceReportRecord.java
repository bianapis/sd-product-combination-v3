package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCombinationArrangementRetrieveOutputModelProductCombinationArrangementInstanceReportRecord
 */
public class CRProductCombinationArrangementRetrieveOutputModelProductCombinationArrangementInstanceReportRecord   {
  private String productCombinationArrangementInstanceReportData = null;

  private String productCombinationArrangementInstanceReportType = null;

  private Object productCombinationArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productCombinationArrangementInstanceReportData
  **/

  public String getProductCombinationArrangementInstanceReportData() {
    return productCombinationArrangementInstanceReportData;
  }

  public void setProductCombinationArrangementInstanceReportData(String productCombinationArrangementInstanceReportData) {
    this.productCombinationArrangementInstanceReportData = productCombinationArrangementInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productCombinationArrangementInstanceReport
  **/

  public Object getProductCombinationArrangementInstanceReport() {
    return productCombinationArrangementInstanceReport;
  }

  public void setProductCombinationArrangementInstanceReport(Object productCombinationArrangementInstanceReport) {
    this.productCombinationArrangementInstanceReport = productCombinationArrangementInstanceReport;
  }


}

