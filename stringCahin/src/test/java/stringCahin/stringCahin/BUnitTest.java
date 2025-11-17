package stringCahin.stringCahin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BUnitTest {

	@Test
    public void testBWithStub() {
       
        CStub cstub = new CStub();

        B b = new B(cstub);

        String result = b.process("Adyan");

        assertEquals("AdyanE", result);
    }
}
