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
 * SDProductCombinationConfigureOutputModelProductCombinationServiceConfigurationRecord
 */
public class SDProductCombinationConfigureOutputModelProductCombinationServiceConfigurationRecord   {
  private String productCombinationServiceConfigurationSettingDescription = null;

  private SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceConfigurationSetup productCombinationServiceConfigurationSetup = null;

  private SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceSubscription productCombinationServiceSubscription = null;

  private SDProductCombinationConfigureInputModelProductCombinationServiceConfigurationRecordProductCombinationServiceAgreement productCombinationServiceAgreement = null;

  private String productCombinationServiceStatus = null;


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

