package BridgeLabzTraining3Y.JavaMethod.Level1;

import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int each = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{remaining, each};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();
        int[] res = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + res[1] + ", Remaining: " + res[0]);
        sc.close();
    }
}

