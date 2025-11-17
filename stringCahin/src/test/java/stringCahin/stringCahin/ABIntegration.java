package stringCahin.stringCahin;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ABIntegration {

    @Test
    public void testIntegration_AtoB() {
        CStub cStub = new CStub();   // 
        B b = new B(cStub);
        A a = new A(b);

        String result = a.process("");

       
        assertEquals("HE", result);
    }
}
