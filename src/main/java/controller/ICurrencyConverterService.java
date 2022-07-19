package controller;

import java.io.IOException;
import java.util.List;

public interface ICurrencyConverterService {
    List getCurrencyList() throws IOException;

    List getCurrencyRefData() throws IOException;
}
