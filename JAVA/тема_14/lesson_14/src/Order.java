public class Order<T, S> {
    private T id;
    private String address;
    private S price;

    Order(T id, String address, S price) {
        this.id = id;
        this.address = address;
        this.price = price;
    }

    public T getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public S getPrice() {
        return price;
    }

    public void setPrice(S price) {
        this.price = price;
    }
}
