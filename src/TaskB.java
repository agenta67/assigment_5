import java.util.Scanner;
public class TaskB{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++ ){
            numbers[i] = in.nextInt();
            if (numbers[i] % 2 == 0){
                System.out.print(numbers[i] + " ");
            }
        }
    }
}