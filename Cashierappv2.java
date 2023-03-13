import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

public class Cashierappv2 {
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          System.out.println("\nFelix's Company - Cashier App V2.0");
          System.out.println("====================="); 
          System.out.println("Choose the products you want:");

          System.out.println("1. Keyboard - $49.99 \n2. Mouse - $19.99 \n3. Monitor - $99.99 \n4. Exit");
          int Num = in.nextInt();
          double a = 49.99;
          double b = 19.99;
          double c = 99.99;


          System.out.println("You choose: "+Num);
          if(Num == 4){
               System.out.println("Thank you for using the application! :)");
               System.exit(Num);
          } else if(Num > 4){
               System.out.println("Invalid number!!! \n");
               System.exit(Num);
          }

          System.out.println("\nInput the quantity:");
          double quan = in.nextInt();

          if(quan > 20){
               System.out.println("Out of stock! \nThank you for using this application! \n");
               System.exit(Num);
          }

          System.out.println("\nFelix's Company - INVOICE \n====================");
          if(Num == 1) {
               System.out.println("Item's name : Keyboard \nPrice : $49.99 \nQuantity : "+quan);
               System.out.println("\nTotal Price: $"+a*quan);
               
               
          } else if(Num == 2){
               System.out.println("Item's name : Mouse \nPrice : $19.99 \nQuantity : "+quan);
               System.out.println("\nTotal Price: $"+b*quan);
              

          }else if(Num == 3){
               System.out.println("Item's name : Monitor \nPrice : $99.99 \nQuantity : "+quan);
               
               System.out.println("\nTotal Price: $"+c*quan);
               
          }

          System.out.println("Please input your money [must be more than or equal to the total price]");
          double mon = in.nextDouble();
          if(Num == 1) {
              if(mon > a*quan){
                    System.out.println("\nThank you for purchasing! \nYour change: $"+ (mon-a*quan)+"\n");
              }else if(mon < a*quan){
                    System.out.println("\nNot Enough Money! \n");
              } else {
               System.out.println("\nThank you for purchasing! \n");
              }
               
          } else if(Num == 2){
               if(mon > b*quan){
                    System.out.println("Thank you for purchasing! \nYour change: $"+ (mon-b*quan)+"\n");
              }else if(mon < b*quan){
                    System.out.println("Not Enough Money! \n");
              } else {
               System.out.println("Thank you for purchasing! \n");
              }

          }else if(Num == 3){
               if(mon > c*quan){
                    System.out.println("\nThank you for purchasing! \nYour change: $"+ (mon-c*quan)+"\n");
              }else if(mon < c*quan){
                    System.out.println("\nNot Enough Money! \n");
              } else {
               System.out.println("\nThank you for purchasing! \n");
              }
               
          
          }
          
     }
     

     
}
