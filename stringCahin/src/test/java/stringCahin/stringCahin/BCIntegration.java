package stringCahin.stringCahin;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BCIntegration {

    @Test
    public void testIntegration_BtoC() {
        DStub dStub = new DStub();   // نوقف السلسلة بعد C
        C c = new C(dStub);
        B b = new B(c);

        String result = b.process("H");

        // B تضيف E → HE
        // C تضيف L → HEL
        assertEquals("HEL", result);
    }
}
