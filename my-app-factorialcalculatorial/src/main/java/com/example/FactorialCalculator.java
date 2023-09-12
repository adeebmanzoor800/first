import java.util.Scanner;

public class FactorialCalculator {
    public static void ain(String[] args) {
        int factorial =1;
        int n;
        System.out.println("eneter the number you want to find factorial of");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

            System.out.println("the nmber is :" + factorial);



    }
}
