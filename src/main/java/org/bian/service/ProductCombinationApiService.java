/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProductCombinationApiService {

	SDProductCombinationActivateOutputModel activate(SDProductCombinationActivateInputModel request);
	
	SDProductCombinationConfigureOutputModel configure(String sdReferenceId, SDProductCombinationConfigureInputModel request);
	
	BQFulfillmentControlOutputModel controlFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentControlInputModel request);
	
	CRProductCombinationArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRProductCombinationArrangementControlInputModel request);
	
	BQFulfillmentExchangeOutputModel exchangeFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentExchangeInputModel request);
	
	BQTransferPricingExchangeOutputModel exchangeTransferpricing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransferPricingExchangeInputModel request);
	
	CRProductCombinationArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRProductCombinationArrangementExchangeInputModel request);
	
	BQFulfillmentExecuteOutputModel executeFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentExecuteInputModel request);
	
	CRProductCombinationArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRProductCombinationArrangementExecuteInputModel request);
	
	SDProductCombinationFeedbackOutputModel feedback(String sdReferenceId, SDProductCombinationFeedbackInputModel request);
	
	CRProductCombinationArrangementInitiateOutputModel initiate(String sdReferenceId, CRProductCombinationArrangementInitiateInputModel request);
	
	BQEmbeddedProductControlInitiateOutputModel initiateEmbeddedproductcontrol(String sdReferenceId, String crReferenceId, BQEmbeddedProductControlInitiateInputModel request);
	
	BQFulfillmentInitiateOutputModel initiateFulfillment(String sdReferenceId, String crReferenceId, BQFulfillmentInitiateInputModel request);
	
	BQFulfillmentRequestOutputModel requestFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentRequestInputModel request);
	
	BQTransferPricingRequestOutputModel requestTransferpricing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransferPricingRequestInputModel request);
	
	CRProductCombinationArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductCombinationArrangementRequestInputModel request);
	
	CRProductCombinationArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	BQEmbeddedProductControlRetrieveOutputModel retrieveEmbeddedproductcontrol(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFulfillmentRetrieveOutputModel retrieveFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTransferPricingRetrieveOutputModel retrieveTransferpricing(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDProductCombinationRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRProductCombinationArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductCombinationArrangementUpdateInputModel request);
	
	BQEmbeddedProductControlUpdateOutputModel updateEmbeddedproductcontrol(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEmbeddedProductControlUpdateInputModel request);
	
	BQFulfillmentUpdateOutputModel updateFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentUpdateInputModel request);
	
	BQTransferPricingUpdateOutputModel updateTransferpricing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransferPricingUpdateInputModel request);
	
}
