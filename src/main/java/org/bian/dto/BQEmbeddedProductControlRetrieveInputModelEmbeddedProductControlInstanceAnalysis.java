package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEmbeddedProductControlRetrieveInputModelEmbeddedProductControlInstanceAnalysis
 */
public class BQEmbeddedProductControlRetrieveInputModelEmbeddedProductControlInstanceAnalysis   {
  private String embeddedProductControlInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return embeddedProductControlInstanceAnalysisReference
  **/

  public String getEmbeddedProductControlInstanceAnalysisReference() {
    return embeddedProductControlInstanceAnalysisReference;
  }

  public void setEmbeddedProductControlInstanceAnalysisReference(String embeddedProductControlInstanceAnalysisReference) {
    this.embeddedProductControlInstanceAnalysisReference = embeddedProductControlInstanceAnalysisReference;
  }


}

