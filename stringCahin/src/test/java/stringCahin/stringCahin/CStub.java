package stringCahin.stringCahin;

public class CStub extends C {

    public CStub() {
        super(null);   // C العادية تحتاج D بالكونستركتور
    }

    @Override
    public String process(String prefix) {
        // نوقف السلسلة بعد B
        return prefix +"";
    }
}