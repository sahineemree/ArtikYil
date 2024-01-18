import java.util.*;
public class ArtikYil {
    public static void main(String[] args) {
        int year ;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz yılı giriniz: ");
        year = input.nextInt();

        if (year % 4 == 0){
            System.out.println(year + " Bir artık yıldır.");
        }
else {
            System.out.println(year + " Bir artık yıl değildir.");
        }
    }
}