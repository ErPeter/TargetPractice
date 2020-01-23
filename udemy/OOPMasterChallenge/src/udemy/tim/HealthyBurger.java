package udemy.tim;

//if there is no hamburger addition (from parent class) the program still sout null at your order method

public class HealthyBurger extends Hamburger{

    private int healthyAdditionNum;
    private String healthyAdditionName;

    public HealthyBurger() {
        super("Healthy Burger", "Brown rye roll", 1, 20, null, 0);
        this.healthyAdditionName = null;
        this.healthyAdditionNum = 0;
    }

    @Override
    public void selectAddition(int additionID) {
        super.selectAddition(additionID);
    }

    public void healthyAddition(int healthyAdditionID){
        if(healthyAdditionNum > 2 ){
            System.out.println("You have reached the maximum number of available additions");
        }
        String healthAddition = null;
        switch (healthyAdditionID){
            case 1:
                healthAddition = "Paprika";
                increaseCost(3);
                break;
            case 2:
                healthAddition = "Cucumber";
                increaseCost(1);
                break;
        }
        if(healthyAdditionNum == 0){
            this.healthyAdditionName = healthAddition;
        }else{
            this.healthyAdditionName = this.healthyAdditionName + ", " + healthAddition;
        }
        this.healthyAdditionNum++;
    }


    @Override
    public void yourOrder() {
        if (getAdditionAmount() != 0 || this.healthyAdditionNum != 0){
            System.out.println("A healthy burger with "+getAddition() +" "+  getHealthyAdditionName());
        }else{
            System.out.println("You have ordered healthy burger");
        }
        cost();
    }

    @Override
    public int increaseCost(int additionPrice) {
        return super.increaseCost(additionPrice);
    }

    @Override
    public void cost() {
        super.cost();
    }

    @Override
    public String getRollType() {
        return super.getRollType();
    }

    @Override
    public int getMeatPortion() {
        return super.getMeatPortion();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getAddition() {
        return super.getAddition();
    }

    @Override
    public int getAdditionAmount() {
        return super.getAdditionAmount();
    }

    public String getHealthyAdditionName() {
        return healthyAdditionName;
    }
}
