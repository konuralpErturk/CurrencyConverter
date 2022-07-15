package https;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetCurrencyRatesFromTCMB
{
    JSONArray currencyList = null;
    public JSONArray execute() throws IOException
    {
        if(currencyList == null)
        {
            URL apiUrl                = new URL("https://www.tcmb.gov.tr/kurlar/today.xml");
            HttpURLConnection connect = (HttpURLConnection) apiUrl.openConnection();

            if(connect.getResponseCode() != 200)
                throw new RuntimeException("Connection error "+ connect.getResponseCode());

            InputStreamReader reader = new InputStreamReader(connect.getInputStream());
            BufferedReader bfReader  = new BufferedReader(reader);
            StringBuilder sb         = new StringBuilder();
            String line              = bfReader.readLine();
            while( line != null)
            {
                sb.append(line).append("\n");
                line = bfReader.readLine();
            }
            String xml2String = sb.toString();
            bfReader.close();
            JSONObject object = XML.toJSONObject(xml2String);
            currencyList = object.getJSONObject("Tarih_Date").getJSONArray("Currency");
            connect.disconnect();
        }
        return currencyList;
    }
}