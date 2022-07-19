package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class CurrencyConverterController {
    @Autowired
    ICurrencyConverterService currencyConverterService;

    @GetMapping("/currencyList")
    public List getCurrencyList() throws IOException {
        return currencyConverterService.getCurrencyList();
    };

    @GetMapping("/currencyRefData")
    public List getCurrencyRefData() throws IOException {
        return currencyConverterService.getCurrencyRefData();
    };
}
