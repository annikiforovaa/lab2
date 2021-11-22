import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNumber = n.nextInt();
        int i;
        int result = 1;
        while (userNumber>=15) {
            System.out.print("Enter another number: ");
            userNumber = n.nextInt();
        }
        for (i = 1; i <= userNumber; i++) {
            result = result * i;
        }
        System.out.printf("Factorial %d = %d", userNumber, result);
        }
    }
