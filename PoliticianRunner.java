class PoliticianRunner {
    public static void main(String args[]) {
        System.out.println("Main Started - Politician Data for Karnataka");

        
        Politician p1 = new Politician(1,"Siddaramaiah","INS","Varuna",77,"B.Sc,LLB","CM",true,"Mysuru");
        
        p1.getPoliticianInfo();

        
        Politician p2 = new Politician(2,"D K ShivKumar","INS","Kanakapura",63,"B.A","Deputy CM",true,"Kanakapura");
           p2.getPoliticianInfo();
		
        Politician p3 = new Politician(3,"B S Yeddyurappa","BJP","Shikaripura",82,"PUC"," Former CM",false,"Mandya");
       
        p3.getPoliticianInfo();
		
        Politician p4 = new Politician(4,"H D kumarswamy","Janatha dala","Channapatna",65,"B.Sc","MLA",false,"Hassan");
        
        p4.getPoliticianInfo();
		
        Politician p5 = new Politician(5,"Basavaraj Bommai","BJP","Shiggaon",65,"B.E","Former CM",false,"Hubballi");

        p5.getPoliticianInfo();
		
        Politician p6 = new Politician(6,"G. Parameshwara","INS","Koratagere",74,"Ph.D","Minister",true,"Tumakuru");
      
        p6.getPoliticianInfo();
		
        Politician p7 = new Politician(7,"K J George","INS","Sarvagnanagar",77,"B.A","Minister",true,"Bengaluru");
       
        p7.getPoliticianInfo();
		
        Politician p8 = new Politician(8,"C T Ravi","BJP","Chikmagalur",58,"B.A","MLA",false,"Chikmagalur");
       
        p8.getPoliticianInfo();
		
        Politician p9 = new Politician(9,"Jagadish","INS","hubli",69,"B.Com","MLA",true,"Hubballi");
        
		p9.getPoliticianInfo();

        
        Politician p10 = new Politician(10,"R Ashoka","BJP","Padmanabhanagar",68,"B.A,LLB","MLA",false,"Bengaluru");

        p10.getPoliticianInfo();
		
        Politician p11 = new Politician(11,"Priyanaka Mohan","INS","Chittapur",47,"B.Sc","Minister",true,"Kalaburagi");
      
        p11.getPoliticianInfo();
        Politician p12 = new Politician(12,"H K Patil","INS","Gadag",71,"B.Sc,LLB","Minister",true,"Gadag");
        
		p12.getPoliticianInfo();
        Politician p13 = new Politician(13,"Araga Jnanendra","BJP","Thirthahalli",71,"B.Com","MLA",false,"Shivamogga");
        
        p13.getPoliticianInfo();
        Politician p14 = new Politician(14,"Byrathi Suresh","INS","Hebbal",59,"SSLC","MLA",true,"Bengaluru");

        p14.getPoliticianInfo();
        Politician p15 = new Politician(15,"V Somanna","BJP","Varuna",77,"PUC","Former Minister",false,"Bengaluru");
        
        p15.getPoliticianInfo();
        System.out.println("Main Ended - Politician Data Display Complete");
    }
}