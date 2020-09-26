package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEmbeddedProductControlInitiateOutputModel
 */
public class BQEmbeddedProductControlInitiateOutputModel   {
  private String embeddedProductControlInstanceReference = null;

  private String embeddedProductControlInitiateActionReference = null;

  private Object embeddedProductControlInitiateActionRecord = null;

  private String embeddedProductControlInstanceStatus = null;

  private String embeddedProductControlPreconditions = null;

  private String embeddedProductControlFeatureSchedule = null;

  private String combinedProductControl = null;

  private String embeddedProductControlPostconditions = null;

  private String embeddedProductControlCombinedProductControlServiceType = null;

  private String embeddedProductControlCombinedProductControlServiceDescription = null;

  private String embeddedProductControlCombinedProductControlServiceInputsandOuputs = null;

  private String embeddedProductControlCombinedProductControlServiceWorkProduct = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Embedded Product Control instance 
   * @return embeddedProductControlInstanceReference
  **/

  public String getEmbeddedProductControlInstanceReference() {
    return embeddedProductControlInstanceReference;
  }

  public void setEmbeddedProductControlInstanceReference(String embeddedProductControlInstanceReference) {
    this.embeddedProductControlInstanceReference = embeddedProductControlInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return embeddedProductControlInitiateActionReference
  **/

  public String getEmbeddedProductControlInitiateActionReference() {
    return embeddedProductControlInitiateActionReference;
  }

  public void setEmbeddedProductControlInitiateActionReference(String embeddedProductControlInitiateActionReference) {
    this.embeddedProductControlInitiateActionReference = embeddedProductControlInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return embeddedProductControlInitiateActionRecord
  **/

  public Object getEmbeddedProductControlInitiateActionRecord() {
    return embeddedProductControlInitiateActionRecord;
  }

  public void setEmbeddedProductControlInitiateActionRecord(Object embeddedProductControlInitiateActionRecord) {
    this.embeddedProductControlInitiateActionRecord = embeddedProductControlInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Embedded Product Control instance (e.g. initialised, pending, active) 
   * @return embeddedProductControlInstanceStatus
  **/

  public String getEmbeddedProductControlInstanceStatus() {
    return embeddedProductControlInstanceStatus;
  }

  public void setEmbeddedProductControlInstanceStatus(String embeddedProductControlInstanceStatus) {
    this.embeddedProductControlInstanceStatus = embeddedProductControlInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return embeddedProductControlPreconditions
  **/

  public String getEmbeddedProductControlPreconditions() {
    return embeddedProductControlPreconditions;
  }

  public void setEmbeddedProductControlPreconditions(String embeddedProductControlPreconditions) {
    this.embeddedProductControlPreconditions = embeddedProductControlPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return embeddedProductControlFeatureSchedule
  **/

  public String getEmbeddedProductControlFeatureSchedule() {
    return embeddedProductControlFeatureSchedule;
  }

  public void setEmbeddedProductControlFeatureSchedule(String embeddedProductControlFeatureSchedule) {
    this.embeddedProductControlFeatureSchedule = embeddedProductControlFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Product Combination Arrangement specific Business Service 
   * @return combinedProductControl
  **/

  public String getCombinedProductControl() {
    return combinedProductControl;
  }

  public void setCombinedProductControl(String combinedProductControl) {
    this.combinedProductControl = combinedProductControl;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return embeddedProductControlPostconditions
  **/

  public String getEmbeddedProductControlPostconditions() {
    return embeddedProductControlPostconditions;
  }

  public void setEmbeddedProductControlPostconditions(String embeddedProductControlPostconditions) {
    this.embeddedProductControlPostconditions = embeddedProductControlPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return embeddedProductControlCombinedProductControlServiceType
  **/

  public String getEmbeddedProductControlCombinedProductControlServiceType() {
    return embeddedProductControlCombinedProductControlServiceType;
  }

  public void setEmbeddedProductControlCombinedProductControlServiceType(String embeddedProductControlCombinedProductControlServiceType) {
    this.embeddedProductControlCombinedProductControlServiceType = embeddedProductControlCombinedProductControlServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return embeddedProductControlCombinedProductControlServiceDescription
  **/

  public String getEmbeddedProductControlCombinedProductControlServiceDescription() {
    return embeddedProductControlCombinedProductControlServiceDescription;
  }

  public void setEmbeddedProductControlCombinedProductControlServiceDescription(String embeddedProductControlCombinedProductControlServiceDescription) {
    this.embeddedProductControlCombinedProductControlServiceDescription = embeddedProductControlCombinedProductControlServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return embeddedProductControlCombinedProductControlServiceInputsandOuputs
  **/

  public String getEmbeddedProductControlCombinedProductControlServiceInputsandOuputs() {
    return embeddedProductControlCombinedProductControlServiceInputsandOuputs;
  }

  public void setEmbeddedProductControlCombinedProductControlServiceInputsandOuputs(String embeddedProductControlCombinedProductControlServiceInputsandOuputs) {
    this.embeddedProductControlCombinedProductControlServiceInputsandOuputs = embeddedProductControlCombinedProductControlServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return embeddedProductControlCombinedProductControlServiceWorkProduct
  **/

  public String getEmbeddedProductControlCombinedProductControlServiceWorkProduct() {
    return embeddedProductControlCombinedProductControlServiceWorkProduct;
  }

  public void setEmbeddedProductControlCombinedProductControlServiceWorkProduct(String embeddedProductControlCombinedProductControlServiceWorkProduct) {
    this.embeddedProductControlCombinedProductControlServiceWorkProduct = embeddedProductControlCombinedProductControlServiceWorkProduct;
  }


}

