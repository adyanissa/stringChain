package stringCahin.stringCahin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AUnitTest {

	@Test
    public void testAWithStub() {
        // יוצרים סטאב של D
        BStub bstub = new BStub();

        A a = new A(bstub);

        String result = a.process("1");

        assertEquals("1H", result);
    }
}

// it supposd to return 1H
