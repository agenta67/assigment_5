import java.util.Scanner;
public class TaskE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        boolean found = false;
        for (int i = 0; i < n - 1; i++) {
            if ((numbers[i] > 0 && numbers[i + 1] > 0) || (numbers[i] < 0 && numbers[i + 1] < 0)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}