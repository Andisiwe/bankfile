package za.ac.cput.bankfile;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by student on 2015/02/20.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestAccNumber.class,
        TestAccType.class,
        TestBankClients.class,
        TestDataRetrieval.class
})
public class BankRecordTestSuite {
}
