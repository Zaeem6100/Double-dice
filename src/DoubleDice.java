import java.text.DecimalFormat;
import java.util.Scanner;

public class DoubleDice {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        float amount = 0.0F,bet = 0.0F;
        do {
            System.out.println("Enter the Amount :");
             amount = input.nextFloat();
            if (amount!=0.00){
                break;
            }
        }while (true);


        do {
            if (bet>amount ){ System.out.println("\n\nYou are Out of Money!\nBetter Luck Next Time !");
                return;
            }

            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            float twoDigitsF = Float.valueOf(decimalFormat.format(amount));
            System.out.println("\n\nYou Have $"+twoDigitsF);
            System.out.println("\nHow Much would you Like to bet (Enter 0 to quit )? ");
            bet = input.nextFloat();
            if (bet ==0){
                System.out.println("See you Around, winner!");
                return;
            }
            if (bet>amount ){
                System.out.println("\n\nYou are Out of Money!\nBetter Luck Next Time !");
                return;
            }

            Die die = new Die();
            Die die1 = new Die();
            die.setValue(die.roll());
            die1.setValue(die1.roll());
            System.out.println("You Rolled a "+ die +" and "+die1);
            if(die.equal(die,die1)){
                System.out.println("You win $"+bet);
                amount = amount+bet;
            }else {
                System.out.println("You Loss $"+bet);
                amount = amount-bet;
            }
        }while (true);
    }
}
