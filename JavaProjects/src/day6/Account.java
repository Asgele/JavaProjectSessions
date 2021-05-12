package day6;


public class Account {
	//create attributes
	private String firstName;
	private String lastName;
	private  long accountNo;
	
	private double balance;
	private static long accountIncrment = 1000;
		
	//constructors
	
 public Account(String firstName ,String LastName,double balance) {
		this.firstName = firstName;
		this.lastName = lastName;		
        accountIncrment = accountIncrment + 1;
        this.accountNo =accountIncrment;
	    this.balance = balance;
	}
	//getter and setter
	
	public String getFirstName() {
	return firstName;
	}	
	public String getLastName() {
	return lastName;
		}
  public void setFirstName(String firstName) {
	this.firstName = firstName;
	}
  public void setLastName(String lastName) {
		this.lastName = lastName;		
  }
  public long getAccountNo() {
	  return accountNo;
  }
	public void setAccountNo(long accountNo) { 
        this.accountNo = accountNo;
	}
  
  public double getbalance() {
	return balance;
  }
public void setBalance(double balance) {
this.balance = balance;	
}
@Override
public String toString() {
	return "Account [firstName=" + firstName + ", lastName=" + lastName + ", accountNo=" + accountNo + ", balance="
			+ balance + ", accountIncrment=" + accountIncrment + "]";
}
 //Debt method (withdraw money)
public void debit(double withdrawAmount) {
// check if there is enough money
 if(balance<withdrawAmount) {
    System.out.println("Insufficient Balance!");
 }else {
	 balance = balance -withdrawAmount;
 System.out.println("you have withdrawn" + withdrawAmount +"your current balance=" +balance);
 }
}
public void credit(double depositAmount) {
     balance = balance + depositAmount;
  System.out.println("you have deposited" + depositAmount + "current Balance" + balance);
}
}

