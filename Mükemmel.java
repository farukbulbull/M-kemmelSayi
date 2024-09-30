import java.util.Scanner;

public class Mükemmel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = inp.nextInt();
        
        int sum = 0;
        
        // Pozitif bölenlerin toplamını bulma
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        // Mükemmel sayı kontrolü
        if (sum == number) {
            System.out.println(number + " mükemmel sayıdır.");
        } else {
            System.out.println(number + " mükemmel sayı değildir.");
        }
    }
}