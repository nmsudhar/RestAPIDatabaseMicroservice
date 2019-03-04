package com.rest;

import com.rest.model.CurrencyModel;
import com.rest.model.CurrencyModelRepository;
import com.rest.model.QuotesModel;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestApiTest {

    private CurrencyModelRepository repository;
    private QuotesModel quotes;
    private CurrencyModel currencyModel;
    private String time = "0915";
    private String price = "14.35";
    private String currencyName = "Test BTC";
    private String updatedDate = "20180507";

    @Autowired
    public void setRepository(CurrencyModelRepository repository) {
        this.repository = repository;
    }

    @Before
    public void setUp() {
        quotes = new QuotesModel(time, price);
        currencyModel = new CurrencyModel(currencyName, updatedDate, quotes);
    }

    @Test
    public void shouldCreateCurrencyRecord() {
        CurrencyModel currencyModelResult = repository.save(currencyModel);

        assertThat(currencyName, is(currencyModelResult.getCurrencyName()));
        assertThat(updatedDate, is(currencyModelResult.getUpdatedDate()));
        assertThat(time, is(currencyModelResult.getQuotes().get(0).getTime()));
        assertThat(price, is(currencyModelResult.getQuotes().get(0).getPrice()));
    }

    @Test
    public void shouldGetFindAllCurrenciesResult() {
        repository.save(currencyModel);

        List<CurrencyModel> currencies = repository.findAll();

        assertNotNull(currencies);
        assertTrue(currencies.size() > 0);
    }

    @Test
    public void shouldGetFindCurrencyByName() {
        repository.save(currencyModel);

        CurrencyModel currencyModel = repository.findByCurrencyName(currencyName);

        assertNotNull(currencyModel);
        assertThat(currencyName, is(currencyModel.getCurrencyName()));
    }

    @Test
    public void shouldNotGetFindCurrencyByName() {
        repository.save(currencyModel);

        CurrencyModel currencyModel = repository.findByCurrencyName("LTCT");

        assertNull(currencyModel);
    }

}
