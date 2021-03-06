package com.networknt.ob.handler;

import com.networknt.handler.LightHttpHandler;
import com.networknt.httpstring.AttachmentConstants;
import com.networknt.utility.Constants;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;
import java.util.HashMap;
import java.util.Map;

public class BalancesGetHandler implements LightHttpHandler {
    
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        Map<String, Object> auditInfo = exchange.getAttachment(AttachmentConstants.AUDIT_INFO);
        String userId = (String)auditInfo.get(Constants.USER_ID_STRING);
        String responseBody = null;
        if("stevehu".equals(userId)) {
            responseBody = "{\"Data\":{\"Balance\":[{\"AccountId\":\"22289\",\"Amount\":{\"Amount\":\"1230.00\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Credit\",\"Type\":\"InterimAvailable\",\"DateTime\":\"2017-04-05T10:43:07+00:00\",\"CreditLine\":[{\"Included\":true,\"Amount\":{\"Amount\":\"1000.00\",\"Currency\":\"GBP\"},\"Type\":\"PreAgreed\"}]},{\"AccountId\":\"31820\",\"Amount\":{\"Amount\":\"57.36\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Debit\",\"Type\":\"InterimBooked\",\"DateTime\":\"2017-05-02T14:22:09+00:00\"}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/balances/\"},\"Meta\":{\"TotalPages\":1}}";
        } else if ("ericbroda".equals(userId)) {
            responseBody = "{\"Data\":{\"Balance\":[{\"AccountId\":\"42281\",\"Amount\":{\"Amount\":\"1230.00\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Credit\",\"Type\":\"InterimAvailable\",\"DateTime\":\"2017-04-05T10:43:07+00:00\",\"CreditLine\":[{\"Included\":true,\"Amount\":{\"Amount\":\"1000.00\",\"Currency\":\"GBP\"},\"Type\":\"PreAgreed\"}]},{\"AccountId\":\"41221\",\"Amount\":{\"Amount\":\"57.36\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Debit\",\"Type\":\"InterimBooked\",\"DateTime\":\"2017-05-02T14:22:09+00:00\"}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/balances/\"},\"Meta\":{\"TotalPages\":1}}";
        }
        if(responseBody != null) {
            exchange.getResponseHeaders().add(new HttpString("Content-Type"), "application/json");
            exchange.getResponseSender().send(responseBody);
        } else {
            exchange.setStatusCode(404);
            exchange.getResponseSender().send("");
        }
    }
}
