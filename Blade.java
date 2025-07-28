class Blade {
    String brand;
    String type;
    String size;
    double price;
    boolean isStainlessSteel;
    String usage;
	
	Blade(){
			
			System.out.println("The constructor is invoked");
			
		}
		Blade(String brand,String type,String size,double price,boolean isStainlessSteel,String usage);
			System.out.println("The parameterized constructor is invoked");
			
			this.brand=brand;
			this.type=type;
			this.size=size;
			this.price=price
			this.isStainlessSteel=isStainlessSteel;
			this.usage=usage;
			
			
		}
	
	public void getBladeInfo(){
	System.out.println("brand: " + brand);
        System.out.println(".type: " + type);
        System.out.println("size: " +size);
        System.out.println("price: " + price);
        System.out.println("isStainlessSteel: " + isStainlessSteel);
        System.out.println("usage: " + usage);
}
}
