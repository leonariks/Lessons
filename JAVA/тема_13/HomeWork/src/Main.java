public class Main {
    public static void main(String[] args) {
        Instrument myGuitar = new Guitar(6);
        myGuitar.play();
        Instrument myDrum = new Drum(55.3);
        myDrum.play();
        Instrument myPipe = new Pipe(44.5);
        myPipe.play();
    }
}