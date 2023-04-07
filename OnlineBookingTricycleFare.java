// Online Booking Tricycle Fare
// Created by Christiane A. Bacani
import java.util.Scanner;
public class OnlineBookingTricycleFare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String location[] = {"San Jose","Dangcol","Malabia","Tenejero","Bagong Silang","Camacho","Munting Batangas","Central","Cataning","Cupang North","Talisay","Cupang West","Tortugas","Pto. Rivas Itaas","Pto. Rivas Ibaba"};
        
        System.out.print("Online Bookings of Tricyle\n");
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
       for(int i = 0 ; i < location.length ; i++){
           System.out.print((i + 1) + ") " + location + "\n");
       }
        System.out.print("Enter where you are right now : ");
        int locationNow = input.nextInt();
        
        System.out.print(location[locationNow - 1] + " to : ");
        int destination = input.nextInt();
        
        System.out.print(location[locationNow - 1] + " to " + location[destination - 1]);
        System.out.print("Enter how many passengers you are : ");
        int passengers = input.nextInt();
        
        System.out.print("How many passengers are PWD/Senior Citizen/Pregnant ?:");
        int discount = input.nextInt();
        
        int total = (13 * passengers) - (20/(passengers * 13)) * 100;
        
        System.out.print("The total price is P : " + total + "\n");
        System.out.print("Enter your payment here : P ");
        int payment = input.nextInt();
        
        int change = payment - total;
        System.out.print("Change : P " + change + "\n");
        
        System.out.print("\n\nTHE DRIVER IS ON THE WAY!, THANK YOU FOR THE SAFE TRANSACTIONS.");
        
    }
}
