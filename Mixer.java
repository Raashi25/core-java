class Mixer{
	static boolean isPlug=true;
	static int currentStep;
	static int maxStep=4;
	static int minStep;
	
	public static void isOnOff(){
		if(isPlug==false){
			//isPlug=true;
			System.out.println(" Power off,please plug to switch and turned on ");
			}
		else{
			System.out.println(" Power On ");
		}

}
	public static void stepsUp(){
			System.out.println("Steps Method started");

		if(isPlug==true){
			if(currentStep<maxStep){
				currentStep=currentStep+1;
				System.out.println("Curren step is "+currentStep);
				
			}
		}
		else{
			System.out.println(" Power off,please plug to switch and turned on ");
		}
			
	}

	public static void stepDown(){
		System.out.println("StepDown method started");
		if (isPlug=true){
			if(currentStep>minStep)
				currentStep=currentStep-1;
				System.out.println("The currentStep is "+currentStep);
		}else{
			System.out.println(" Power off,please plug to switch and turned on ");
		}
			
	}
			
			
				


}	