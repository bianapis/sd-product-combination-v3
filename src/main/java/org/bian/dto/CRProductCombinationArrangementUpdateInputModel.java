package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCombinationArrangementUpdateInputModel
 */
public class CRProductCombinationArrangementUpdateInputModel   {
  private String productCombinationServicingSessionReference = null;

  private String productCombinationArrangementInstanceReference = null;

  private String productCombinationArrangementParameterType = null;

  private String productCombinationArrangementSelectedOption = null;

  private String productCombinationArrangementType = null;

  private String productCombinationArrangementReference = null;

  private String productCombinationArrangementSchedule = null;

  private String productCombinationArrangementStatus = null;

  private String productCombinationArrangementCurrency = null;

  private String productCombinationArrangementRegulationReference = null;

  private String productCombinationArrangementRegulationType = null;

  private String productCombinationArrangementJurisdiction = null;

  private String productCombinationArrangementBookingLocation = null;

  private String productCombinationArrangementAccountType = null;

  private String productCombinationArrangementAccountReference = null;

  private Object productCombinationArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return productCombinationServicingSessionReference
  **/

  public String getProductCombinationServicingSessionReference() {
    return productCombinationServicingSessionReference;
  }

  public void setProductCombinationServicingSessionReference(String productCombinationServicingSessionReference) {
    this.productCombinationServicingSessionReference = productCombinationServicingSessionReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of Product Combination Arrangement 
   * @return productCombinationArrangementType
  **/

  public String getProductCombinationArrangementType() {
    return productCombinationArrangementType;
  }

  public void setProductCombinationArrangementType(String productCombinationArrangementType) {
    this.productCombinationArrangementType = productCombinationArrangementType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to Product Combination Arrangement 
   * @return productCombinationArrangementReference
  **/

  public String getProductCombinationArrangementReference() {
    return productCombinationArrangementReference;
  }

  public void setProductCombinationArrangementReference(String productCombinationArrangementReference) {
    this.productCombinationArrangementReference = productCombinationArrangementReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The curreny which is arranged in Product Combination Arrangement 
   * @return productCombinationArrangementCurrency
  **/

  public String getProductCombinationArrangementCurrency() {
    return productCombinationArrangementCurrency;
  }

  public void setProductCombinationArrangementCurrency(String productCombinationArrangementCurrency) {
    this.productCombinationArrangementCurrency = productCombinationArrangementCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the regulation which is defined in Product Combination Arrangement 
   * @return productCombinationArrangementRegulationReference
  **/

  public String getProductCombinationArrangementRegulationReference() {
    return productCombinationArrangementRegulationReference;
  }

  public void setProductCombinationArrangementRegulationReference(String productCombinationArrangementRegulationReference) {
    this.productCombinationArrangementRegulationReference = productCombinationArrangementRegulationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification that distinguishes between the regularity domains of Product Combination Arrangement 
   * @return productCombinationArrangementRegulationType
  **/

  public String getProductCombinationArrangementRegulationType() {
    return productCombinationArrangementRegulationType;
  }

  public void setProductCombinationArrangementRegulationType(String productCombinationArrangementRegulationType) {
    this.productCombinationArrangementRegulationType = productCombinationArrangementRegulationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the jurisdiction that is assigned to Product Combination Arrangement in case of legal dispute. 
   * @return productCombinationArrangementJurisdiction
  **/

  public String getProductCombinationArrangementJurisdiction() {
    return productCombinationArrangementJurisdiction;
  }

  public void setProductCombinationArrangementJurisdiction(String productCombinationArrangementJurisdiction) {
    this.productCombinationArrangementJurisdiction = productCombinationArrangementJurisdiction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Product Combination Arrangement, are entered. 
   * @return productCombinationArrangementBookingLocation
  **/

  public String getProductCombinationArrangementBookingLocation() {
    return productCombinationArrangementBookingLocation;
  }

  public void setProductCombinationArrangementBookingLocation(String productCombinationArrangementBookingLocation) {
    this.productCombinationArrangementBookingLocation = productCombinationArrangementBookingLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of account which is linked to Product Combination Arrangement 
   * @return productCombinationArrangementAccountType
  **/

  public String getProductCombinationArrangementAccountType() {
    return productCombinationArrangementAccountType;
  }

  public void setProductCombinationArrangementAccountType(String productCombinationArrangementAccountType) {
    this.productCombinationArrangementAccountType = productCombinationArrangementAccountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account which is linked to Product Combination Arrangement 
   * @return productCombinationArrangementAccountReference
  **/

  public String getProductCombinationArrangementAccountReference() {
    return productCombinationArrangementAccountReference;
  }

  public void setProductCombinationArrangementAccountReference(String productCombinationArrangementAccountReference) {
    this.productCombinationArrangementAccountReference = productCombinationArrangementAccountReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

