package composition.challenge;

public class Bed {
    private String material;
    private int length;
    private int width;

    public Bed(String material, int length, int width) {
        this.material = material;
        this.length = length;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }



    public String getMaterial() {
        return material;
    }

    public void comfortable(){
        System.out.println("The bed is very comfortable, because it's made from " + this.material);
    }
}
