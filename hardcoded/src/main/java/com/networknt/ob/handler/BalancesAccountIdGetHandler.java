package com.networknt.ob.handler;

import com.networknt.handler.LightHttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;
import java.util.HashMap;
import java.util.Map;

public class BalancesAccountIdGetHandler implements LightHttpHandler {
    
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        String userId = "stevehu";
        String accountId = exchange.getQueryParameters().get("AccountId").getFirst();
        String responseBody = null;
        if("stevehu".equals(userId)) {
            switch(accountId) {
                case "22289":
                    responseBody = "{\"Data\":{\"Balance\":[{\"AccountId\":\"22289\",\"Amount\":{\"Amount\":\"1230.00\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Credit\",\"Type\":\"InterimAvailable\",\"DateTime\":\"2017-04-05T10:43:07+00:00\",\"CreditLine\":[{\"Included\":true,\"Amount\":{\"Amount\":\"1000.00\",\"Currency\":\"GBP\"},\"Type\":\"PreAgreed\"}]}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/balances/accounts/22289\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
                case "31820":
                    responseBody = "{\"Data\":{\"Balance\":[{\"AccountId\":\"31820\",\"Amount\":{\"Amount\":\"57.36\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Debit\",\"Type\":\"InterimBooked\",\"DateTime\":\"2017-05-02T14:22:09+00:00\"}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/balances/accounts/31820\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
            }
        } else if("ericbroda".equals(userId)) {
            switch(accountId) {
                case "42281":
                    responseBody = "{\"Data\":{\"Balance\":[{\"AccountId\":\"42281\",\"Amount\":{\"Amount\":\"1230.00\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Credit\",\"Type\":\"InterimAvailable\",\"DateTime\":\"2017-04-05T10:43:07+00:00\",\"CreditLine\":[{\"Included\":true,\"Amount\":{\"Amount\":\"1000.00\",\"Currency\":\"GBP\"},\"Type\":\"PreAgreed\"}]}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/balances/accounts/42281\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
                case "41221":
                    responseBody = "{\"Data\":{\"Balance\":[{\"AccountId\":\"41221\",\"Amount\":{\"Amount\":\"57.36\",\"Currency\":\"GBP\"},\"CreditDebitIndicator\":\"Debit\",\"Type\":\"InterimBooked\",\"DateTime\":\"2017-05-02T14:22:09+00:00\"}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/balances/accounts/41221\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
            }
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
