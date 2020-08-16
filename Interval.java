/*

 Write a data type Interval that implements the fallowing API:

 public class Interval
 ______________________________________________________________
 Interval(double min, double max)
 boolean contains(double x)          is x in this interval?
 boolean intersects(Interval b)      do this interval and b intersects?
 String toStr()                   string representation



 */


public class Interval {

    private double min, max;

    public Interval(double mi, double ma) {
        min = mi;
        max = ma;
    }

    public boolean contains(double x) {
        return (x > min && x < max);
    }

    public boolean intersects(Interval b) {
        return ((b.min < min && b.max > min) ||
                (b.min > min && b.min < max && b.max > b.min));
    }

    public void toStr() {
        System.out.println("Min " + min + ".");
        System.out.println("Max " + max + ".");

    }

    public static void main(String[] args) {

        double min = Double.parseDouble(args[0]);
        double max = Double.parseDouble(args[1]);
        double minB = Double.parseDouble(args[2]);
        double maxB = Double.parseDouble(args[3]);
        double x = Double.parseDouble(args[4]);

        Interval interval = new Interval(min, max);
        Interval intervalB = new Interval(minB, maxB);

        System.out.println(interval.contains(x));
        System.out.println(interval.intersects(intervalB));
        interval.toStr();
    }
}
