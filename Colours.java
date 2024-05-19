
public class Colours {

    public static long get(long colour1, long colour2, long colour3, long colour4) {
        return (get(colour4) << 30) + (get(colour3) << 20) + (get(colour2) << 10) + get(colour1);
    }

    private static long get(long colour) {

        if (colour < 0) return 1000;
        int r = (int) (colour / 100 % 10); 
        int g = (int) (colour / 10 % 10); 
        int b = (int) (colour % 10);
        return r * 100 + g * 10 + b;
    }
}
