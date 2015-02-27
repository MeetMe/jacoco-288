package local.jhansche.jacocoandroid;

import android.util.Log;

/**
 * @author jhansche
 * @since 2/27/15
 */
public class MyClass {
    public void tested(int i) {
        if (i > 0) {
            Log.v(MyClass.class.getSimpleName(), "i is positive");
        } else if (i < 0) {
            Log.v(MyClass.class.getSimpleName(), "i is negative");
        }
    }

    public void untested(int i) {
        if (i == 0) throw new UnsupportedOperationException();
    }
}
