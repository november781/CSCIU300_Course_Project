public class personal_saving extends account{
    private int withdrawCount = 0;
    public personal_saving(String name, String address, String email, String phone, int id){
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.id = id;
    }
    public personal_saving(){}
    @Override
    void withdraw(int amount) {
        if(withdrawCount > 5 && balance - 5 <= 0){
            System.out.println("Insufficient balance to withdraw");
        } else if (balance - amount < 0) {
            System.out.println("Insufficient balance to withdraw");
        } else if (withdrawCount > 5) {
            balance -= amount;
            balance -= 5;
            withdrawCount ++;
        } else {
            balance -= amount;
        }
    }

    @Override
    void applyFee() {
        if(balance < 3000){
            balance -= 20;
        }
        withdrawCount = 0;
    }

    @Override
    public void assesInterest(){
        balance += balance * .03; // apply 3% interest to the account
    }

    @Override
    public String toString(){
        return "Type: personal saving " +
                super.toString();
    }
}
