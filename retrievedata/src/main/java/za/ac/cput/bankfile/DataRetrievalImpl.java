package za.ac.cput.bankfile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/02/20.
 */
public class DataRetrievalImpl implements DataRetrieval {
    @Override
    public Map<String, String> retrieveData() {
        Map getClient = new HashMap();
        getClient.put("11111111", "Andisiwe");
        getClient.put("22222222", "Yamkela");
        getClient.put("33333333", "Peter");

        return getClient;
    }
}
