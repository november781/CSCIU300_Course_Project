public class personal_checking extends account {
    public personal_checking(String name, String address, String email, String phone, int id){
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.id = id;
    }
    public personal_checking(){}

    @Override
    void withdraw(int amount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient balance");
        }else  {
            balance -= amount;
        }
    }

    @Override
    void applyFee() {} // fee for personal checking is 0, just do nothing.

    @Override
    void assesInterest() {} // personal checking account has no interest, do nothing

    @Override
    public String toString(){
        return "Type: personal checking " +
                super.toString();
    }
}
