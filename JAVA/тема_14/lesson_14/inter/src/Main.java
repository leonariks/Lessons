public class Main {
    public static void main(String[] args) {
        Order myOrder = new Order(12,1200);
        System.out.println(myOrder.getId());
    }
}

class Order implements OrderInt<Integer>{
    int price;
    int id;

    Order(int id, int price){
        this.id = id;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
    this.price = price;
    }

    @Override
    public Integer getId() {
        return id;
    }
}