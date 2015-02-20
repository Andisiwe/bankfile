package za.ac.cput.bankfile;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 2015/02/19.
 */
public class AccountNoImpl implements AccountNo {
    @Override
    public Set<String> accNumber() {
        Set<String> accNo = new HashSet<String>();
        accNo.add("11111111");
        accNo.add("22222222");
        accNo.add("33333333");

        return accNo;
    }
}
