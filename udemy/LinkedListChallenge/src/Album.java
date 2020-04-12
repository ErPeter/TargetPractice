import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private SongList songList;

    public class SongList {
        private List<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }

        private boolean addSong(String title, double duration){
            if(findSong(title) == null){
                this.songs.add(new Song(title,duration));
                return true;
            }
            return false;
        }

        private Song findSong(String title){
            if(this.songs != null) {
                for (int i = 0; i < this.songs.size(); i++) {
                    if (title.equals(this.songs.get(i).getNameOfTheSong())) {
                        return this.songs.get(i);
                    }
                }
            }else {
                System.out.println("You have not got any song list");
            }
            return null;
        }

        private List getSongs() {
            return songs;
        }

        private void setSongs(List songs) {
            this.songs = songs;
        }
    }

    public void addSong(String title, double duration){
        songList.addSong(title, duration);
    }


    public boolean addToPlayList(String title, List<Song> playList){
        Song checkedSong = songList.findSong(title);
        if (checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song is not in this album");
        return false;
    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }
}
