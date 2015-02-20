package za.ac.cput.bankfile;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.bankfile.impl.BankRecordImp;

/**
 * Created by student on 2015/02/20.
 */
public class TestDataRetrieval {
    BankRecord br;

    @Before
    public void setUp() throws Exception {
        br = new BankRecordImp();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testDataRetrieval() throws Exception {
        String clientName = (String) br.dataRetrieval().get("11111111");
        Assert.assertEquals(clientName, "Andisiwe");


    }
}
