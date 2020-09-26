package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductCombinationRetrieveOutputModelProductCombinationOfferedService;
import org.bian.dto.SDProductCombinationRetrieveOutputModelProductCombinationRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductCombinationRetrieveOutputModel
 */
public class SDProductCombinationRetrieveOutputModel   {
  private String productCombinationRetrieveActionTaskReference = null;

  private Object productCombinationRetrieveActionTaskRecord = null;

  private String productCombinationRetrieveActionResponse = null;

  private SDProductCombinationRetrieveOutputModelProductCombinationRetrieveActionRecord productCombinationRetrieveActionRecord = null;

  private SDProductCombinationRetrieveOutputModelProductCombinationOfferedService productCombinationOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return productCombinationRetrieveActionTaskReference
  **/

  public String getProductCombinationRetrieveActionTaskReference() {
    return productCombinationRetrieveActionTaskReference;
  }

  public void setProductCombinationRetrieveActionTaskReference(String productCombinationRetrieveActionTaskReference) {
    this.productCombinationRetrieveActionTaskReference = productCombinationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productCombinationRetrieveActionResponse
  **/

  public String getProductCombinationRetrieveActionResponse() {
    return productCombinationRetrieveActionResponse;
  }

  public void setProductCombinationRetrieveActionResponse(String productCombinationRetrieveActionResponse) {
    this.productCombinationRetrieveActionResponse = productCombinationRetrieveActionResponse;
  }


  /**
   * Get productCombinationRetrieveActionRecord
   * @return productCombinationRetrieveActionRecord
  **/

  public SDProductCombinationRetrieveOutputModelProductCombinationRetrieveActionRecord getProductCombinationRetrieveActionRecord() {
    return productCombinationRetrieveActionRecord;
  }

  public void setProductCombinationRetrieveActionRecord(SDProductCombinationRetrieveOutputModelProductCombinationRetrieveActionRecord productCombinationRetrieveActionRecord) {
    this.productCombinationRetrieveActionRecord = productCombinationRetrieveActionRecord;
  }


  /**
   * Get productCombinationOfferedService
   * @return productCombinationOfferedService
  **/

  public SDProductCombinationRetrieveOutputModelProductCombinationOfferedService getProductCombinationOfferedService() {
    return productCombinationOfferedService;
  }

  public void setProductCombinationOfferedService(SDProductCombinationRetrieveOutputModelProductCombinationOfferedService productCombinationOfferedService) {
    this.productCombinationOfferedService = productCombinationOfferedService;
  }


}

