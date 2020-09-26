package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductCombinationFeedbackInputModelProductCombinationFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductCombinationFeedbackInputModel
 */
public class SDProductCombinationFeedbackInputModel   {
  private Object productCombinationFeedbackActionTaskRecord = null;

  private SDProductCombinationFeedbackInputModelProductCombinationFeedbackActionRecord productCombinationFeedbackActionRecord = null;


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

  public SDProductCombinationFeedbackInputModelProductCombinationFeedbackActionRecord getProductCombinationFeedbackActionRecord() {
    return productCombinationFeedbackActionRecord;
  }

  public void setProductCombinationFeedbackActionRecord(SDProductCombinationFeedbackInputModelProductCombinationFeedbackActionRecord productCombinationFeedbackActionRecord) {
    this.productCombinationFeedbackActionRecord = productCombinationFeedbackActionRecord;
  }


}

