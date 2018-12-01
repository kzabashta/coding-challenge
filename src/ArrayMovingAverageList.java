import java.util.ArrayList;

public class ArrayMovingAverageList implements MovingAverageList {
    private final ArrayList<Double> list;
    private final int windowSize;
    private double movingAverage = 0;

    public ArrayMovingAverageList(int n){
        list = new ArrayList<>();
        windowSize = n;
    }

    public void add(double num)
    {
        if (this.list.size() < windowSize)
        {
            this.movingAverage = (this.list.size() * this.movingAverage + num) / (double) (this.list.size() + 1);
        }
        else
        {
            this.movingAverage = (this.windowSize * this.movingAverage -
                    this.list.get(this.list.size() - this.windowSize) + num) / (double)this.windowSize;
        }
        this.list.add(num);
    }

    public double get(int index)
    {
        return this.list.get(index);
    }

    public double getMovingAverage()
    {
        return this.movingAverage;
    }
}
