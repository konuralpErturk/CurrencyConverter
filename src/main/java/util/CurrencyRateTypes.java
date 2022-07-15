package util;

public enum CurrencyRateTypes {
    FOREX_BUYING("ForexBuying"),
    FOREX_SELLING("ForexSelling"),
    BANKNOTE_BUYING("BanknoteBuying"),
    BANKNOTE_SELLING("BanknoteSelling");

    private String rateType;

    CurrencyRateTypes(String rateType) {
        this.rateType = rateType;
    }

    public String getCamelCaseName()
    {
        return rateType;
    }
}
