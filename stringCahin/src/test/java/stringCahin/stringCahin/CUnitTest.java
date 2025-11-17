package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class CUnitTest {
    @Test
    public void testCWithStub() {
        // יוצרים סטאב של D
        DStub stub = new DStub();

        C c = new C(stub);

        String result = c.process("HE");

        assertEquals("HEL", result);
    }
}