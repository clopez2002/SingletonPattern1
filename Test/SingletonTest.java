import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

//-------------------------------------------------------------------

    @Test
    public void test01SingletonInstanceCreated () {

        Singleton instance = Singleton.getInstance();
        Assert.assertNotNull(instance);
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}