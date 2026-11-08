import java.util.Scanner;
public class TaskL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        int petya = in.nextInt();
        int position = n + 1;
        for (int i = 0; i < n; i++) {
            if (numbers[i] < petya) {
                position = i + 1;
                break;
            }
        }
        System.out.println(position);
    }
}