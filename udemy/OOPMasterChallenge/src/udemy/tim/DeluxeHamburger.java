package udemy.tim;

public class DeluxeHamburger extends Hamburger{
    private String DeluxeHamburgerAddition;

    public DeluxeHamburger(String name, String rollType, int meatPortion, String addition, int additionAmount) {
        super(name, rollType, meatPortion, 47, addition, additionAmount);
        makeDeluxeBurger();
    }

    public DeluxeHamburger() {
        this.DeluxeHamburgerAddition = "Coke and chips";
    }


    public void makeDeluxeBurger(){
        selectAddition(1);
        selectAddition(2);
        selectAddition(3);
        selectAddition(4);
        System.out.println(this.DeluxeHamburgerAddition);

        this.DeluxeHamburgerAddition = getAddition()+ " " + this.DeluxeHamburgerAddition;
        System.out.println("The deluxe burger contains: " + this.DeluxeHamburgerAddition);
    }

    @Override
    public void cost() {
        System.out.println("Your deluxe hamburger has been made and it costs: " + getPrice());
    }
}
