package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBCashBalance1  {

    
    
    public enum CreditDebitIndicatorEnum {
        
        CREDIT ("Credit"), 
        
        DEBIT ("Debit"); 
        

        private final String value;

        CreditDebitIndicatorEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CreditDebitIndicatorEnum fromValue(String text) {
            for (CreditDebitIndicatorEnum b : CreditDebitIndicatorEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                return b;
                }
            }
            return null;
        }
    }

    private CreditDebitIndicatorEnum CreditDebitIndicator;

    
    private OBBalanceType1Code Type;
    private String AccountId;
    private java.time.LocalDateTime DateTime;
    private java.util.List<OBCreditLine1> CreditLine;
    private OBActiveOrHistoricCurrencyAndAmount Amount;

    public OBCashBalance1 () {
    }

    @JsonProperty("CreditDebitIndicator")
    public CreditDebitIndicatorEnum getCreditDebitIndicator() {
        return CreditDebitIndicator;
    }

    public void setCreditDebitIndicator(CreditDebitIndicatorEnum CreditDebitIndicator) {
        this.CreditDebitIndicator = CreditDebitIndicator;
    }

    @JsonProperty("Type")
    public OBBalanceType1Code getType() {
        return Type;
    }

    public void setType(OBBalanceType1Code Type) {
        this.Type = Type;
    }

    @JsonProperty("AccountId")
    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    @JsonProperty("DateTime")
    public java.time.LocalDateTime getDateTime() {
        return DateTime;
    }

    public void setDateTime(java.time.LocalDateTime DateTime) {
        this.DateTime = DateTime;
    }

    @JsonProperty("CreditLine")
    public java.util.List<OBCreditLine1> getCreditLine() {
        return CreditLine;
    }

    public void setCreditLine(java.util.List<OBCreditLine1> CreditLine) {
        this.CreditLine = CreditLine;
    }

    @JsonProperty("Amount")
    public OBActiveOrHistoricCurrencyAndAmount getAmount() {
        return Amount;
    }

    public void setAmount(OBActiveOrHistoricCurrencyAndAmount Amount) {
        this.Amount = Amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBCashBalance1 OBCashBalance1 = (OBCashBalance1) o;

        return Objects.equals(CreditDebitIndicator, OBCashBalance1.CreditDebitIndicator) &&
               Objects.equals(Type, OBCashBalance1.Type) &&
               Objects.equals(AccountId, OBCashBalance1.AccountId) &&
               Objects.equals(DateTime, OBCashBalance1.DateTime) &&
               Objects.equals(CreditLine, OBCashBalance1.CreditLine) &&
               Objects.equals(Amount, OBCashBalance1.Amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CreditDebitIndicator, Type, AccountId, DateTime, CreditLine, Amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBCashBalance1 {\n");
        sb.append("    CreditDebitIndicator: ").append(toIndentedString(CreditDebitIndicator)).append("\n");        sb.append("    Type: ").append(toIndentedString(Type)).append("\n");        sb.append("    AccountId: ").append(toIndentedString(AccountId)).append("\n");        sb.append("    DateTime: ").append(toIndentedString(DateTime)).append("\n");        sb.append("    CreditLine: ").append(toIndentedString(CreditLine)).append("\n");        sb.append("    Amount: ").append(toIndentedString(Amount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
