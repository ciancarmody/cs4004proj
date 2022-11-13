package org.example;
import java.io.IOException;
import java.util.Scanner;

public class LiberaryMenu{
    private Scanner in;

    public LiberaryMenu(){
        in = new Scanner(System.in);
    }

    //this is the runner
    //for the avoidence of plagerism accusations this class is based off the cs4013 lab 6 vending machine menu
    public void run(LiberarySystem sys) throws IOException{
        boolean more = true;
        while(more){
            System.out.println("Please sign in to your UWON Library account\nEnter ID:");
            boolean blocker = true;
            while(blocker){
                try {
                    sys.getPerson(in.nextLine());
                    blocker = false;
                } catch (RuntimeException ex) {
                    System.out.println(ex.getMessage());
                    //start the loop again insted of completly closing
                }
            }
            System.out.println("Enter password:");
            while(!sys.signIn(in.nextLine())){
                System.out.println("That password is incorrect, please re-enter");
            }
            blocker = true;
            String menuMov = "";
            while(blocker){
                System.out.print("1)Search for a book. 2)See staff. 3)See my loans");
                if (sys.getSignedIn().isStaff()) {
                    System.out.print(". 0)Open staff menu");
                }
                System.out.println("");
                menuMov = in.nextLine();
                if(Integer.parseInt(menuMov) < 0 || Integer.parseInt(menuMov) > 3){
                    System.out.println("Thats not a valid input");
                }else{
                    blocker = false;
                }

            }
            if(menuMov.equals("1")){
                blocker = true;
                while(blocker){
                    System.out.println("");
                }

            }
        }
    }
}
