public class TapeDeck {
    boolean canRecord = false;
    boolean recordTape = true;
    void playTape() {
        System.out.println("пленка проигрывается");
    }
    void recordTape() {
        System.out.println("идет запись на пленку");
    }
}
class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();

        if(t.recordTape == true) {
            t.recordTape();
        }

    }
}