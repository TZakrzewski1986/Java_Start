package part_3_arrays_.PlayList;

public class PlayListRunner {
    public static void main(String[] args) {
        Song song1 = new Song("Dupa... duuuu", 120);
        Song song2 = new Song("Lipa", 320);

        int playListLength = PlayList.playlistLength(song1,song2);
        System.out.println(playListLength);
        System.out.printf("Wszystkie piosenki trwają: %d sekund, czyli\n", playListLength);
        String formattedTime = PlayList.getFormattedTime(playListLength);
        System.out.println(formattedTime);
    }
}
