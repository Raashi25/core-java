class PipeRunner {
    public static void main(String args[]) {
        System.out.println("Main Started - Pipe Inventory Display");

        Pipe pipe1 = new Pipe(1,"PVC",5.0,600.0,"Water Supply",160.0,2.50);
       
		pipe1.getPipeInfo();
        

        Pipe pipe2 = new Pipe(2,"Copper",2.0,300.0," HotWater Supply",200.0,8.75);
        
		pipe2.getPipeInfo();
              

        Pipe pipe3 = new Pipe(3,"Galvanized Steel",10.0,1200.0,"Gas Line",300.0,15.00);
        

        pipe3.getPipeInfo();

        Pipe pipe4 = new Pipe(4,"Cast Iron",15.0,400.0,"Drainage",50.0,12.50);
      

        pipe4.getPipeInfo();

        Pipe pipe5 = new Pipe(5,"PEX",1.5,2000.0,"Potable Water",100.0,1.80);
        

        pipe5.getPipeInfo();

        Pipe pipe6 = new Pipe(6,"Stainless Steel",7.5,800.0,"Chemical Track",400.0,25.00);
        

        pipe6.getPipeInfo();

        Pipe pipe7 = new Pipe(7,"HDPE",20.0,500.0,"Sewer Line",80.0,7.50);
        

        pipe7.getPipeInfo();

        Pipe pipe8 = new Pipe(8,"Brass",1.0,100.0,"Fittings",180.0,10.00);
        

        pipe8.getPipeInfo();

        Pipe pipe9 = new Pipe(9,"Carbon Steel",30.0,10000.0,"Oil",1000.0,50.50);
        

        pipe9.getPipeInfo();

        Pipe pipe10 = new Pipe(10,"ABS",7.5,600.0,"Drain",60.0,3.00);
        

        pipe10.getPipeInfo();

        Pipe pipe11 = new Pipe(11,"PVC",5.0,600.0,"Water Supply",160.0,2.50);
        

        pipe11.getPipeInfo();

        Pipe pipe12 = new Pipe(12,"Copper",2.0,300.0," HotWater Supply",200.0,8.75);
        

        pipe12.getPipeInfo();

        Pipe pipe13 = new Pipe(13,"Galvanized Steel",10.0,1200.0,"Gas Line",300.0,15.00);

        pipe13.getPipeInfo();

        Pipe pipe14 = new Pipe(14,"Cast Iron",15.0,400.0,"Drainage",50.0,12.50);
        

        pipe14.getPipeInfo();


        pipe15.getPipeInfo();
		
		Pipe pipe16 = new Pipe(16,"PEX",1.5,2000.0,"Potable Water",100.0,1.80);
        

        pipe16.getPipeInfo();

        Pipe pipe17 = new Pipe(17,"Stainless Steel",7.5,800.0,"Chemical Track",400.0,25.00);
        

        pipe17.getPipeInfo();

       Pipe pipe18 = new Pipe(18,"HDPE",20.0,500.0,"Sewer Line",80.0,7.50);

        pipe18.getPipeInfo();

		Pipe pipe9 = new Pipe(19,"Carbon Steel",30.0,10000.0,"Oil",1000.0,50.50);
        pipe19.getPipeInfo();

        Pipe pipe20 = new Pipe(20,"ABS",7.5,600.0,"Drain",60.0,3.00);
        
       
       

        pipe20.getPipeInfo();

        System.out.println("Main Ended - Pipe Inventory Display Complete");
    }
}