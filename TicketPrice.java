package Plane_Ticket_Price;
import java.util.Scanner;
public class TicketPrice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        /* Unit price per km: 0.10$
        If under 12 years old, 50% discount
        If between 12 and 24 years old, 10% discount
        If 65 years old or older, 30% discount
        If round-trip is purchased, 20% discount.
         */

        int age,type,km;
        System.out.println("Please enter the distance(km):");
        km = input.nextInt();
        System.out.println("Please enter your age:");
        age = input.nextInt();
        System.out.print("Please choose the type of trip\n1-One way\n2-Round-trip\n");
        type = input.nextInt();

        double price,age_discount,type_discount;

        if (age > 0 && km > 0 && (type == 1 || type == 2)){
            price = km * 0.10;
            if (age < 12 ){
                age_discount = price * 0.5;
            } else if (age > 12 && age <= 24 ) {
                age_discount = price * 0.1;
            } else if (age >= 65) {
                age_discount = price * 0.3;
            }else {
                age_discount = 0;
            }
            price = price - age_discount;

            if (type == 2){
                type_discount = price * 0.2;
                price = (price - type_discount) * 2 ;
            }
            System.out.printf("Ticket Price: %.2f$",price);
        }
        else{
            System.out.println("Invalid inputs!Please check again.");
        }
    }
}