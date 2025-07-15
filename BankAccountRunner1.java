class BankAccountRunner1{
	
    public static void main(String[] amt){
	
	System.out.println("main started");
	
		boolean isCredited=BankAccount1.credit(5000.00);
				System.out.println("The credit is success"+isCredited);

		
          System.out.println("The current balance is "+ BankAccount1.balance);
		
		
		
		boolean isDebited=BankAccount1.debit(2000.00);
		System.out.println("The debit is success"+isDebited);
		
		System.out.println("The Current Balance is"+ BankAccount1.balance);
		
		
        System.out.println("main ended");
}
}		