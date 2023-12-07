public class DVDPlayer {
    boolean canRecord = false;
//    boolean playDVD = false;
    void  recordDVD() {
        System.out.println("идет запись DVD");
    }
    void playDVD () {
        System.out.println("DVD проигрыается");
    }
}
class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();

        if (d.canRecord = true) {
            d.recordDVD();
        }
    }
}