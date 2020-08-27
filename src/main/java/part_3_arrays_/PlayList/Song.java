package part_3_arrays_.PlayList;

public class Song {

    private String title;
    private double songLength;

    public Song(String title, double songLength) {
        this.title = title;
        this.songLength = songLength;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSongLength() {
        return songLength;
    }

    public void setSongLength(double songLength) {
        this.songLength = songLength;
    }
}
