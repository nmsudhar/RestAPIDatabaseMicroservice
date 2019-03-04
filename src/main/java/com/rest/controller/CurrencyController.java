package com.rest.controller;

import com.rest.model.CurrencyModel;
import com.rest.model.CurrencyModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/database/currencies")
public class CurrencyController {

    private CurrencyModelRepository repository;

    @Autowired
    public void setRepository(CurrencyModelRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createBook(@RequestBody CurrencyModel currencyModel) {
        repository.save(currencyModel);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<CurrencyModel> findAllBooks() {
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{name}")
    public CurrencyModel findBookById(@PathVariable String name) {
        return repository.findByCurrencyName(name);
    }
}
