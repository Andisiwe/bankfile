package za.ac.cput.bankfile;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 2015/02/19.
 */
public class TestAccountNoImpl {
    AccountNo accNo;

    @Before
    public void setUp() throws Exception {
        accNo = new AccountNoImpl();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testAccountNo() throws Exception {
        Set<String> actual = new HashSet<String>();
        actual.add("33333333");
        actual.add("22222222");
        actual.add("11111111");

        Set accNum = accNo.accNumber();

        Assert.assertEquals(accNum, actual);

    }
}
