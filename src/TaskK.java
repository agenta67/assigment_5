import java.util.Scanner;
public class TaskK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (numbers[i] != numbers[i - 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}