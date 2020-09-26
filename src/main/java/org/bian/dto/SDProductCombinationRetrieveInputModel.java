package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductCombinationRetrieveInputModelProductCombinationOfferedService;
import org.bian.dto.SDProductCombinationRetrieveInputModelProductCombinationRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductCombinationRetrieveInputModel
 */
public class SDProductCombinationRetrieveInputModel   {
  private Object productCombinationRetrieveActionTaskRecord = null;

  private String productCombinationRetrieveActionRequest = null;

  private SDProductCombinationRetrieveInputModelProductCombinationRetrieveActionRecord productCombinationRetrieveActionRecord = null;

  private SDProductCombinationRetrieveInputModelProductCombinationOfferedService productCombinationOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productCombinationRetrieveActionTaskRecord
  **/

  public Object getProductCombinationRetrieveActionTaskRecord() {
    return productCombinationRetrieveActionTaskRecord;
  }

  public void setProductCombinationRetrieveActionTaskRecord(Object productCombinationRetrieveActionTaskRecord) {
    this.productCombinationRetrieveActionTaskRecord = productCombinationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productCombinationRetrieveActionRequest
  **/

  public String getProductCombinationRetrieveActionRequest() {
    return productCombinationRetrieveActionRequest;
  }

  public void setProductCombinationRetrieveActionRequest(String productCombinationRetrieveActionRequest) {
    this.productCombinationRetrieveActionRequest = productCombinationRetrieveActionRequest;
  }


  /**
   * Get productCombinationRetrieveActionRecord
   * @return productCombinationRetrieveActionRecord
  **/

  public SDProductCombinationRetrieveInputModelProductCombinationRetrieveActionRecord getProductCombinationRetrieveActionRecord() {
    return productCombinationRetrieveActionRecord;
  }

  public void setProductCombinationRetrieveActionRecord(SDProductCombinationRetrieveInputModelProductCombinationRetrieveActionRecord productCombinationRetrieveActionRecord) {
    this.productCombinationRetrieveActionRecord = productCombinationRetrieveActionRecord;
  }


  /**
   * Get productCombinationOfferedService
   * @return productCombinationOfferedService
  **/

  public SDProductCombinationRetrieveInputModelProductCombinationOfferedService getProductCombinationOfferedService() {
    return productCombinationOfferedService;
  }

  public void setProductCombinationOfferedService(SDProductCombinationRetrieveInputModelProductCombinationOfferedService productCombinationOfferedService) {
    this.productCombinationOfferedService = productCombinationOfferedService;
  }


}

