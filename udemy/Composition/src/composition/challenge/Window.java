package composition.challenge;

public class Window {
    private int height;
    private int width;

    public Window(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void canItBeOpen(){
        System.out.println("The window unfortunately cannot be open");
    }
}
