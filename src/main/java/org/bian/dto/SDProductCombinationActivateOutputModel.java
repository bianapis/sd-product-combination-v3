package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductCombinationActivateOutputModelProductCombinationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductCombinationActivateOutputModel
 */
public class SDProductCombinationActivateOutputModel   {
  private String productCombinationActivationActionTaskReference = null;

  private Object productCombinationActivationActionTaskRecord = null;

  private String productCombinationServicingSessionReference = null;

  private Object productCombinationServicingSessionRecord = null;

  private SDProductCombinationActivateOutputModelProductCombinationServiceConfigurationRecord productCombinationServiceConfigurationRecord = null;

  private String productCombinationServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return productCombinationActivationActionTaskReference
  **/

  public String getProductCombinationActivationActionTaskReference() {
    return productCombinationActivationActionTaskReference;
  }

  public void setProductCombinationActivationActionTaskReference(String productCombinationActivationActionTaskReference) {
    this.productCombinationActivationActionTaskReference = productCombinationActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return productCombinationActivationActionTaskRecord
  **/

  public Object getProductCombinationActivationActionTaskRecord() {
    return productCombinationActivationActionTaskRecord;
  }

  public void setProductCombinationActivationActionTaskRecord(Object productCombinationActivationActionTaskRecord) {
    this.productCombinationActivationActionTaskRecord = productCombinationActivationActionTaskRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return productCombinationServicingSessionRecord
  **/

  public Object getProductCombinationServicingSessionRecord() {
    return productCombinationServicingSessionRecord;
  }

  public void setProductCombinationServicingSessionRecord(Object productCombinationServicingSessionRecord) {
    this.productCombinationServicingSessionRecord = productCombinationServicingSessionRecord;
  }


  /**
   * Get productCombinationServiceConfigurationRecord
   * @return productCombinationServiceConfigurationRecord
  **/

  public SDProductCombinationActivateOutputModelProductCombinationServiceConfigurationRecord getProductCombinationServiceConfigurationRecord() {
    return productCombinationServiceConfigurationRecord;
  }

  public void setProductCombinationServiceConfigurationRecord(SDProductCombinationActivateOutputModelProductCombinationServiceConfigurationRecord productCombinationServiceConfigurationRecord) {
    this.productCombinationServiceConfigurationRecord = productCombinationServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return productCombinationServicingSessionStatus
  **/

  public String getProductCombinationServicingSessionStatus() {
    return productCombinationServicingSessionStatus;
  }

  public void setProductCombinationServicingSessionStatus(String productCombinationServicingSessionStatus) {
    this.productCombinationServicingSessionStatus = productCombinationServicingSessionStatus;
  }


}

