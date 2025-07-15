class BankRegistrationRunner{
	public static void main(String []br){
		boolean isregistrationDone = BankRegistration.registration("Raashi" ,false,"25-10-2004","Shivamogga",483073567313l);
		System.out.println(" the  BankRegistration is "+isregistrationDone);
		if(isregistrationDone==true)BankRegistration.getDetails();
		
}}