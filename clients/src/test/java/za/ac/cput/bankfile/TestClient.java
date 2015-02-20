package za.ac.cput.bankfile;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class TestClient {
    Client cl;

    @Before
    public void setUp() throws Exception {
        cl = new ClientImp();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testClient() throws Exception {
        String name = cl.bankClients().get(0);
        Assert.assertEquals(name, "Andisiwe");

    }
}
