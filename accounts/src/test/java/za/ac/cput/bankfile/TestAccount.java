package za.ac.cput.bankfile;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by student on 2015/02/20.
 */
public class TestAccount {
    Account acc;
    Account acc2;

    @Before
    public void setUp() throws Exception {
        acc = new AccountImpl();
        acc2 = new AccountImpl();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testAcc() throws Exception {
        Collection<Account> accCol = new HashSet<Account>();

        accCol.add(acc);
        accCol.add(acc2);
        Assert.assertTrue("Compares what they contain", !acc.equals(acc2));

    }
}
