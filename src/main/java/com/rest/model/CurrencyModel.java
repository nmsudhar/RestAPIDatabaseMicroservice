package com.rest.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "Currencies")
public class CurrencyModel {

    @NotNull
    @Field("currencyName")
    private String currencyName;

    @NotNull
    @Field("updatedDate")
    private String updatedDate;

    @NotNull
    @Field("quotes")
    private List<QuotesModel> quotes = new ArrayList<>();

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public List<QuotesModel> getQuotes() {
        return quotes;
    }

    public CurrencyModel() {
    }

    public CurrencyModel(String currencyName, String updatedDate, QuotesModel quotes) {
        this.currencyName = currencyName;
        this.updatedDate = updatedDate;
        this.getQuotes().add(quotes);
    }
}
