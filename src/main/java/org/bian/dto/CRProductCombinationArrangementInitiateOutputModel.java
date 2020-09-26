package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCombinationArrangementInitiateOutputModel
 */
public class CRProductCombinationArrangementInitiateOutputModel   {
  private String productCombinationArrangementInstanceReference = null;

  private String productCombinationArrangementInitiateActionReference = null;

  private Object productCombinationArrangementInitiateActionRecord = null;

  private String productCombinationArrangementInstanceStatus = null;

  private String productCombinationArrangementParameterType = null;

  private String productCombinationArrangementSelectedOption = null;

  private String productCombinationArrangementSchedule = null;

  private String productCombinationArrangementStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Combination Arrangement instance 
   * @return productCombinationArrangementInstanceReference
  **/

  public String getProductCombinationArrangementInstanceReference() {
    return productCombinationArrangementInstanceReference;
  }

  public void setProductCombinationArrangementInstanceReference(String productCombinationArrangementInstanceReference) {
    this.productCombinationArrangementInstanceReference = productCombinationArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return productCombinationArrangementInitiateActionReference
  **/

  public String getProductCombinationArrangementInitiateActionReference() {
    return productCombinationArrangementInitiateActionReference;
  }

  public void setProductCombinationArrangementInitiateActionReference(String productCombinationArrangementInitiateActionReference) {
    this.productCombinationArrangementInitiateActionReference = productCombinationArrangementInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return productCombinationArrangementInitiateActionRecord
  **/

  public Object getProductCombinationArrangementInitiateActionRecord() {
    return productCombinationArrangementInitiateActionRecord;
  }

  public void setProductCombinationArrangementInitiateActionRecord(Object productCombinationArrangementInitiateActionRecord) {
    this.productCombinationArrangementInitiateActionRecord = productCombinationArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Product Combination Arrangement instance (e.g. initialised, pending, active) 
   * @return productCombinationArrangementInstanceStatus
  **/

  public String getProductCombinationArrangementInstanceStatus() {
    return productCombinationArrangementInstanceStatus;
  }

  public void setProductCombinationArrangementInstanceStatus(String productCombinationArrangementInstanceStatus) {
    this.productCombinationArrangementInstanceStatus = productCombinationArrangementInstanceStatus;
  }


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


}

