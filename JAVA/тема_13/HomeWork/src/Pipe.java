public class Pipe implements Instrument {
    double diameter;

    public Pipe(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.printf("Играет труба, её диаметр = %f\n", diameter);
    }
}
