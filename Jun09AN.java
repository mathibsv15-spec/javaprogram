import java.util.Scanner;

public class Jun09AN{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + n + " = " + factorial);

        sc.close();
    }
}