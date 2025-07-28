class Weapon {
    String name;
    String type;
    String material;
    double weight;
    int damage;
    boolean isRanged;
	
	NewsPaper(){
			
			System.out.println("The constructor is invoked");
			
		}
		NewsPaper(String name,String type,String material,double weight,int damage,boolean isRanged;){
			
			System.out.println("The parameterized constructor is invoked");
			this.name=name;
			this.type=type;
			this.material=material;
			this.weight=weight;
			this.damage=damage;
			this.isRanged=isRanged;
			
		}
	
	public void getWeaponInfo(){
		
		System.out.println("name: " +name);
		 System.out.println("type: " + type);
		  System.out.println("material: " + material);
		   System.out.println("weight: " + weight);
		    System.out.println("damage: " + damage);
			 System.out.println("isRanged: " + isRanged);
		
	}
}
