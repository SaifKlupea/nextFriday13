import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class AppTest {

    private Logger log = Logger.getLogger(AppTest.class.getName());


    @Before
    public void setUp() throws Exception {
        log.info("setUp Test");
    }

    @After
    public void tearDown() throws Exception {
        log.info("tearDown Test");
    }

    @Test
    public void main() {
        Assert.assertEquals("this test is success : ", 1, 1);
    }
}