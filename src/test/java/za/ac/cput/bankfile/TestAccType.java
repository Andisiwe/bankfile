package za.ac.cput.bankfile;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import za.ac.cput.bankfile.Account;
import za.ac.cput.bankfile.impl.BankRecordImp;

import java.util.Collection;
import java.util.HashSet;


/**
 * Created by student on 2015/02/20.
 */
public class TestAccType {
    BankRecord bankRec;
    BankRecord bank;

    @Before
    public void setUp() throws Exception {
        bankRec = new BankRecordImp();
        bank = new BankRecordImp();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testAccType() throws Exception {
        Collection<Account> accCol = new HashSet<Account>();

        accCol.add(bankRec);
        accCol.add(bank);
        Assert.assertTrue("Compares what they contain", !bankRec.equals(bank));

    }


}
