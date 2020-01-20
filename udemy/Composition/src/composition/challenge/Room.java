package composition.challenge;

public class Room {
    private int width;
    private int height;
    private int depth;
    private Bed bead;
    private Desk desk;
    private Window window;

    public Room(int width, int height, int depth, Bed bead, Desk desk, Window window) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.bead = bead;
        this.desk = desk;
        this.window = window;
    }

    private int getWidth() {
        return width;
    }

    private int getHeight() {
        return height;
    }

    private int getDepth() {
        return depth;
    }

    private Bed getBead() {
        return bead;
    }

    public Desk getDesk() {
        return desk;
    }

    private Window getWindow() {
        return window;
    }

    public void goIntoTheRoom(){
        if (closed())
            System.out.println("We can go into the room");
    }

    private boolean closed(){
        System.out.println("the room is open for visitors");
        return true;
    }
    public void openWindow(){
        getWindow().canItBeOpen();
    }
    public void tryTheBed(){
        getBead().comfortable();
    }

}
