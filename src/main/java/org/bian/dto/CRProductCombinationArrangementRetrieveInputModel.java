package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductCombinationArrangementRetrieveInputModelProductCombinationArrangementInstanceAnalysis;
import org.bian.dto.CRProductCombinationArrangementRetrieveInputModelProductCombinationArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductCombinationArrangementRetrieveInputModel
 */
public class CRProductCombinationArrangementRetrieveInputModel   {
  private Object productCombinationArrangementRetrieveActionTaskRecord = null;

  private String productCombinationArrangementRetrieveActionRequest = null;

  private CRProductCombinationArrangementRetrieveInputModelProductCombinationArrangementInstanceReportRecord productCombinationArrangementInstanceReportRecord = null;

  private CRProductCombinationArrangementRetrieveInputModelProductCombinationArrangementInstanceAnalysis productCombinationArrangementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productCombinationArrangementRetrieveActionTaskRecord
  **/

  public Object getProductCombinationArrangementRetrieveActionTaskRecord() {
    return productCombinationArrangementRetrieveActionTaskRecord;
  }

  public void setProductCombinationArrangementRetrieveActionTaskRecord(Object productCombinationArrangementRetrieveActionTaskRecord) {
    this.productCombinationArrangementRetrieveActionTaskRecord = productCombinationArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productCombinationArrangementRetrieveActionRequest
  **/

  public String getProductCombinationArrangementRetrieveActionRequest() {
    return productCombinationArrangementRetrieveActionRequest;
  }

  public void setProductCombinationArrangementRetrieveActionRequest(String productCombinationArrangementRetrieveActionRequest) {
    this.productCombinationArrangementRetrieveActionRequest = productCombinationArrangementRetrieveActionRequest;
  }


  /**
   * Get productCombinationArrangementInstanceReportRecord
   * @return productCombinationArrangementInstanceReportRecord
  **/

  public CRProductCombinationArrangementRetrieveInputModelProductCombinationArrangementInstanceReportRecord getProductCombinationArrangementInstanceReportRecord() {
    return productCombinationArrangementInstanceReportRecord;
  }

  public void setProductCombinationArrangementInstanceReportRecord(CRProductCombinationArrangementRetrieveInputModelProductCombinationArrangementInstanceReportRecord productCombinationArrangementInstanceReportRecord) {
    this.productCombinationArrangementInstanceReportRecord = productCombinationArrangementInstanceReportRecord;
  }


  /**
   * Get productCombinationArrangementInstanceAnalysis
   * @return productCombinationArrangementInstanceAnalysis
  **/

  public CRProductCombinationArrangementRetrieveInputModelProductCombinationArrangementInstanceAnalysis getProductCombinationArrangementInstanceAnalysis() {
    return productCombinationArrangementInstanceAnalysis;
  }

  public void setProductCombinationArrangementInstanceAnalysis(CRProductCombinationArrangementRetrieveInputModelProductCombinationArrangementInstanceAnalysis productCombinationArrangementInstanceAnalysis) {
    this.productCombinationArrangementInstanceAnalysis = productCombinationArrangementInstanceAnalysis;
  }


}

