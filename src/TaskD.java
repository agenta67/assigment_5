import java.util.Scanner;
public class TaskD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (numbers[i] > numbers[i - 1]) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}