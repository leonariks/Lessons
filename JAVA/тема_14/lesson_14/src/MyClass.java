public class MyClass {

    private String stringVal;

    MyClass() {

    }

    <T> MyClass(T val) {
        stringVal = val.toString();
    }

    public String getStringVal() {
        return stringVal;
    }
}
