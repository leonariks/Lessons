public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyClass<String,Integer,Boolean> myClass = new MyClass<>("Cat",10,false);
        System.out.println(myClass.getT());
        System.out.println(myClass.getV());
        System.out.println(myClass.getK());
        myClass.printTypesInfo();
    }
}

class MyClass<T,V,K>{

    private T t;
    private V v;
    private K k;

    MyClass(T t, V v, K k){
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }
    public void printTypesInfo(){
        System.out.println(t.getClass().getName() + "\n" + v.getClass().getName() + "\n" + k.getClass().getName());
    }
}