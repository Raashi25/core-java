class Iccteams{

   static String india="Team India";
   static String srilanka="Team Srilanka";
   static String uganda="Team Uganda";
   static String westindies="Team WestIndies";
   
     static String[] cricketteams={india,srilanka,uganda,westindies};
     public static void main(String[] teams){
	   System.out.println(india);
	   System.out.println(srilanka);
	   System.out.println(uganda);
	   System.out.println(westindies);
	   
	   for(String t:cricketteams){
	     System.out.println(t);
	   
	    }
System.out.println(cricketteams[0]+" "+ cricketteams[1]+" "+cricketteams[2]);
    } 	
}