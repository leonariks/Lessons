public class Tiles {
    String brand;
    double size_h;
    double size_w;
    double price;


    Tiles(String str, double d,double c, double p){

        this.brand = str;
        this.size_h = d;
        this.size_w = c;
        this.price = p;
    }

    Tiles(){

    }

    Tiles(String str, double p){

        brand = str;
        size_h = 0;
        size_w = 0;
        price = p;
    }


    void getData(){
        System.out.printf("Брэнд: %s, высота: %f, ширина: %f, цена: %f \n", brand, size_h, size_w, price);
    }
}
