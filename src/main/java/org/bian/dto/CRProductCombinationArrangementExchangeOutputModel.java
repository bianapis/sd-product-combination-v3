package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCombinationArrangementExchangeOutputModel
 */
public class CRProductCombinationArrangementExchangeOutputModel   {
  private String productCombinationArrangementParameterType = null;

  private String productCombinationArrangementSelectedOption = null;

  private String productCombinationArrangementSchedule = null;

  private String productCombinationArrangementStatus = null;

  private String productCombinationArrangementExchangeActionTaskReference = null;

  private Object productCombinationArrangementExchangeActionTaskRecord = null;

  private String productCombinationArrangementExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between arrangements according to the type of business services within Product Combination Arrangement 
   * @return productCombinationArrangementParameterType
  **/

  public String getProductCombinationArrangementParameterType() {
    return productCombinationArrangementParameterType;
  }

  public void setProductCombinationArrangementParameterType(String productCombinationArrangementParameterType) {
    this.productCombinationArrangementParameterType = productCombinationArrangementParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Product Combination Arrangement 
   * @return productCombinationArrangementSelectedOption
  **/

  public String getProductCombinationArrangementSelectedOption() {
    return productCombinationArrangementSelectedOption;
  }

  public void setProductCombinationArrangementSelectedOption(String productCombinationArrangementSelectedOption) {
    this.productCombinationArrangementSelectedOption = productCombinationArrangementSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to fulfill Product Combination Arrangement 
   * @return productCombinationArrangementSchedule
  **/

  public String getProductCombinationArrangementSchedule() {
    return productCombinationArrangementSchedule;
  }

  public void setProductCombinationArrangementSchedule(String productCombinationArrangementSchedule) {
    this.productCombinationArrangementSchedule = productCombinationArrangementSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Product Combination Arrangement 
   * @return productCombinationArrangementStatus
  **/

  public String getProductCombinationArrangementStatus() {
    return productCombinationArrangementStatus;
  }

  public void setProductCombinationArrangementStatus(String productCombinationArrangementStatus) {
    this.productCombinationArrangementStatus = productCombinationArrangementStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Combination Arrangement instance exchange service call 
   * @return productCombinationArrangementExchangeActionTaskReference
  **/

  public String getProductCombinationArrangementExchangeActionTaskReference() {
    return productCombinationArrangementExchangeActionTaskReference;
  }

  public void setProductCombinationArrangementExchangeActionTaskReference(String productCombinationArrangementExchangeActionTaskReference) {
    this.productCombinationArrangementExchangeActionTaskReference = productCombinationArrangementExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return productCombinationArrangementExchangeActionTaskRecord
  **/

  public Object getProductCombinationArrangementExchangeActionTaskRecord() {
    return productCombinationArrangementExchangeActionTaskRecord;
  }

  public void setProductCombinationArrangementExchangeActionTaskRecord(Object productCombinationArrangementExchangeActionTaskRecord) {
    this.productCombinationArrangementExchangeActionTaskRecord = productCombinationArrangementExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return productCombinationArrangementExchangeActionResponse
  **/

  public String getProductCombinationArrangementExchangeActionResponse() {
    return productCombinationArrangementExchangeActionResponse;
  }

  public void setProductCombinationArrangementExchangeActionResponse(String productCombinationArrangementExchangeActionResponse) {
    this.productCombinationArrangementExchangeActionResponse = productCombinationArrangementExchangeActionResponse;
  }


}

