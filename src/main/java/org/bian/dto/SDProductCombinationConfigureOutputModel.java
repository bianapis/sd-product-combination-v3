package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductCombinationConfigureOutputModelProductCombinationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductCombinationConfigureOutputModel
 */
public class SDProductCombinationConfigureOutputModel   {
  private String productCombinationConfigurationActionTaskReference = null;

  private Object productCombinationConfigurationActionTaskRecord = null;

  private SDProductCombinationConfigureOutputModelProductCombinationServiceConfigurationRecord productCombinationServiceConfigurationRecord = null;

  private String productCombinationServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return productCombinationConfigurationActionTaskReference
  **/

  public String getProductCombinationConfigurationActionTaskReference() {
    return productCombinationConfigurationActionTaskReference;
  }

  public void setProductCombinationConfigurationActionTaskReference(String productCombinationConfigurationActionTaskReference) {
    this.productCombinationConfigurationActionTaskReference = productCombinationConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return productCombinationConfigurationActionTaskRecord
  **/

  public Object getProductCombinationConfigurationActionTaskRecord() {
    return productCombinationConfigurationActionTaskRecord;
  }

  public void setProductCombinationConfigurationActionTaskRecord(Object productCombinationConfigurationActionTaskRecord) {
    this.productCombinationConfigurationActionTaskRecord = productCombinationConfigurationActionTaskRecord;
  }


  /**
   * Get productCombinationServiceConfigurationRecord
   * @return productCombinationServiceConfigurationRecord
  **/

  public SDProductCombinationConfigureOutputModelProductCombinationServiceConfigurationRecord getProductCombinationServiceConfigurationRecord() {
    return productCombinationServiceConfigurationRecord;
  }

  public void setProductCombinationServiceConfigurationRecord(SDProductCombinationConfigureOutputModelProductCombinationServiceConfigurationRecord productCombinationServiceConfigurationRecord) {
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

