package udemy.tim;

public class Main {
    public static void main(String[] args) {
        HealthyBurger healthyBurger = new HealthyBurger();
        healthyBurger.healthyAddition(1);
        healthyBurger.healthyAddition(2);

        healthyBurger.yourOrder();

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
         deluxeHamburger.makeDeluxeBurger();
         deluxeHamburger.cost();

    }
}
