public class Main {
    public int Add(int x, int y) {
        return x + y;
    }

    public int Add(int x, int y, int z) {
        return x + y + z;
    }

    public double Add(double x, double y) {
        return x + y;
    }

    public double Add(double x, double y, double z) {
        return x + y + z;
    }

    // main method//
    public static void main(String[] args) {
        Main number = new Main();
        int res1 = number.Add(1, 2);
        System.out.println("Addition of em 2 is " + res1);
        int res2 = number.Add(1, 2, 10);
        System.out.println("Addition of em 3 is " + res2);
        double res3 = number.Add(1.011, 2.2222);
        System.out.println("Addition of double 2 is " + res3);
        double res4 = number.Add(1.9, 2.6912, 10.21);
        System.out.println("Addition of double 3 is " + res4);

    }

}
