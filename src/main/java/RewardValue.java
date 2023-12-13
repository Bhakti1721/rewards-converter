public class RewardValue {
    private double cashVal;
    private int milesVal;
    public RewardValue(double cashValue) {
        cashVal=cashValue;
    }
    public RewardValue(int milesValue) {
        milesVal=milesValue;
    }
    public double getCashValue()
    {
        if(milesVal == 0)
            return cashVal;
        else
            return milesVal * 0.0035;
    }
    public double getMilesValue()
    {
        if(cashVal==0)
            return milesVal;
        else
            return cashVal / 0.0035;
    }
}
