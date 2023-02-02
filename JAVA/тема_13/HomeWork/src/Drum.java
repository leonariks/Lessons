public class Drum implements Instrument {
    double size;

    public Drum(double size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.printf("Играет барабан,его размер = %f\n", size);
    }
}
