package com.rest;

import com.rest.model.CurrencyModel;
import com.rest.model.CurrencyModelRepository;
import com.rest.model.QuotesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private CurrencyModelRepository repository;

    @Autowired
    public void setRepository(CurrencyModelRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... arg0) {
        btcDataSetup();
        etcDataSetup();
        ltcDataSetup();
    }

    private void btcDataSetup() {
        QuotesModel quotesModel1 = new QuotesModel();
        quotesModel1.setTime("0915");
        quotesModel1.setPrice("34.98");
        QuotesModel quotesModel2 = new QuotesModel();
        quotesModel2.setTime("1045");
        quotesModel2.setPrice("36.13");
        QuotesModel quotesModel3 = new QuotesModel();
        quotesModel3.setTime("1230");
        quotesModel3.setPrice("37.01");
        QuotesModel quotesModel4 = new QuotesModel();
        quotesModel4.setTime("1400");
        quotesModel4.setPrice("35.98");
        QuotesModel quotesModel5 = new QuotesModel();
        quotesModel5.setTime("1530");
        quotesModel5.setPrice("33.56");
        List<QuotesModel> quotesModelList = new ArrayList<>();
        quotesModelList.add(quotesModel1);
        quotesModelList.add(quotesModel2);
        quotesModelList.add(quotesModel3);
        quotesModelList.add(quotesModel4);
        quotesModelList.add(quotesModel5);
        CurrencyModel currencyModelBTC = new CurrencyModel();
        currencyModelBTC.setCurrencyName("BTC");
        currencyModelBTC.setUpdatedDate("20180507");
        currencyModelBTC.getQuotes().addAll(quotesModelList);
        repository.save(currencyModelBTC);
    }
    private void etcDataSetup() {
        QuotesModel quotesModel1 = new QuotesModel();
        quotesModel1.setTime("0900");
        quotesModel1.setPrice("1.45");
        QuotesModel quotesModel2 = new QuotesModel();
        quotesModel2.setTime("1030");
        quotesModel2.setPrice("1.87");
        QuotesModel quotesModel3 = new QuotesModel();
        quotesModel3.setTime("1245");
        quotesModel3.setPrice("1.55");
        QuotesModel quotesModel4 = new QuotesModel();
        quotesModel4.setTime("1515");
        quotesModel4.setPrice("2.01");
        QuotesModel quotesModel5 = new QuotesModel();
        quotesModel5.setTime("1700");
        quotesModel5.setPrice("2.15");
        List<QuotesModel> quotesModelList = new ArrayList<>();
        quotesModelList.add(quotesModel1);
        quotesModelList.add(quotesModel2);
        quotesModelList.add(quotesModel3);
        quotesModelList.add(quotesModel4);
        quotesModelList.add(quotesModel5);
        CurrencyModel currencyModelBTC = new CurrencyModel();
        currencyModelBTC.setCurrencyName("ETC");
        currencyModelBTC.setUpdatedDate("20180507");
        currencyModelBTC.getQuotes().addAll(quotesModelList);
        repository.save(currencyModelBTC);
    }
    private void ltcDataSetup() {
        QuotesModel quotesModel1 = new QuotesModel();
        quotesModel1.setTime("0930");
        quotesModel1.setPrice("14.32");
        QuotesModel quotesModel2 = new QuotesModel();
        quotesModel2.setTime("1115");
        quotesModel2.setPrice("14.87");
        QuotesModel quotesModel3 = new QuotesModel();
        quotesModel3.setTime("1245");
        quotesModel3.setPrice("15.03");
        QuotesModel quotesModel4 = new QuotesModel();
        quotesModel4.setTime("1400");
        quotesModel4.setPrice("14.76");
        QuotesModel quotesModel5 = new QuotesModel();
        quotesModel5.setTime("1700");
        quotesModel5.setPrice("14.15");
        List<QuotesModel> quotesModelList = new ArrayList<>();
        quotesModelList.add(quotesModel1);
        quotesModelList.add(quotesModel2);
        quotesModelList.add(quotesModel3);
        quotesModelList.add(quotesModel4);
        quotesModelList.add(quotesModel5);
        CurrencyModel currencyModelBTC = new CurrencyModel();
        currencyModelBTC.setCurrencyName("LTC");
        currencyModelBTC.setUpdatedDate("20180507");
        currencyModelBTC.getQuotes().addAll(quotesModelList);
        repository.save(currencyModelBTC);
    }

}
