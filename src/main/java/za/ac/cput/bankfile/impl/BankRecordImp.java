package za.ac.cput.bankfile.impl;

import za.ac.cput.bankfile.Account;
import za.ac.cput.bankfile.BankRecord;

import java.util.*;

/**
 * Created by student on 2015/02/20.
 */
public class BankRecordImp implements BankRecord {
    @Override
    public Collection<Account> accType() {
        Collection<Account> accs = new HashSet<Account>();

        return accs;
    }

    @Override
    public List<String> bankClients() {
            List<String> clients = new ArrayList<String>();
            clients.add("Andisiwe");
            clients.add("Yamkela");
            clients.add("Peter");

            return clients;
    }

    @Override
    public Set<String> accNumber() {
        Set<String> accNo = new HashSet<String>();
        accNo.add("11111111");
        accNo.add("22222222");
        accNo.add("33333333");

        return accNo;
    }

    @Override
    public Map<String, String> dataRetrieval() {
        Map getClient = new HashMap();
        getClient.put("11111111", "Andisiwe");
        getClient.put("22222222", "Yamkela");
        getClient.put("33333333", "Peter");

        return getClient;
    }
}
