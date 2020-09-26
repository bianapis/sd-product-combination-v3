package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductCombinationActivateInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceConfigurationSetup;
import org.bian.dto.SDProductCombinationActivateOutputModelProductCombinationServiceConfigurationRecordProductCombinationServiceAgreement;
import org.bian.dto.SDProductCombinationActivateOutputModelProductCombinationServiceConfigurationRecordProductCombinationServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDProductCombinationActivateOutputModelProductCombinationServiceConfigurationRecord
 */
public class SDProductCombinationActivateOutputModelProductCombinationServiceConfigurationRecord   {
  private String productCombinationServiceConfigurationSettingReference = null;

  private String productCombinationServiceConfigurationSettingDescription = null;

  private SDProductCombinationActivateInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceConfigurationSetup productCombinationServiceConfigurationSetup = null;

  private SDProductCombinationActivateOutputModelProductCombinationServiceConfigurationRecordProductCombinationServiceSubscription productCombinationServiceSubscription = null;

  private SDProductCombinationActivateOutputModelProductCombinationServiceConfigurationRecordProductCombinationServiceAgreement productCombinationServiceAgreement = null;

  private String productCombinationServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return productCombinationServiceConfigurationSettingDescription
  **/

  public String getProductCombinationServiceConfigurationSettingDescription() {
    return productCombinationServiceConfigurationSettingDescription;
  }

  public void setProductCombinationServiceConfigurationSettingDescription(String productCombinationServiceConfigurationSettingDescription) {
    this.productCombinationServiceConfigurationSettingDescription = productCombinationServiceConfigurationSettingDescription;
  }


  /**
   * Get productCombinationServiceConfigurationSetup
   * @return productCombinationServiceConfigurationSetup
  **/

  public SDProductCombinationActivateInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceConfigurationSetup getProductCombinationServiceConfigurationSetup() {
    return productCombinationServiceConfigurationSetup;
  }

  public void setProductCombinationServiceConfigurationSetup(SDProductCombinationActivateInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceConfigurationSetup productCombinationServiceConfigurationSetup) {
    this.productCombinationServiceConfigurationSetup = productCombinationServiceConfigurationSetup;
  }


  /**
   * Get productCombinationServiceSubscription
   * @return productCombinationServiceSubscription
  **/

  public SDProductCombinationActivateOutputModelProductCombinationServiceConfigurationRecordProductCombinationServiceSubscription getProductCombinationServiceSubscription() {
    return productCombinationServiceSubscription;
  }

  public void setProductCombinationServiceSubscription(SDProductCombinationActivateOutputModelProductCombinationServiceConfigurationRecordProductCombinationServiceSubscription productCombinationServiceSubscription) {
    this.productCombinationServiceSubscription = productCombinationServiceSubscription;
  }


  /**
   * Get productCombinationServiceAgreement
   * @return productCombinationServiceAgreement
  **/

  public SDProductCombinationActivateOutputModelProductCombinationServiceConfigurationRecordProductCombinationServiceAgreement getProductCombinationServiceAgreement() {
    return productCombinationServiceAgreement;
  }

  public void setProductCombinationServiceAgreement(SDProductCombinationActivateOutputModelProductCombinationServiceConfigurationRecordProductCombinationServiceAgreement productCombinationServiceAgreement) {
    this.productCombinationServiceAgreement = productCombinationServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return productCombinationServiceStatus
  **/

  public String getProductCombinationServiceStatus() {
    return productCombinationServiceStatus;
  }

  public void setProductCombinationServiceStatus(String productCombinationServiceStatus) {
    this.productCombinationServiceStatus = productCombinationServiceStatus;
  }


}

