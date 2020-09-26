/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ProductCombinationApiServiceImpl implements ProductCombinationApiService {

	public SDProductCombinationActivateOutputModel activate(SDProductCombinationActivateInputModel request){
		return JsonReader.read("activate-SDProductCombinationActivateOutputModel.json",new TypeReference<SDProductCombinationActivateOutputModel>(){});
	}
	
	public SDProductCombinationConfigureOutputModel configure(String sdReferenceId, SDProductCombinationConfigureInputModel request){
		return JsonReader.read("configure-SDProductCombinationConfigureOutputModel.json",new TypeReference<SDProductCombinationConfigureOutputModel>(){});
	}
	
	public BQFulfillmentControlOutputModel controlFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentControlInputModel request){
		return JsonReader.read("control-BQFulfillmentControlOutputModel.json",new TypeReference<BQFulfillmentControlOutputModel>(){});
	}
	
	public CRProductCombinationArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRProductCombinationArrangementControlInputModel request){
		return JsonReader.read("control-CRProductCombinationArrangementControlOutputModel.json",new TypeReference<CRProductCombinationArrangementControlOutputModel>(){});
	}
	
	public BQFulfillmentExchangeOutputModel exchangeFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentExchangeInputModel request){
		return JsonReader.read("exchange-BQFulfillmentExchangeOutputModel.json",new TypeReference<BQFulfillmentExchangeOutputModel>(){});
	}
	
	public BQTransferPricingExchangeOutputModel exchangeTransferpricing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransferPricingExchangeInputModel request){
		return JsonReader.read("exchange-BQTransferPricingExchangeOutputModel.json",new TypeReference<BQTransferPricingExchangeOutputModel>(){});
	}
	
	public CRProductCombinationArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRProductCombinationArrangementExchangeInputModel request){
		return JsonReader.read("exchange-CRProductCombinationArrangementExchangeOutputModel.json",new TypeReference<CRProductCombinationArrangementExchangeOutputModel>(){});
	}
	
	public BQFulfillmentExecuteOutputModel executeFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentExecuteInputModel request){
		return JsonReader.read("execute-BQFulfillmentExecuteOutputModel.json",new TypeReference<BQFulfillmentExecuteOutputModel>(){});
	}
	
	public CRProductCombinationArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRProductCombinationArrangementExecuteInputModel request){
		return JsonReader.read("execute-CRProductCombinationArrangementExecuteOutputModel.json",new TypeReference<CRProductCombinationArrangementExecuteOutputModel>(){});
	}
	
	public SDProductCombinationFeedbackOutputModel feedback(String sdReferenceId, SDProductCombinationFeedbackInputModel request){
		return JsonReader.read("feedback-SDProductCombinationFeedbackOutputModel.json",new TypeReference<SDProductCombinationFeedbackOutputModel>(){});
	}
	
	public CRProductCombinationArrangementInitiateOutputModel initiate(String sdReferenceId, CRProductCombinationArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRProductCombinationArrangementInitiateOutputModel.json",new TypeReference<CRProductCombinationArrangementInitiateOutputModel>(){});
	}
	
	public BQEmbeddedProductControlInitiateOutputModel initiateEmbeddedproductcontrol(String sdReferenceId, String crReferenceId, BQEmbeddedProductControlInitiateInputModel request){
		return JsonReader.read("initiate-BQEmbeddedProductControlInitiateOutputModel.json",new TypeReference<BQEmbeddedProductControlInitiateOutputModel>(){});
	}
	
	public BQFulfillmentInitiateOutputModel initiateFulfillment(String sdReferenceId, String crReferenceId, BQFulfillmentInitiateInputModel request){
		return JsonReader.read("initiate-BQFulfillmentInitiateOutputModel.json",new TypeReference<BQFulfillmentInitiateOutputModel>(){});
	}
	
	public BQFulfillmentRequestOutputModel requestFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentRequestInputModel request){
		return JsonReader.read("request-BQFulfillmentRequestOutputModel.json",new TypeReference<BQFulfillmentRequestOutputModel>(){});
	}
	
	public BQTransferPricingRequestOutputModel requestTransferpricing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransferPricingRequestInputModel request){
		return JsonReader.read("request-BQTransferPricingRequestOutputModel.json",new TypeReference<BQTransferPricingRequestOutputModel>(){});
	}
	
	public CRProductCombinationArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductCombinationArrangementRequestInputModel request){
		return JsonReader.read("request-CRProductCombinationArrangementRequestOutputModel.json",new TypeReference<CRProductCombinationArrangementRequestOutputModel>(){});
	}
	
	public CRProductCombinationArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRProductCombinationArrangementRetrieveOutputModel.json",new TypeReference<CRProductCombinationArrangementRetrieveOutputModel>(){});
	}
	
	public BQEmbeddedProductControlRetrieveOutputModel retrieveEmbeddedproductcontrol(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQEmbeddedProductControlRetrieveOutputModel.json",new TypeReference<BQEmbeddedProductControlRetrieveOutputModel>(){});
	}
	
	public BQFulfillmentRetrieveOutputModel retrieveFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFulfillmentRetrieveOutputModel.json",new TypeReference<BQFulfillmentRetrieveOutputModel>(){});
	}
	
	public BQTransferPricingRetrieveOutputModel retrieveTransferpricing(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTransferPricingRetrieveOutputModel.json",new TypeReference<BQTransferPricingRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDProductCombinationRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDProductCombinationRetrieveOutputModel.json",new TypeReference<SDProductCombinationRetrieveOutputModel>(){});
	}
	
	public CRProductCombinationArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductCombinationArrangementUpdateInputModel request){
		return JsonReader.read("update-CRProductCombinationArrangementUpdateOutputModel.json",new TypeReference<CRProductCombinationArrangementUpdateOutputModel>(){});
	}
	
	public BQEmbeddedProductControlUpdateOutputModel updateEmbeddedproductcontrol(String sdReferenceId, String crReferenceId, String bqReferenceId, BQEmbeddedProductControlUpdateInputModel request){
		return JsonReader.read("update-BQEmbeddedProductControlUpdateOutputModel.json",new TypeReference<BQEmbeddedProductControlUpdateOutputModel>(){});
	}
	
	public BQFulfillmentUpdateOutputModel updateFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentUpdateInputModel request){
		return JsonReader.read("update-BQFulfillmentUpdateOutputModel.json",new TypeReference<BQFulfillmentUpdateOutputModel>(){});
	}
	
	public BQTransferPricingUpdateOutputModel updateTransferpricing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransferPricingUpdateInputModel request){
		return JsonReader.read("update-BQTransferPricingUpdateOutputModel.json",new TypeReference<BQTransferPricingUpdateOutputModel>(){});
	}
	
}
