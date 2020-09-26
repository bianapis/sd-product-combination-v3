package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceAgreement;
import org.bian.dto.SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceConfigurationSetup;
import org.bian.dto.SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecord
 */
public class SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecord   {
  private String productCombinationServiceConfigurationSettingReference = null;

  private String productCombinationServiceConfigurationSettingType = null;

  private SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceConfigurationSetup productCombinationServiceConfigurationSetup = null;

  private SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceSubscription productCombinationServiceSubscription = null;

  private SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceAgreement productCombinationServiceAgreement = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return productCombinationServiceConfigurationSettingReference
  **/

  public String getProductCombinationServiceConfigurationSettingReference() {
    return productCombinationServiceConfigurationSettingReference;
  }

  public void setProductCombinationServiceConfigurationSettingReference(String productCombinationServiceConfigurationSettingReference) {
    this.productCombinationServiceConfigurationSettingReference = productCombinationServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return productCombinationServiceConfigurationSettingType
  **/

  public String getProductCombinationServiceConfigurationSettingType() {
    return productCombinationServiceConfigurationSettingType;
  }

  public void setProductCombinationServiceConfigurationSettingType(String productCombinationServiceConfigurationSettingType) {
    this.productCombinationServiceConfigurationSettingType = productCombinationServiceConfigurationSettingType;
  }


  /**
   * Get productCombinationServiceConfigurationSetup
   * @return productCombinationServiceConfigurationSetup
  **/

  public SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceConfigurationSetup getProductCombinationServiceConfigurationSetup() {
    return productCombinationServiceConfigurationSetup;
  }

  public void setProductCombinationServiceConfigurationSetup(SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceConfigurationSetup productCombinationServiceConfigurationSetup) {
    this.productCombinationServiceConfigurationSetup = productCombinationServiceConfigurationSetup;
  }


  /**
   * Get productCombinationServiceSubscription
   * @return productCombinationServiceSubscription
  **/

  public SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceSubscription getProductCombinationServiceSubscription() {
    return productCombinationServiceSubscription;
  }

  public void setProductCombinationServiceSubscription(SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceSubscription productCombinationServiceSubscription) {
    this.productCombinationServiceSubscription = productCombinationServiceSubscription;
  }


  /**
   * Get productCombinationServiceAgreement
   * @return productCombinationServiceAgreement
  **/

  public SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceAgreement getProductCombinationServiceAgreement() {
    return productCombinationServiceAgreement;
  }

  public void setProductCombinationServiceAgreement(SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceAgreement productCombinationServiceAgreement) {
    this.productCombinationServiceAgreement = productCombinationServiceAgreement;
  }


}

