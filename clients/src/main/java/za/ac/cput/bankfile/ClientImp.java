package za.ac.cput.bankfile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/20.
 */
public class ClientImp implements Client {
    @Override
    public List<String> bankClients() {
        List<String> clients = new ArrayList<String>();
        clients.add("Andisiwe");
        clients.add("Yamkela");
        clients.add("Peter");

        return clients;
    }
}
