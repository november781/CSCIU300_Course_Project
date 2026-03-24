import java.util.ArrayList;

public class bankSim {
    public static void newaccount(account acc, ArrayList<account> accounts){
        accounts.add(acc);
    }

    public static void main(String[] args) {
        ArrayList<account> accounts = new ArrayList<account>();
        personal_saving test = new personal_saving("dave", "1600 Pennsylvania Avenue NW, Washington, DC 20500", "dave@whitehouse.gov",
                "(111)111-1111", 1000);
        newaccount(test, accounts);
        System.out.println(accounts);
    }
}
