public class Main{

    public static void main(String[] args)
    {
        ArrayMovingAverageList l = new ArrayMovingAverageList(3);

        l.add(1);
        l.add(2);
        l.add(3);

        l.add(1);
        l.add(2);


        System.out.println(l.getMovingAverage());
    }
}
