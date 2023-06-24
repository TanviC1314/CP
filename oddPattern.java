import java.util.*;

class oddPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd number: ");
        int n = sc.nextInt();
        int count = 0;
        for (int inc = 0; inc < n; inc++) {
            for (int i = 0; i < (count-inc); i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < n - count; i++) {
                System.out.print("*");
            }
            count += 2;
            System.out.println();
        }
    }
}