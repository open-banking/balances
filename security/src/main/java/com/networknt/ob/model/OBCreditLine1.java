package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBCreditLine1  {

    private OBExternalLimitType1Code Type;
    private Boolean Included;
    private OBActiveOrHistoricCurrencyAndAmount Amount;

    public OBCreditLine1 () {
    }

    @JsonProperty("Type")
    public OBExternalLimitType1Code getType() {
        return Type;
    }

    public void setType(OBExternalLimitType1Code Type) {
        this.Type = Type;
    }

    @JsonProperty("Included")
    public Boolean getIncluded() {
        return Included;
    }

    public void setIncluded(Boolean Included) {
        this.Included = Included;
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

        OBCreditLine1 OBCreditLine1 = (OBCreditLine1) o;

        return Objects.equals(Type, OBCreditLine1.Type) &&
               Objects.equals(Included, OBCreditLine1.Included) &&
               Objects.equals(Amount, OBCreditLine1.Amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Type, Included, Amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBCreditLine1 {\n");
        sb.append("    Type: ").append(toIndentedString(Type)).append("\n");        sb.append("    Included: ").append(toIndentedString(Included)).append("\n");        sb.append("    Amount: ").append(toIndentedString(Amount)).append("\n");
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
