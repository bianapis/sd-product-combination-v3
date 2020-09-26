package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEmbeddedProductControlRetrieveOutputModelEmbeddedProductControlInstanceReport
 */
public class BQEmbeddedProductControlRetrieveOutputModelEmbeddedProductControlInstanceReport   {
  private Object embeddedProductControlInstanceReportRecord = null;

  private String embeddedProductControlInstanceReportType = null;

  private String embeddedProductControlInstanceReportParameters = null;

  private Object embeddedProductControlInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return embeddedProductControlInstanceReportRecord
  **/

  public Object getEmbeddedProductControlInstanceReportRecord() {
    return embeddedProductControlInstanceReportRecord;
  }

  public void setEmbeddedProductControlInstanceReportRecord(Object embeddedProductControlInstanceReportRecord) {
    this.embeddedProductControlInstanceReportRecord = embeddedProductControlInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return embeddedProductControlInstanceReportType
  **/

  public String getEmbeddedProductControlInstanceReportType() {
    return embeddedProductControlInstanceReportType;
  }

  public void setEmbeddedProductControlInstanceReportType(String embeddedProductControlInstanceReportType) {
    this.embeddedProductControlInstanceReportType = embeddedProductControlInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return embeddedProductControlInstanceReportParameters
  **/

  public String getEmbeddedProductControlInstanceReportParameters() {
    return embeddedProductControlInstanceReportParameters;
  }

  public void setEmbeddedProductControlInstanceReportParameters(String embeddedProductControlInstanceReportParameters) {
    this.embeddedProductControlInstanceReportParameters = embeddedProductControlInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return embeddedProductControlInstanceReport
  **/

  public Object getEmbeddedProductControlInstanceReport() {
    return embeddedProductControlInstanceReport;
  }

  public void setEmbeddedProductControlInstanceReport(Object embeddedProductControlInstanceReport) {
    this.embeddedProductControlInstanceReport = embeddedProductControlInstanceReport;
  }


}

