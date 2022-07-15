package repository;

import java.io.IOException;
import java.util.List;

public interface CurrencyRatesRepository {
    List<Object> getCurrencyList() throws IOException;
}
