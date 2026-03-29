public abstract class account {
    double balance = 0;
    String name;
    String address;
    String email;
    String phone;
    int id;

    public account(){}
    public void deposit(int deposit) {
        balance = balance + deposit;
    }
    abstract void withdraw(int amount);
    abstract void applyFee();
    public double getBalance(){
        return balance;
    }
    abstract void assesInterest();
    public String toString(){
        return "Name: " + name +
                " Address: " + address +
                " Email: " + email +
                " Phone: " + phone +
                " Balance: " + balance +
                " Id: " + id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setId(int id){
        this.id = id;
    }
}
