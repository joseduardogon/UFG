import java.util.Scanner;
import java.util.Arrays;

public class ListNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial number: ");
        int initNumber = scanner.nextInt();
        System.out.println("Enter the final number: ");
        int finalNumber = scanner.nextInt();
        if (initNumber <= finalNumber) {
            int size = finalNumber - initNumber + 1;
            int[] listNumbers = new int[size];
            int currentNumber = initNumber;
            int index = 0;
            do {
                listNumbers[index] = currentNumber;
                currentNumber++;
                index++;
            } while (currentNumber <= finalNumber);
            System.out.println(Arrays.toString(listNumbers));
        } else {
            System.out.printf("[%d, ... 2147483647, -2147483648, ... %d]", initNumber, finalNumber);
        }
    }
}
