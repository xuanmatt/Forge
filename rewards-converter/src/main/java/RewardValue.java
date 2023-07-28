public class RewardValue {
    private double cash;
    private int miles;

    //Constructors
    public RewardValue(double cash){
        this.cash = cash;
    }

    public RewardValue(int miles){
        this.miles = miles;
    }


    //Getters and Setters
    public double getCash(){
        return this.cash;
    }

    public void setCash(double cash){
        this.cash = cash;
    }

    public int getMiles(){
        return this.miles;
    }

    public void setMiles(){
        this.miles = miles;
    }


    //Methods
    public double getCashValue(){
        double cashValue = (double) (getMiles() * 0.0035);

        return cashValue;
    }

    public int getMilesValue(){
        int milesValue = (int) ((int) getCash() / 0.0035);

        return milesValue;
    }

}
