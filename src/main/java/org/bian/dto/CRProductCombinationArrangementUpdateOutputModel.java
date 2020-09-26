package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCombinationArrangementUpdateOutputModel
 */
public class CRProductCombinationArrangementUpdateOutputModel   {
  private String productCombinationArrangementParameterType = null;

  private String productCombinationArrangementSelectedOption = null;

  private String productCombinationArrangementSchedule = null;

  private String productCombinationArrangementStatus = null;

  private String productCombinationArrangementUpdateActionTaskReference = null;

  private Object productCombinationArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return productCombinationArrangementUpdateActionTaskReference
  **/

  public String getProductCombinationArrangementUpdateActionTaskReference() {
    return productCombinationArrangementUpdateActionTaskReference;
  }

  public void setProductCombinationArrangementUpdateActionTaskReference(String productCombinationArrangementUpdateActionTaskReference) {
    this.productCombinationArrangementUpdateActionTaskReference = productCombinationArrangementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productCombinationArrangementUpdateActionTaskRecord
  **/

  public Object getProductCombinationArrangementUpdateActionTaskRecord() {
    return productCombinationArrangementUpdateActionTaskRecord;
  }

  public void setProductCombinationArrangementUpdateActionTaskRecord(Object productCombinationArrangementUpdateActionTaskRecord) {
    this.productCombinationArrangementUpdateActionTaskRecord = productCombinationArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

