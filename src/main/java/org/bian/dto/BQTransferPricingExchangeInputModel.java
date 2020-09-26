package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductCombinationArrangementExchangeInputModelProductCombinationArrangementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQTransferPricingExchangeInputModel
 */
public class BQTransferPricingExchangeInputModel   {
  private String productCombinationArrangementInstanceReference = null;

  private String transferPricingInstanceReference = null;

  private String transferPricingPreconditions = null;

  private String transferPricingFeatureSchedule = null;

  private String productTransferPricing = null;

  private String transferPricingPostconditions = null;

  private String transferPricingProductTransferPricingServiceType = null;

  private String transferPricingProductTransferPricingServiceDescription = null;

  private String transferPricingProductTransferPricingServiceInputsandOuputs = null;

  private String transferPricingProductTransferPricingServiceWorkProduct = null;

  private String transferPricingProductTransferPricingServiceName = null;

  private Object transferPricingExchangeActionTaskRecord = null;

  private CRProductCombinationArrangementExchangeInputModelProductCombinationArrangementExchangeActionRequest transferPricingExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Product Combination Arrangement instance 
   * @return productCombinationArrangementInstanceReference
  **/

  public String getProductCombinationArrangementInstanceReference() {
    return productCombinationArrangementInstanceReference;
  }

  public void setProductCombinationArrangementInstanceReference(String productCombinationArrangementInstanceReference) {
    this.productCombinationArrangementInstanceReference = productCombinationArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Transfer Pricing instance 
   * @return transferPricingInstanceReference
  **/

  public String getTransferPricingInstanceReference() {
    return transferPricingInstanceReference;
  }

  public void setTransferPricingInstanceReference(String transferPricingInstanceReference) {
    this.transferPricingInstanceReference = transferPricingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return transferPricingPreconditions
  **/

  public String getTransferPricingPreconditions() {
    return transferPricingPreconditions;
  }

  public void setTransferPricingPreconditions(String transferPricingPreconditions) {
    this.transferPricingPreconditions = transferPricingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return transferPricingFeatureSchedule
  **/

  public String getTransferPricingFeatureSchedule() {
    return transferPricingFeatureSchedule;
  }

  public void setTransferPricingFeatureSchedule(String transferPricingFeatureSchedule) {
    this.transferPricingFeatureSchedule = transferPricingFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Product Combination Arrangement specific Business Service 
   * @return productTransferPricing
  **/

  public String getProductTransferPricing() {
    return productTransferPricing;
  }

  public void setProductTransferPricing(String productTransferPricing) {
    this.productTransferPricing = productTransferPricing;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return transferPricingPostconditions
  **/

  public String getTransferPricingPostconditions() {
    return transferPricingPostconditions;
  }

  public void setTransferPricingPostconditions(String transferPricingPostconditions) {
    this.transferPricingPostconditions = transferPricingPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return transferPricingProductTransferPricingServiceType
  **/

  public String getTransferPricingProductTransferPricingServiceType() {
    return transferPricingProductTransferPricingServiceType;
  }

  public void setTransferPricingProductTransferPricingServiceType(String transferPricingProductTransferPricingServiceType) {
    this.transferPricingProductTransferPricingServiceType = transferPricingProductTransferPricingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return transferPricingProductTransferPricingServiceDescription
  **/

  public String getTransferPricingProductTransferPricingServiceDescription() {
    return transferPricingProductTransferPricingServiceDescription;
  }

  public void setTransferPricingProductTransferPricingServiceDescription(String transferPricingProductTransferPricingServiceDescription) {
    this.transferPricingProductTransferPricingServiceDescription = transferPricingProductTransferPricingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return transferPricingProductTransferPricingServiceInputsandOuputs
  **/

  public String getTransferPricingProductTransferPricingServiceInputsandOuputs() {
    return transferPricingProductTransferPricingServiceInputsandOuputs;
  }

  public void setTransferPricingProductTransferPricingServiceInputsandOuputs(String transferPricingProductTransferPricingServiceInputsandOuputs) {
    this.transferPricingProductTransferPricingServiceInputsandOuputs = transferPricingProductTransferPricingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return transferPricingProductTransferPricingServiceWorkProduct
  **/

  public String getTransferPricingProductTransferPricingServiceWorkProduct() {
    return transferPricingProductTransferPricingServiceWorkProduct;
  }

  public void setTransferPricingProductTransferPricingServiceWorkProduct(String transferPricingProductTransferPricingServiceWorkProduct) {
    this.transferPricingProductTransferPricingServiceWorkProduct = transferPricingProductTransferPricingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return transferPricingProductTransferPricingServiceName
  **/

  public String getTransferPricingProductTransferPricingServiceName() {
    return transferPricingProductTransferPricingServiceName;
  }

  public void setTransferPricingProductTransferPricingServiceName(String transferPricingProductTransferPricingServiceName) {
    this.transferPricingProductTransferPricingServiceName = transferPricingProductTransferPricingServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return transferPricingExchangeActionTaskRecord
  **/

  public Object getTransferPricingExchangeActionTaskRecord() {
    return transferPricingExchangeActionTaskRecord;
  }

  public void setTransferPricingExchangeActionTaskRecord(Object transferPricingExchangeActionTaskRecord) {
    this.transferPricingExchangeActionTaskRecord = transferPricingExchangeActionTaskRecord;
  }


  /**
   * Get transferPricingExchangeActionRequest
   * @return transferPricingExchangeActionRequest
  **/

  public CRProductCombinationArrangementExchangeInputModelProductCombinationArrangementExchangeActionRequest getTransferPricingExchangeActionRequest() {
    return transferPricingExchangeActionRequest;
  }

  public void setTransferPricingExchangeActionRequest(CRProductCombinationArrangementExchangeInputModelProductCombinationArrangementExchangeActionRequest transferPricingExchangeActionRequest) {
    this.transferPricingExchangeActionRequest = transferPricingExchangeActionRequest;
  }


}

