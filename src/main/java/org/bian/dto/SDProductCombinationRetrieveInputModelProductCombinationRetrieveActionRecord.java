package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductCombinationRetrieveInputModelProductCombinationRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDProductCombinationRetrieveInputModelProductCombinationRetrieveActionRecordProductCombinationActivityAnalysis;
import org.bian.dto.SDProductCombinationRetrieveInputModelProductCombinationRetrieveActionRecordProductCombinationPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDProductCombinationRetrieveInputModelProductCombinationRetrieveActionRecord
 */
public class SDProductCombinationRetrieveInputModelProductCombinationRetrieveActionRecord   {
  private SDProductCombinationRetrieveInputModelProductCombinationRetrieveActionRecordProductCombinationActivityAnalysis productCombinationActivityAnalysis = null;

  private SDProductCombinationRetrieveInputModelProductCombinationRetrieveActionRecordProductCombinationPerformanceAnalysis productCombinationPerformanceAnalysis = null;

  private SDProductCombinationRetrieveInputModelProductCombinationRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get productCombinationActivityAnalysis
   * @return productCombinationActivityAnalysis
  **/

  public SDProductCombinationRetrieveInputModelProductCombinationRetrieveActionRecordProductCombinationActivityAnalysis getProductCombinationActivityAnalysis() {
    return productCombinationActivityAnalysis;
  }

  public void setProductCombinationActivityAnalysis(SDProductCombinationRetrieveInputModelProductCombinationRetrieveActionRecordProductCombinationActivityAnalysis productCombinationActivityAnalysis) {
    this.productCombinationActivityAnalysis = productCombinationActivityAnalysis;
  }


  /**
   * Get productCombinationPerformanceAnalysis
   * @return productCombinationPerformanceAnalysis
  **/

  public SDProductCombinationRetrieveInputModelProductCombinationRetrieveActionRecordProductCombinationPerformanceAnalysis getProductCombinationPerformanceAnalysis() {
    return productCombinationPerformanceAnalysis;
  }

  public void setProductCombinationPerformanceAnalysis(SDProductCombinationRetrieveInputModelProductCombinationRetrieveActionRecordProductCombinationPerformanceAnalysis productCombinationPerformanceAnalysis) {
    this.productCombinationPerformanceAnalysis = productCombinationPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDProductCombinationRetrieveInputModelProductCombinationRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDProductCombinationRetrieveInputModelProductCombinationRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

