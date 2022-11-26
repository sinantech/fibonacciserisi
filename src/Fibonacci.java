import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z, t;
        Scanner inp = new Scanner(System.in);
        System.out.println("Please Enter Digits");
        t = inp.nextInt();
        System.out.print(x + "," + y);
        for (int i = 2; i <= t; i++) {
            z = x + y;
            System.out.print("," + z);
            x = y;
            y = z;

        }


    }
}
