package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCombinationArrangementExecuteOutputModel
 */
public class CRProductCombinationArrangementExecuteOutputModel   {
  private String productCombinationArrangementParameterType = null;

  private String productCombinationArrangementSelectedOption = null;

  private String productCombinationArrangementSchedule = null;

  private String productCombinationArrangementStatus = null;

  private String productCombinationArrangementExecuteActionTaskReference = null;

  private Object productCombinationArrangementExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Combination Arrangement instance execute service call 
   * @return productCombinationArrangementExecuteActionTaskReference
  **/

  public String getProductCombinationArrangementExecuteActionTaskReference() {
    return productCombinationArrangementExecuteActionTaskReference;
  }

  public void setProductCombinationArrangementExecuteActionTaskReference(String productCombinationArrangementExecuteActionTaskReference) {
    this.productCombinationArrangementExecuteActionTaskReference = productCombinationArrangementExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return productCombinationArrangementExecuteActionTaskRecord
  **/

  public Object getProductCombinationArrangementExecuteActionTaskRecord() {
    return productCombinationArrangementExecuteActionTaskRecord;
  }

  public void setProductCombinationArrangementExecuteActionTaskRecord(Object productCombinationArrangementExecuteActionTaskRecord) {
    this.productCombinationArrangementExecuteActionTaskRecord = productCombinationArrangementExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

