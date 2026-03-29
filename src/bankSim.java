import java.util.ArrayList;
import java.util.Scanner;

public class bankSim {
    public static void newaccount(account acc, ArrayList<account> accounts){
        account temp;
        String accounttype;

        Scanner input = new Scanner(System.in);
        System.out.println("What type of account would you like to create?\n" +
                "1. Business Checking\n" +
                "2. Business Savings\n" +
                "3. Personal Checking\n" +
                "4. personal Saving");
        accounttype = input.nextLine();
        switch(accounttype){
            case "":
        }

//        accounts.add(acc);
    }

    public static void main(String[] args) {
        ArrayList<account> accounts = new ArrayList<account>();
        newaccount(test, accounts);
        System.out.println(accounts);
    }
}
