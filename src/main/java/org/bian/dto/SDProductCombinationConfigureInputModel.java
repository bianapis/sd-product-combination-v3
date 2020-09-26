package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductCombinationConfigureInputModel
 */
public class SDProductCombinationConfigureInputModel   {
  private Object productCombinationConfigurationActionTaskRecord = null;

  private String productCombinationServicingSessionReference = null;

  private String productCombinationServiceReference = null;

  private SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecord productCombinationServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return productCombinationServiceReference
  **/

  public String getProductCombinationServiceReference() {
    return productCombinationServiceReference;
  }

  public void setProductCombinationServiceReference(String productCombinationServiceReference) {
    this.productCombinationServiceReference = productCombinationServiceReference;
  }


  /**
   * Get productCombinationServiceConfigurationRecord
   * @return productCombinationServiceConfigurationRecord
  **/

  public SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecord getProductCombinationServiceConfigurationRecord() {
    return productCombinationServiceConfigurationRecord;
  }

  public void setProductCombinationServiceConfigurationRecord(SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecord productCombinationServiceConfigurationRecord) {
    this.productCombinationServiceConfigurationRecord = productCombinationServiceConfigurationRecord;
  }


}

