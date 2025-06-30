class SwitchBoard{
	
		static	int switchId = 19;
		static	int	noOfSocket = 9;
		static	int	noOfSwitch = 2;
		static	String  shapeOfSwitchBoard ="Square";
		static	String	colorOfSwitchBoard = "white";
		static String brand ="Dacota";
		static	int voltage	= 240;
		static	int	maxLoad	=1000;
		static boolean isSurgeProtected	=true;
		static boolean isFireResistant =true;
		static String material 	= "polycarbonate";
		static	String madeIn	= "India";
		static int warrantyYears = 2;
		static String manufacturingDate = "March 2024";
		static String fuseType = "Glass Fuse";
        static String coatingType = "Insulated Epoxy";
        static String panelMaterial = "ABS Plastic";
		static String expiryDate = "December 2027";
		static String modelNumber = "SB-X200";
		static String installationType = "Surface Mount";
		
		
		public static void main (String board[]){
		
		System.out.println("the id is " + switchId);
		System.out.println("the noOf Socket is " + noOfSocket);
		System.out.println("the noOf Switch is " + noOfSwitch);
		System.out.println("shape Of Switch Board is " + shapeOfSwitchBoard);
		System.out.println("color Of Switch Board is " + colorOfSwitchBoard);
		System.out.println("brand is " + brand);
		System.out.println("voltage is " + voltage);
		System.out.println("max load is"+ maxLoad);
		System.out.println("surgeprotected" + isSurgeProtected);
		System.out.println("Fire Resistant: " + isFireResistant);
		System.out.println("Material: " + material);
		System.out.println("Made In: " + madeIn);
        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Warranty (Years): " + warrantyYears);
		 System.out.println("Fuse Type: " + fuseType);
        System.out.println("Coating Type: " + coatingType);
        System.out.println("Panel Material: " + panelMaterial);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Expiry Date: " + expiryDate);
		System.out.println("Installation Type: " + installationType);
		
		
		
		}								  

}