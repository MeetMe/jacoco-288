package local.jhansche.jacocoandroid;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MyClassTest {
    private MyClass mObj;

    @Before
    public void setUp() {
        mObj = new MyClass();
    }

    @Test
    public void testPositive() {
        mObj.tested(5);
    }

    @Test
    public void testNegative() {
        mObj.tested(-5);
    }

    @Test
    public void testZero() {
        mObj.tested(0);
    }
}
