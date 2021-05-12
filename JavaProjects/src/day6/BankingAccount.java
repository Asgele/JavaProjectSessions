package day6;

public class BankingAccount {

	public static void main(String[] args) {
	//create Sam account	
   Account samiccount = new Account("Sami","Gebre", 5000);
   Account hailuAccount = new Account("Hailu","Abebe",6000);
   Account kbromcount = new Account("Kbrom","Brihe",7000);
   Account genetAccount = new Account("Genet","tesfu",8000);

   //balance = 5000
   System.out.println(samiccount);
   System.out.println(hailuAccount);
   System.out.println(kbromcount);
   System.out.println(genetAccount);
	
   samiccount.debit(1000);
   samiccount.debit(1000);
   samiccount.debit(1000);
   samiccount.debit(600);
   samiccount.debit(1500);
	  //balance =4000  
	System.out.println(samiccount);
	}

}
