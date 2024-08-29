import java.util.Scanner;


public class guess{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int  userNumber = 0;

        do{
            System.out.println("Guess the number:");
            userNumber = sc.nextInt();

            if(myNumber == userNumber){
                System.out.println(" Wow....! you guess the correct number");
                break;
            }
            else if(userNumber < myNumber){
                System.out.println("guessed number is smaller than correct number:");
            }
            else if(userNumber > myNumber){
                System.out.println("guessed number is larger than correct number:");
            }
            else{
                System.out.println("choose b/w (1-100)");
            }
            
        }while (userNumber >= 0);
        System.out.println("my number was:");
        System.out.println(myNumber);

    }
}
