public class Constructor01 {

    public  double balance;
    public int rateofInterest;
    Constructor01(double balance,int rateofIntrrest){
    this.balance=balance;
    this.rateofInterst=rateofIntrrest;
    }
    double get_balance(){
    return balance;
    }
    void addInterest(){
    balance=balance+(balance*rateofInterest/100);        
    }
    void get_details(){
    System.out.println("balance:"+balance);
    System.out.println("rateofInterest:"+rateofInterest);
    }
    
}
 class saving extends Constructor01 {
saving(double balance,int rateofInterest){
super(balance, rateofInterest);
}
void deposit(double amount){
    balance=balance+amount;
    System.out.println("deposit:"+amount);
}
    void withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("withdraw:"+amount);
        }
    }
    void add_interest(){
        double interest=balance+(balance*rateofInterest/100);
        balance=+interest;
        System.out.println("rateofInterest:"+interest);

    }

}
 class credit extends Constructor01 {
    double amount;
     credit(double balance,int rateofInterest,double amount){
        super ( balance,rateofInterest);
         this.amount=amount;
    }
    void deposit(){
        balance=balance+amount;
        System.out.println("deposit:+amount");
    }
    void withdraw(double amount){
        balance=balance-amount;
        System.out.println("withdrw:+amount");

    }
    void addInterest(){
        double interest=balance+(balance*rateofInterest/100);
        balance=interest;
    }

    
}
public class main{
public static void main(String[] args) {
   saving s=new saving();
   s.deposit(1000); 
   s.withdraw(300);
   s.add_interestInterest();
    credit c=new credit(2000,100,100);
    c.deposit();
    c.withdraw();
    c.addInterest();
}




}
