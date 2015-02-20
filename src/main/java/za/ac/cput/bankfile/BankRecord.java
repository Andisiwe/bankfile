package za.ac.cput.bankfile;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by student on 2015/02/20.
 */
public interface BankRecord extends Account {
    Collection<Account> accType();
    List<String> bankClients();
    Set<String> accNumber();
    Map<String, String> dataRetrieval();
}
