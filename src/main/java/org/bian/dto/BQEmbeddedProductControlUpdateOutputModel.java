package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQEmbeddedProductControlUpdateOutputModel
 */
public class BQEmbeddedProductControlUpdateOutputModel   {
  private String embeddedProductControlPreconditions = null;

  private String embeddedProductControlFeatureSchedule = null;

  private String combinedProductControl = null;

  private String embeddedProductControlPostconditions = null;

  private String embeddedProductControlCombinedProductControlServiceType = null;

  private String embeddedProductControlCombinedProductControlServiceDescription = null;

  private String embeddedProductControlCombinedProductControlServiceInputsandOuputs = null;

  private String embeddedProductControlCombinedProductControlServiceWorkProduct = null;

  private String embeddedProductControlUpdateActionTaskReference = null;

  private Object embeddedProductControlUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return embeddedProductControlUpdateActionTaskReference
  **/

  public String getEmbeddedProductControlUpdateActionTaskReference() {
    return embeddedProductControlUpdateActionTaskReference;
  }

  public void setEmbeddedProductControlUpdateActionTaskReference(String embeddedProductControlUpdateActionTaskReference) {
    this.embeddedProductControlUpdateActionTaskReference = embeddedProductControlUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return embeddedProductControlUpdateActionTaskRecord
  **/

  public Object getEmbeddedProductControlUpdateActionTaskRecord() {
    return embeddedProductControlUpdateActionTaskRecord;
  }

  public void setEmbeddedProductControlUpdateActionTaskRecord(Object embeddedProductControlUpdateActionTaskRecord) {
    this.embeddedProductControlUpdateActionTaskRecord = embeddedProductControlUpdateActionTaskRecord;
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

