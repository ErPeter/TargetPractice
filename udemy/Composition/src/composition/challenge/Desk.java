package composition.challenge;

import udemy.tim.Resolution;

public class Desk {
    private Resolution resolution;
    private String material;
    private int age;

    public Desk(Resolution resolution, String material, int age) {
        this.resolution = resolution;
        this.material = material;
        this.age = age;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public String getMaterial() {
        return material;
    }

    public int getAge() {
        return age;
    }

    public void location(Resolution resolution){
        System.out.println("The desk at x: " + resolution.getHeight() +" and "+ " y: " + resolution.getWidth());
    }
}
