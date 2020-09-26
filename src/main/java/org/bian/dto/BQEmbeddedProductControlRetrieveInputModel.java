package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQEmbeddedProductControlRetrieveInputModelEmbeddedProductControlInstanceAnalysis;
import org.bian.dto.BQEmbeddedProductControlRetrieveInputModelEmbeddedProductControlInstanceReport;

import javax.validation.Valid;
  
/**
 * BQEmbeddedProductControlRetrieveInputModel
 */
public class BQEmbeddedProductControlRetrieveInputModel   {
  private Object embeddedProductControlRetrieveActionTaskRecord = null;

  private String embeddedProductControlRetrieveActionRequest = null;

  private BQEmbeddedProductControlRetrieveInputModelEmbeddedProductControlInstanceReport embeddedProductControlInstanceReport = null;

  private BQEmbeddedProductControlRetrieveInputModelEmbeddedProductControlInstanceAnalysis embeddedProductControlInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return embeddedProductControlRetrieveActionTaskRecord
  **/

  public Object getEmbeddedProductControlRetrieveActionTaskRecord() {
    return embeddedProductControlRetrieveActionTaskRecord;
  }

  public void setEmbeddedProductControlRetrieveActionTaskRecord(Object embeddedProductControlRetrieveActionTaskRecord) {
    this.embeddedProductControlRetrieveActionTaskRecord = embeddedProductControlRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return embeddedProductControlRetrieveActionRequest
  **/

  public String getEmbeddedProductControlRetrieveActionRequest() {
    return embeddedProductControlRetrieveActionRequest;
  }

  public void setEmbeddedProductControlRetrieveActionRequest(String embeddedProductControlRetrieveActionRequest) {
    this.embeddedProductControlRetrieveActionRequest = embeddedProductControlRetrieveActionRequest;
  }


  /**
   * Get embeddedProductControlInstanceReport
   * @return embeddedProductControlInstanceReport
  **/

  public BQEmbeddedProductControlRetrieveInputModelEmbeddedProductControlInstanceReport getEmbeddedProductControlInstanceReport() {
    return embeddedProductControlInstanceReport;
  }

  public void setEmbeddedProductControlInstanceReport(BQEmbeddedProductControlRetrieveInputModelEmbeddedProductControlInstanceReport embeddedProductControlInstanceReport) {
    this.embeddedProductControlInstanceReport = embeddedProductControlInstanceReport;
  }


  /**
   * Get embeddedProductControlInstanceAnalysis
   * @return embeddedProductControlInstanceAnalysis
  **/

  public BQEmbeddedProductControlRetrieveInputModelEmbeddedProductControlInstanceAnalysis getEmbeddedProductControlInstanceAnalysis() {
    return embeddedProductControlInstanceAnalysis;
  }

  public void setEmbeddedProductControlInstanceAnalysis(BQEmbeddedProductControlRetrieveInputModelEmbeddedProductControlInstanceAnalysis embeddedProductControlInstanceAnalysis) {
    this.embeddedProductControlInstanceAnalysis = embeddedProductControlInstanceAnalysis;
  }


}

