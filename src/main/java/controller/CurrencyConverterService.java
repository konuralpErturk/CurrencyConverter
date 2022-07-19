package controller;

import org.springframework.stereotype.Service;
import repository.CurrencyRatesRepositoryImpl;

import java.io.IOException;
import java.util.List;

@Service
public class CurrencyConverterService implements ICurrencyConverterService {
    public List getCurrencyList() throws IOException {
        CurrencyRatesRepositoryImpl repository = new CurrencyRatesRepositoryImpl();
        return repository.getCurrencyList();
    }

    public List getCurrencyRefData() throws IOException {
        CurrencyRatesRepositoryImpl repository = new CurrencyRatesRepositoryImpl();
        return repository.getCurrencyListRefData();
    }

}
