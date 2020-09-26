package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductCombinationFeedbackOutputModelProductCombinationFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductCombinationFeedbackOutputModel
 */
public class SDProductCombinationFeedbackOutputModel   {
  private String productCombinationFeedbackActionTaskReference = null;

  private Object productCombinationFeedbackActionTaskRecord = null;

  private SDProductCombinationFeedbackOutputModelProductCombinationFeedbackActionRecord productCombinationFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return productCombinationFeedbackActionTaskReference
  **/

  public String getProductCombinationFeedbackActionTaskReference() {
    return productCombinationFeedbackActionTaskReference;
  }

  public void setProductCombinationFeedbackActionTaskReference(String productCombinationFeedbackActionTaskReference) {
    this.productCombinationFeedbackActionTaskReference = productCombinationFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return productCombinationFeedbackActionTaskRecord
  **/

  public Object getProductCombinationFeedbackActionTaskRecord() {
    return productCombinationFeedbackActionTaskRecord;
  }

  public void setProductCombinationFeedbackActionTaskRecord(Object productCombinationFeedbackActionTaskRecord) {
    this.productCombinationFeedbackActionTaskRecord = productCombinationFeedbackActionTaskRecord;
  }


  /**
   * Get productCombinationFeedbackActionRecord
   * @return productCombinationFeedbackActionRecord
  **/

  public SDProductCombinationFeedbackOutputModelProductCombinationFeedbackActionRecord getProductCombinationFeedbackActionRecord() {
    return productCombinationFeedbackActionRecord;
  }

  public void setProductCombinationFeedbackActionRecord(SDProductCombinationFeedbackOutputModelProductCombinationFeedbackActionRecord productCombinationFeedbackActionRecord) {
    this.productCombinationFeedbackActionRecord = productCombinationFeedbackActionRecord;
  }


}

