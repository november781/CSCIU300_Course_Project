public class business_checking extends account{
final int MONTHLYFEE = 20;
final double WITHDRAW_FEE = 10;
    final double WITHDRAW_CHECK = 10000;

  public business_checking(String name, String address, String email, String phone, int id){
      this.name = name;
      this.address = address;
      this.email = email;
      this.phone = phone;
      this.id = id;
  }



    @Override
    void withdraw(int amount) {
        if (amount > WITHDRAW_CHECK){
            if (balance - (amount + WITHDRAW_FEE) < 0) {
                System.out.println("Insufficient balance");
            } else {
                balance -= (amount + WITHDRAW_FEE);
            }
        }else if (balance - amount < 0) {
            System.out.println("Insufficient balance");
        }else  {
            balance -= amount;
        }
    }

    @Override
    void applyFee() {
      balance -= MONTHLYFEE;
    }

    @Override
    void assesInterest() {} // business checking account has no interest, do nothing

    @Override
    public String toString(){
        return "Type: business checking " +
                super.toString();
    }
}
