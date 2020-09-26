package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEmbeddedProductControlRetrieveInputModelEmbeddedProductControlInstanceReport
 */
public class BQEmbeddedProductControlRetrieveInputModelEmbeddedProductControlInstanceReport   {
  private String embeddedProductControlInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return embeddedProductControlInstanceReportReference
  **/

  public String getEmbeddedProductControlInstanceReportReference() {
    return embeddedProductControlInstanceReportReference;
  }

  public void setEmbeddedProductControlInstanceReportReference(String embeddedProductControlInstanceReportReference) {
    this.embeddedProductControlInstanceReportReference = embeddedProductControlInstanceReportReference;
  }


}

