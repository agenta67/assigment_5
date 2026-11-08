import java.util.Scanner;
public class TaskM {
    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
            System.out.print(numbers[i] + " ");
        }

        reverse(numbers, a - 1, b - 1);
        reverse(numbers, c - 1, d - 1);
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}