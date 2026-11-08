import java.util.Scanner;
public class TaskC{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        int sum = 0;
        for(int i = 0; i < numbers.length; i++ ){
            numbers[i] = in.nextInt();
            if (numbers[i] > 0){
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}