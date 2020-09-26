/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class ProductCombinationApiController {

	@Autowired
	ProductCombinationApiService service;
	
	@Fulfill.Activate
	public BianResponse<SDProductCombinationActivateOutputModel> activate(@RequestBody BianRequest<SDProductCombinationActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Fulfill.Configure
	public BianResponse<SDProductCombinationConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDProductCombinationConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("fulfillment")
	@Fulfill.Control
	public BianResponse<BQFulfillmentControlOutputModel> controlFulfillment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFulfillmentControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlFulfillment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Control
	public BianResponse<CRProductCombinationArrangementControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductCombinationArrangementControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("fulfillment")
	@Fulfill.Exchange
	public BianResponse<BQFulfillmentExchangeOutputModel> exchangeFulfillment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFulfillmentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeFulfillment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("transferpricing")
	@Fulfill.Exchange
	public BianResponse<BQTransferPricingExchangeOutputModel> exchangeTransferpricing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTransferPricingExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeTransferpricing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Exchange
	public BianResponse<CRProductCombinationArrangementExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductCombinationArrangementExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("fulfillment")
	@Fulfill.Execute
	public BianResponse<BQFulfillmentExecuteOutputModel> executeFulfillment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFulfillmentExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeFulfillment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Execute
	public BianResponse<CRProductCombinationArrangementExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductCombinationArrangementExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Feedback
	public BianResponse<SDProductCombinationFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDProductCombinationFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<CRProductCombinationArrangementInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRProductCombinationArrangementInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("embeddedproductcontrol")
	@Fulfill.Initiate
	public BianResponse<BQEmbeddedProductControlInitiateOutputModel> initiateEmbeddedproductcontrol(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQEmbeddedProductControlInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateEmbeddedproductcontrol(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("fulfillment")
	@Fulfill.Initiate
	public BianResponse<BQFulfillmentInitiateOutputModel> initiateFulfillment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQFulfillmentInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateFulfillment(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("fulfillment")
	@Fulfill.Request
	public BianResponse<BQFulfillmentRequestOutputModel> requestFulfillment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFulfillmentRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestFulfillment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("transferpricing")
	@Fulfill.Request
	public BianResponse<BQTransferPricingRequestOutputModel> requestTransferpricing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTransferPricingRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestTransferpricing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Request
	public BianResponse<CRProductCombinationArrangementRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductCombinationArrangementRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Retrieve
	public BianResponse<CRProductCombinationArrangementRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@BQ("embeddedproductcontrol")
	@Fulfill.Retrieve
	public BianResponse<BQEmbeddedProductControlRetrieveOutputModel> retrieveEmbeddedproductcontrol(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveEmbeddedproductcontrol(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("fulfillment")
	@Fulfill.Retrieve
	public BianResponse<BQFulfillmentRetrieveOutputModel> retrieveFulfillment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFulfillment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("transferpricing")
	@Fulfill.Retrieve
	public BianResponse<BQTransferPricingRetrieveOutputModel> retrieveTransferpricing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTransferpricing(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Fulfill.RetrieveSD
	public BianResponse<SDProductCombinationRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<CRProductCombinationArrangementUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductCombinationArrangementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("embeddedproductcontrol")
	@Fulfill.Update
	public BianResponse<BQEmbeddedProductControlUpdateOutputModel> updateEmbeddedproductcontrol(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQEmbeddedProductControlUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateEmbeddedproductcontrol(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("fulfillment")
	@Fulfill.Update
	public BianResponse<BQFulfillmentUpdateOutputModel> updateFulfillment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFulfillmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFulfillment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("transferpricing")
	@Fulfill.Update
	public BianResponse<BQTransferPricingUpdateOutputModel> updateTransferpricing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTransferPricingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTransferpricing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
