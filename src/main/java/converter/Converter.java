package converter;

import repository.CurrencyRatesRepositoryImpl;

import java.io.IOException;

public class Converter
{
    public static void main(String[] args) throws IOException {
        CurrencyRatesRepositoryImpl repository = new CurrencyRatesRepositoryImpl();
        System.out.println(repository.getCurrencyList());
    }
}