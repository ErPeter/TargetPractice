public class Song {
    private String nameOfTheSong;
    private double duration;


    @Override
    public String toString() {
        return this.nameOfTheSong + ": " + this.duration;
    }

    public String getNameOfTheSong() {
        return nameOfTheSong;
    }

    public Song(String nameOfTheSong, double duration) {
        this.nameOfTheSong = nameOfTheSong;
        this.duration = duration;
    }
}
