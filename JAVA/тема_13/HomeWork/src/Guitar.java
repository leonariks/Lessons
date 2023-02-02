public class Guitar implements Instrument {

    int countstring;

    public Guitar(int countstring) {
        this.countstring = countstring;
    }

    @Override
    public void play() {
        System.out.printf("Играет гитара,кол-во струн = %d\n", countstring);
    }
}
