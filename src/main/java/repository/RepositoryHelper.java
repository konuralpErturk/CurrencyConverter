package repository;

import java.util.HashMap;

import static util.CurrencyRateTypes.*;
import static util.CurrencyRateTypes.BANKNOTE_SELLING;
import static util.TCMBConstants.CURRENCY_CODE;
import static util.TCMBConstants.CURRENCY_NAME;

public interface RepositoryHelper
{
    static HashMap<String,Object> mapToCurrencyInfo(Object item)
    {
        HashMap<String,Object> resultMap  = new HashMap<>();
        HashMap<String,Object> convertMap = (HashMap) item;

        resultMap.put(CURRENCY_CODE.getCamelCaseName()    , convertMap.get(CURRENCY_CODE.getCamelCaseName()));
        resultMap.put(CURRENCY_NAME.getCamelCaseName()    , convertMap.get(CURRENCY_NAME.getCamelCaseName()));
        resultMap.put(FOREX_BUYING.getCamelCaseName()     , convertMap.get(FOREX_BUYING.getCamelCaseName()));
        resultMap.put(FOREX_SELLING.getCamelCaseName()    , convertMap.get(FOREX_SELLING.getCamelCaseName()));
        resultMap.put(BANKNOTE_BUYING.getCamelCaseName()  , convertMap.get(BANKNOTE_BUYING.getCamelCaseName()));
        resultMap.put(BANKNOTE_SELLING.getCamelCaseName() , convertMap.get(BANKNOTE_SELLING.getCamelCaseName()));

        return resultMap;
    }
}
