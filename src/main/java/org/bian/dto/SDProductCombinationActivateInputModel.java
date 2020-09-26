package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductCombinationActivateInputModelProductCombinationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductCombinationActivateInputModel
 */
public class SDProductCombinationActivateInputModel   {
  private Object productCombinationActivationActionTaskRecord = null;

  private String productCombinationCenterReference = null;

  private String productCombinationServiceReference = null;

  private SDProductCombinationActivateInputModelProductCombinationServiceConfigurationRecord productCombinationServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return productCombinationCenterReference
  **/

  public String getProductCombinationCenterReference() {
    return productCombinationCenterReference;
  }

  public void setProductCombinationCenterReference(String productCombinationCenterReference) {
    this.productCombinationCenterReference = productCombinationCenterReference;
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

  public SDProductCombinationActivateInputModelProductCombinationServiceConfigurationRecord getProductCombinationServiceConfigurationRecord() {
    return productCombinationServiceConfigurationRecord;
  }

  public void setProductCombinationServiceConfigurationRecord(SDProductCombinationActivateInputModelProductCombinationServiceConfigurationRecord productCombinationServiceConfigurationRecord) {
    this.productCombinationServiceConfigurationRecord = productCombinationServiceConfigurationRecord;
  }


}

