package za.ac.cput.bankfile;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.bankfile.impl.BankRecordImp;

/**
 * Created by student on 2015/02/20.
 */
public class TestBankClients {
    BankRecord br;

    @Before
    public void setUp() throws Exception {
        br = new BankRecordImp();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testBankClients() throws Exception {
        String name = br.bankClients().get(0);
        Assert.assertEquals(name, "Andisiwe");


    }
}
