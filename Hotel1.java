class Hotel1{
    /*static String hotel1="Butter Chicken";
	static String hotel2="Panner Butter Masala";
	static String hotel3="Malai Kofta";
	static String hotel4="Lemon Chicken";
	static String hotel5="Panner Tikka";*/
	
	   public static void main(String []menu){
	      System.out.println("Main started");
	  
	  
	  String hotel1="Butter Chicken";
	  String hotel2="Panner Butter Masala";
	  String hotel3="Malai Kofta";
	  String hotel4="Lemon Chicken";
	  String hotel5="Panner Tikka";
	  
	  //String menu[]={"Butter Chicken|"," Panner Butter Masala|","Malai Kofta|","Lemon Chicken|","Panner Tikka");
	  //System.out.println("HOtelmenu:"+menu[0]+" "+menu[1]+" "+menu[2]+" "+menu[3]+" "+menu[4]);
	  String hot[]={hotel1,hotel2,hotel3,hotel4,hotel5};
	 
	 for (String res:hot){
	      System.out.println(res);
		}
	}
}