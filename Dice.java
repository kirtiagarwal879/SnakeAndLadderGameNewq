
public class Dice {
    private final int minValue;
    private final int maxValue;

    public Dice(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue=maxValue;
    }

    public int getRollValue()
    {
        return (int)(Math.random()*(maxValue-minValue+1)+minValue);
    }
}
