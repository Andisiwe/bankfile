package za.ac.cput.bankfile;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;


/**
 * Created by student on 2015/02/20.
 */
public class TestDataRetrieval {
    DataRetrieval dr;

    @Before
    public void setUp() throws Exception {
        dr = new DataRetrievalImpl();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testRetrieval() throws Exception {
        String clientName = (String) dr.retrieveData().get("11111111");
        Assert.assertEquals(clientName, "Andisiwe");

    }
}
