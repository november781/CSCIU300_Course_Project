import java.util.ArrayList;
import java.util.Scanner;

public class bankSim {
    public static void newaccount(ArrayList<account> accounts) { //handle new account creation flow
        account temp = new personal_saving();
        String accounttype;
        Scanner input = new Scanner(System.in);
        System.out.println("""
                What type of account would you like to create?
                1. Business Checking
                2. Business Savings
                3. Personal Checking
                4. personal Saving""");
        accounttype = input.nextLine();
        switch (accounttype) {
            case "1":
            case "Business Checking": {
                temp = new business_checking();
                break;
            }
            case "2": {
            }
            case "business savings": {
                temp = new business_saving();
                break;
            }
            case "3": {
            }
            case "personal Saving": {
                temp = new personal_saving();
                break;
            }
            case "4": {
            }
            case "personal Checking": {
                temp = new personal_checking();
                break;
            }
            default: {
                System.out.println("Invalid input");
                System.exit(100); //quit with code on invalid input
            }
        }
        System.out.println("What is the name associated with the account?");
        temp.setName(input.nextLine());
        System.out.println("What is the address associated with the account?");
        temp.setAddress(input.nextLine());
        System.out.println("What is the phone associated with the account?");
        temp.setPhone(input.nextLine());
        System.out.println("What is the email associated with the account?");
        temp.setEmail(input.nextLine());

        if (accounts.isEmpty()) { //automatically create an account ID by incrementing the ID field using the last added account.
            temp.setId(1000);
        } else {
            temp.setId(accounts.getLast().id + 1);
        }
        accounts.add(temp);
    }

    public static void applyFee(ArrayList<account> accounts) {
        //Looping through each account to subtract the monthly fee from the balance
        for (account acc : accounts) {
            acc.applyFee();
        }
    }

    public static void assesInterest(ArrayList<account> accounts) {
        //Looping through each account to add the interest to the balance
        for (account acc : accounts) {
            acc.assesInterest();
        }
    }

    public static account findAccount(ArrayList<account> accounts) {
        //Looping through each account find the account with the entered ID
        Scanner input = new Scanner(System.in);
        System.out.println("What is the ID of the account?");
        int id = input.nextInt();

        for (account acc : accounts) {
            if (acc.id == id) {
                return acc;
            }
        }
        System.out.println("No account found with that ID");
        return null;
    }

    public static void printAccounts(ArrayList<account> accounts) {
        // loop over the arraylist and print every account
        System.out.println();
        for (account acc : accounts) {
            System.out.println(acc);
        }
        System.out.println();
    }


    public static void deposit(ArrayList<account> accounts) {
        //add money to an account by account ID
        Scanner input = new Scanner(System.in);
        account worker =  findAccount(accounts);
        if (worker != null) {
            System.out.println("What is the amount to be deposited?");
            int amount = input.nextInt();
            worker.deposit(amount);
        }
    }

    public static void withdraw(ArrayList<account> accounts) {
        //remove money from an account by account ID
        Scanner input = new Scanner(System.in);
        account worker =  findAccount(accounts);
        if (worker != null) {
            System.out.println("What is the amount to be withdrawn?");
            int amount = input.nextInt();
            worker.withdraw(amount);
        }
    }

    public static void main(String[] args) {
        account worker;
        ArrayList<account> accounts = new ArrayList<>();
        Scanner mainIn = new Scanner(System.in);
        System.out.println("""
                What operation would you like to perform?
                1. Add a new Account
                2. Get an account by ID
                3. Asses account fees
                4. Asses account interest
                5. Deposit into an account
                6. Withdraw from an account
                7. List all accounts
                8. Exit""");
        String userin = mainIn.nextLine();
        while (!userin.equals("8")) { //handle operations selection and exit when the exit command is called
            switch (userin) {
                case "1":  {
                    newaccount(accounts);
                    break;
                }
                case "2":  {
                    worker = findAccount(accounts);
                    if (worker != null) {
                        System.out.println(worker);
                    }
                    break;
                }
                case "3":{
                    applyFee(accounts);
                    break;
                }
                case "4":  {
                    assesInterest(accounts);
                    break;
                }
                case "5":  {
                    deposit(accounts);
                    break;
                }
                case "6":  {
                    withdraw(accounts);
                    break;
                }
                case "7":  {
                    printAccounts(accounts);
                    break;
                }
                default: {
                    System.out.println("Invalid input");
                }
            }
            System.out.println("""
                What operation would you like to perform?
                1. Add a new Account
                2. Get an account by ID
                3. Asses account fees
                4. Asses account interest
                5. Deposit into an account
                6. Withdraw from an account
                7. List all accounts
                8. Exit""");
            userin = mainIn.nextLine();// end of the loop
        }
    }
}
