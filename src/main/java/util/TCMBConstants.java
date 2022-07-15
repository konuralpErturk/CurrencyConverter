package util;

public enum TCMBConstants
{
    CURRENCY_CODE("CurrencyCode"),
    CURRENCY_NAME("CurrencyName"),
    CURRENCY_RATES("CurrencyRate");

    private String constantType;

    TCMBConstants(String constantType) {
        this.constantType = constantType;
    }
    public String getCamelCaseName()
    {
        return constantType;
    }
}
