package udemy.tim;

public class Main {
    public static void main(String[] args) {
        VipCustomer vipPerson = new VipCustomer();
        System.out.println(vipPerson.getName());

        VipCustomer vipPerson3 = new VipCustomer("82165", "email");
        System.out.println(vipPerson3.getName());

        VipCustomer vipCustomer2 = new VipCustomer("valmai", "valami","valmi");
        System.out.println(vipCustomer2.getName());
    }
}
