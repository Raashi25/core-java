class Politician {
    int id;
    String name;
    String party;
    String constituency;
    int age;
    String education;
    String position; 
    boolean isInPower;
    String hometown;
	
	Pipe(){
			
			System.out.println("The constructor is invoked");
			
		}
		Pipe(String name,String party,String constituency,int age,String education,String position,boolean isInPower, String hometown;){
			
			System.out.println("The parameterized constructor is invoked");
			
			this.name=name;
			this.party=party;
			this.constituency=constituency;
			this.age=age;
			this.education=education;
			this.position=position;
			this.isInPower=isInPower;
			this.hometown=hometown;
			
		}
	
	public void getPoliticianInfo(){
		
		System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Party: " +party);
        System.out.println("Constituency: " + constituency);
        System.out.println("Age: " + age);
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
        System.out.println("In Power: " + isInPower);
        System.out.println("Hometown: " + hometown);
        System.out.println();
	}
}