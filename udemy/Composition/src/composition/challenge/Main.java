package composition.challenge;

import udemy.tim.Resolution;

public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed("sponge", 180, 70);
        Window window = new Window(130, 180);
        Desk desk = new Desk(new Resolution(2, 5), "wood", 8);
        Room room = new Room(5, 2, 6, bed, desk, window);

        room.goIntoTheRoom();
        room.getDesk().location(new Resolution(4, 4));
        room.openWindow();
        room.tryTheBed();

    }
}
