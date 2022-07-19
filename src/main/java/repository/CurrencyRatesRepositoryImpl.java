package repository;

import https.GetCurrencyRatesFromTCMB;
import org.json.JSONArray;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class CurrencyRatesRepositoryImpl implements CurrencyRatesRepository, RepositoryHelper {
    @Override
    public List<Object> getCurrencyList() throws IOException {
        GetCurrencyRatesFromTCMB currencyRates = new GetCurrencyRatesFromTCMB();
        JSONArray currencyList                 = currencyRates.execute();

        return currencyList.toList()
                .stream()
                .map(RepositoryHelper::mapToCurrencyInfo)
                .collect(Collectors.toList());
    }

    @Override
    public List<Object> getCurrencyListRefData() throws IOException {
        return getCurrencyList().stream()
                .map(RepositoryHelper::mapToReferenceData)
                .collect(Collectors.toList());
    }
}
