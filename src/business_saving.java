public class business_saving extends account{
    final int MONTHLY_FEE = 20;
    final double WITHDRAW_FEE = 10;
    final double INTEREST = 0.025;

    public business_saving(String name, String address, String email, String phone, int id){
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.id = id;
    }
    public business_saving(){};


    @Override
    void withdraw(int amount) { //Ensuring the balance is above the amount added with the withdraw-fee
        if (balance - (amount + WITHDRAW_FEE) < 0) {
            System.out.println("Insufficient balance");
        } else {
            balance -= (amount + WITHDRAW_FEE);
        }
    }


    @Override
    void applyFee() {
        balance -= MONTHLY_FEE;
    }

    @Override
    void assesInterest() {
        balance += balance * INTEREST;
    }

    @Override
    public String toString(){
        return "Type: business saving " +
                super.toString();
    }
}
