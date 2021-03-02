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

    @Test
    public void test02WhenSeconfInstanceOfSingletonIsRequieredTheOnlyOneIsDelivered () {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Assert.assertEquals(instance1,instance2);
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}