import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        long startTime1, startTime2, endTime1, endTime2, elapsedTime1, elapsedTime2;
        int number = getInputNumber();
        int sum1, sum2 = 0;

        startTime1 = System.currentTimeMillis();
        sum1 = sumOfNumbers(number);
        endTime1 = System.currentTimeMillis();
        elapsedTime1 = endTime1 - startTime1;

        startTime2 = System.currentTimeMillis();
        sum2 = gaussianSumOfNumbers(number);
        endTime2 = System.currentTimeMillis();
        elapsedTime2 = endTime2 - startTime2;

        System.out.printf("        sumOfNumbers result: %,d\n Elapsed Time: %,d milliseconds\n", sum1, elapsedTime1);
        System.out.printf("gaussianSumOfNumbers result: %,d\n Elapsed Time: %,d milliseconds", sum2, elapsedTime2);
    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    static int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    
    
    static int getInputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }
    
    
    // for Extra Credit
    static int gaussianSumOfNumbers(int n) {
        int sum = 0;
        sum = (n * (n + 1)) / 2;
        return sum;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
