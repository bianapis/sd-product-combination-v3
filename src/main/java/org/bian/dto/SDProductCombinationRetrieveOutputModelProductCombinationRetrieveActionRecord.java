package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductCombinationRetrieveOutputModelProductCombinationRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDProductCombinationRetrieveOutputModelProductCombinationRetrieveActionRecordProductCombinationActivityAnalysis;
import org.bian.dto.SDProductCombinationRetrieveOutputModelProductCombinationRetrieveActionRecordProductCombinationPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDProductCombinationRetrieveOutputModelProductCombinationRetrieveActionRecord
 */
public class SDProductCombinationRetrieveOutputModelProductCombinationRetrieveActionRecord   {
  private SDProductCombinationRetrieveOutputModelProductCombinationRetrieveActionRecordProductCombinationActivityAnalysis productCombinationActivityAnalysis = null;

  private SDProductCombinationRetrieveOutputModelProductCombinationRetrieveActionRecordProductCombinationPerformanceAnalysis productCombinationPerformanceAnalysis = null;

  private SDProductCombinationRetrieveOutputModelProductCombinationRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get productCombinationActivityAnalysis
   * @return productCombinationActivityAnalysis
  **/

  public SDProductCombinationRetrieveOutputModelProductCombinationRetrieveActionRecordProductCombinationActivityAnalysis getProductCombinationActivityAnalysis() {
    return productCombinationActivityAnalysis;
  }

  public void setProductCombinationActivityAnalysis(SDProductCombinationRetrieveOutputModelProductCombinationRetrieveActionRecordProductCombinationActivityAnalysis productCombinationActivityAnalysis) {
    this.productCombinationActivityAnalysis = productCombinationActivityAnalysis;
  }


  /**
   * Get productCombinationPerformanceAnalysis
   * @return productCombinationPerformanceAnalysis
  **/

  public SDProductCombinationRetrieveOutputModelProductCombinationRetrieveActionRecordProductCombinationPerformanceAnalysis getProductCombinationPerformanceAnalysis() {
    return productCombinationPerformanceAnalysis;
  }

  public void setProductCombinationPerformanceAnalysis(SDProductCombinationRetrieveOutputModelProductCombinationRetrieveActionRecordProductCombinationPerformanceAnalysis productCombinationPerformanceAnalysis) {
    this.productCombinationPerformanceAnalysis = productCombinationPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDProductCombinationRetrieveOutputModelProductCombinationRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDProductCombinationRetrieveOutputModelProductCombinationRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

