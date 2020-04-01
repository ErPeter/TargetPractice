import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();


    public static void main(String[] args) {

        Album album = new Album("Strongbringer", "Deep Purple");
        album.addSong("Song1", 3.35);
        album.addSong("Song2", 2.1);
        album.addSong("Song3", 4.5);
        album.addSong("Song4", 3.35);
        album.addSong("Song5", 2.35);
        album.addSong("Song6", 4.5);
        album.addSong("Song7", 4.3);
        album.addSong("Song8", 2.2);
        album.addSong("Song9", 4.5);
        album.addSong("Song10", 2.35);

        albums.add(album);

        album = new Album("For thoes about to dance", "AC/DC");
        album.addSong("Track1", 3.35);
        album.addSong("Track2", 2.1);
        album.addSong("Track3", 4.5);
        album.addSong("Track4", 3.35);
        album.addSong("Track5", 2.35);
        album.addSong("Track6", 4.5);
        album.addSong("Track7", 4.3);
        album.addSong("Track8", 2.2);
        album.addSong("Track9", 4.5);
        album.addSong("Track10", 2.35);

        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<>();

        albums.get(0).addToPlayList("Song3", playlist);
        albums.get(0).addToPlayList("Song5", playlist);
        albums.get(0).addToPlayList("Song2", playlist);
        albums.get(0).addToPlayList("Song11", playlist);
        albums.get(1).addToPlayList("Track4", playlist);
        albums.get(1).addToPlayList("Track1", playlist);
        albums.get(1).addToPlayList("Track9", playlist);
        albums.get(1).addToPlayList("Track23", playlist);

        play(playlist);


    }

    private static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward =  true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("The playlist is empty");
            return;
        }else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Bye-Bye");
                    quit =true;
                    break;
                case 1:
                    if(!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else {
                        System.out.println("this is the end of the list");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else {
                        System.out.println("This is the start of the playlist");
                        forward = false;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now we replaying: " + listIterator.previous());
                            forward =false;
                        } else{
                            System.out.println("we are at the start of the list");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now we replaying: " + listIterator.next());
                            forward =true;
                        }else{
                            System.out.println("We are finished the playlist");
                        }
                    }
                    break;
                case 4:
                    printPlayList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }

        }
    }
    public static void printMenu(){
        System.out.println("Actions:" +
                "Press: 0 to quit \n" +
                "Press: 1 to play next song \n" +
                "Press: 2 to play previous song \n" +
                "Press: 3 to play same song again \n" +
                "Press: 4 to print playlist \n" +
                "Press: 5 to print actions \n" +
                "Press: 6 to remove current song");
    }

    private static void printPlayList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.listIterator();
        System.out.println("========================");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("========================");
    }


}
