package udemy.tim;

public class Hamburger {
    private String name;
    private String rollType;
    private int meatPortion;
    private int price;
    private String addition;
    private int additionAmount;

    public Hamburger(String name, String rollType, int meatPortion, int price, String addition,  int additionAmount) {
        this.name = name;
        this.rollType = rollType;
        this.meatPortion = meatPortion;
        this.price = price;
        this.addition = addition;
        this.additionAmount = additionAmount;
    }

    public Hamburger() {
        setAdditionAmount();
        setName();
        setPrice();
        setRollType();
        setMeatPortion();
    }

    public void selectAddition(int additionID){
        if (this.additionAmount > 3){
            System.out.println("The maximum number of the addition has been reached, we are sorry");
            return;
        }

         String addition = null;
         switch (additionID) {
              case 1:
              addition = "Cheese";
              this.price += 7;
              break;
            case 2:
              addition = "Lettuce";
              this.price += 3;
              break;
            case 3:
              addition = "Tomato";
              this.price += 4;
              break;
            case 4:
              addition = "Onion rings";
              this.price += 5;
              break;
        }
        if(this.additionAmount == 0){
          this.addition = addition;
        }else{
          this.addition = this.addition + ", " + addition;
        }
        this.additionAmount++;
     }


    public void yourOrder(){
        if (this.addition != null){
            System.out.println("A classic burger with "+this.addition);
        }else{
            System.out.println("You have ordered a classic burger");
        }
        cost();
    }

    public void cost(){
        System.out.println("The burger is cost's " + getPrice() + "$ at the moment");
    }

    public int increaseCost(int additionPrice){
        return this.price + additionPrice;
    }

    private void setName() {
        this.name = "Classic burger";
    }

    private void setRollType() {
        this.rollType = "Classic roll";
    }

    private void setMeatPortion() {
        this.meatPortion = 1;
    }

    private void setPrice() {
        this.price = 25;
    }

    private void setAdditionAmount() {
        this.additionAmount = 0;
    }
    public String getRollType() {
        return rollType;
    }

    public int getMeatPortion() {
        return meatPortion;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getAddition() {
        return addition;
    }

    public int getAdditionAmount() {
        return additionAmount;
    }
}
