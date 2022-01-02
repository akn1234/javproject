import java.util.Scanner;

class firt{

     public static void main(String[] args) {
        //try (Scanner scanner = new Scanner(System.in)) {
          //int n= scanner.nextInt();
             int n =4;
            System.out.println(n);


             if(n%2==0 && n>2 && n<5){
                 System.out.println("Not weird");
                 
                 
             }
             else if(n%2==0 && n>6 && n<20){
                 System.out.println("Weird");
             }
             else if(n%2 == 0 && n>21){
                 System.out.println("Not Weird");
             }
             else{
                 System.out.println("Not Weird");
             }
     }
    


         
     }
