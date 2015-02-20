package za.ac.cput.bankfile;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.bankfile.impl.BankRecordImp;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 2015/02/20.
 */
public class TestAccNumber {
    BankRecord br;

    @Before
    public void setUp() throws Exception {
        br = new BankRecordImp();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testAccNumber() throws Exception {
        Set<String> actual = new HashSet<String>();
        actual.add("33333333");
        actual.add("22222222");
        actual.add("11111111");

        Set accNum = br.accNumber();

        Assert.assertEquals(accNum, actual);

    }
}
