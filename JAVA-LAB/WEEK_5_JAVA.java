import java.util.Scanner;

class Account
{
    Scanner x = new Scanner(System.in);
    String name = new String();
    int accno;
    String acct_type = new String();
    int balance;
    int deposit;
    int withdrawal;
   
    void create_account()
    {
        System.out.println("Enter name and accno and account type:");
        this.name = x.next();
        this.accno = x.nextInt();
        this.acct_type=x.next();
    }
}

class Cur_acct extends Account
{
    int min_balance=2000,pro;
    Cur_acct(){}
   
    void accept()
    {
        System.out.println("Enter amount to be deposited: ");
        deposit = x.nextInt();
        this.balance = this.balance+deposit;
    }
    void display()
    {
        System.out.println("CURRENT BALANCE:" + this.balance);
    }
    void withdraw()
    {
        if(balance<2000)
        {  
   
            System.out.println("PENALTY TO BE IMPOSED!");
   System.out.println("Do you want to proceed?");
            pro = x.nextInt();
            if(pro == 1)
{      
System.out.println("Amount to be withdrawn?");
                        this.withdrawal = x.nextInt();
this.balance = this.balance-this.withdrawal;
            System.out.println("Current balance: "+balance);
}
   else
{
System.out.println("Withdrawal revoked!");
}
        }
        else
        {
        System.out.println("Enter withdrawal amount:");
        withdrawal = x.nextInt();
        this.balance = this.balance - withdrawal;
        }
    }
}

class Sav_acct extends Account
{
    int time=0;
    Sav_acct()
    {}
    void accept()
    {
        System.out.println("Enter amount to be deposited: ");
        deposit = x.nextInt();
        this.balance = this.balance+deposit;
    }
    void display()
    {
        System.out.println("CURRENT BALANCE:" + this.balance);
    }
    void withdraw()
    {
    System.out.println("Enter withdrawal amount:");
    withdrawal = x.nextInt();
    this.balance = this.balance - withdrawal;
    }
    void interest()
    {  
        System.out.println("UPDATED BALANCE!");
        this.balance = this.balance*(1+time*(5/100));
        System.out.println("BALANCE:" + this.balance);
    }
}

class BANK{
    public static void main(String[] args) {
        int choice,f=1;
        Account a = new Account();
        a.create_account();
        Scanner x = new Scanner(System.in);
 
       
        if(a.acct_type.equals("Current_account"))
        {
            Cur_acct c = new Cur_acct();
            while(f==1)
            {
               
                System.out.println("1.DEPOSIT  2.DISPLAY 3.WITHDRAW 4.EXIT");
                System.out.println("Enter your choice:");
                choice = x.nextInt();
               
                switch(choice)
                {
                    case 1:
                        c.accept();
			break;
                   
                    case 2:
                        c.display();
			break;
                   
                       
                    case 3:
                        c.withdraw();
                        break;
                   
                    case 4:
                        f=0;
                }
            }
        }
        else if(a.acct_type.equals("Savings_account"))
        {
            Sav_acct s = new Sav_acct();
            while(f==1)
            {
                s.time = s.time+1;
                System.out.println("1.DEPOSIT  2.DISPLAY 3.WITHDRAW 4.COMPUTE 5.EXIT");
                System.out.println("Enter your choice:");
                choice = x.nextInt();
               
                switch(choice)
                {
                    case 1:
                        s.accept();
                    	break;
                   
                    case 2:
                        s.display();
                        break;
                   
                    case 3:
                        s.withdraw();
			break;
                   
                    case 4:
                        s.interest();
			break;
                   
                    case 5:
                        f=0;
                }
            }
        }
    }
}
