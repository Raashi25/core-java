class CustomerDetails{

public static void main(String[] details){
	System.out.println("main started");
	//fullName,first Name,middle Name, last Name.
	// the person name is : Baba 
	String personName  =  "Baba Das"; //reference 
	int  personAge	   =  123;
	String email       = "baba@gmail.com";
	String panNo	   =  "FMDKC78080";
	String currentAdd  = "nivasa 9th cross banashankari,Bengaluru";
	long phoneNo = 9078762413l;         // Note the 'L'!
    long aadharNo = 546254212541L; 
	 
	 
	String Gender      = "male";
	String permanentAdd = "sreenivaasa 8th cross btm layout,bengaluru";
	
	System.out.println("the person name is " + personName); 
	System.out.println("the person age is " + personAge); 
	System.out.println("the person email is " + email); 
	
	String msg= "the person name is :";
	System.out.println(msg + personName); 

   String pan="the panNo is :";
   System.out.println(pan + panNo);
   
   String age="the age is :";
   System.out.println(age + personAge);
   
   
   String emailid="the email is :";
   System.out.println(emailid + email);
   
   String aadhar="the aadhar is :";
   System.out.println(aadhar + aadharNo);
   
   String phone="the phoneno is :";
   System.out.println(phone + phoneNo);
   
   String cadd="the cuadd is :";
   System.out.println(cadd + currentAdd);
   
   String padd="the peradd is :";
   System.out.println(padd + permanentAdd);
   
   String gen="the gender is :";
   System.out.println(gen + Gender);
   
   char gender = 'M' + '2';
   System.out.println("the gender is " + gender);
   
   
	System.out.println("main ended"); 
	
	
}



}

