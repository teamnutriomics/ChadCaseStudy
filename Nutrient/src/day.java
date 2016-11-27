
public class day{
	



	static micronutrient vitaminA = new micronutrient("Vitamin A");
	static micronutrient vitaminC = new micronutrient("Vitamin C");
	static micronutrient calcium = new micronutrient("Calcium");
	static micronutrient iodine = new micronutrient("Iodine");
	static micronutrient folate = new micronutrient("Folate");
	static micronutrient zinc = new micronutrient("Zinc");
	static micronutrient iron = new micronutrient("Iron");

	
	static double vitaminAConsumed, vitaminCConsumed, calciumConsumed, iodineConsumed, folateConsumed, zincConsumed, ironConsumed;
	
	static micronutrient[] consumed = {vitaminA, vitaminC, calcium, iodine, folate, zinc, iron};


	public static void main(String[] args) {

		

		//Input your consumption values here
		vitaminAConsumed = 0;
		vitaminCConsumed = 0;
		calciumConsumed = 0;
		iodineConsumed = 0;
		folateConsumed = 0;
		zincConsumed = 0;
		ironConsumed = 0;
		
		day();
	
	}
	
	

	public static void day(){
		vitaminA.amountConsumed = vitaminAConsumed;
		vitaminC.amountConsumed = vitaminCConsumed;
		calcium.amountConsumed = calciumConsumed;
		iodine.amountConsumed = iodineConsumed;
		folate.amountConsumed = folateConsumed;
		zinc.amountConsumed = zincConsumed;
		iron.amountConsumed = ironConsumed;
		
		for(micronutrient a : consumed){
			if(a.amountConsumed < a.dailyMin)
				System.out.println("You aren't consuming enough " + a.name + ". You should consume more " + a.increase + "!");
			else if (a.amountConsumed > a.dailyMax)
				System.out.println("You are consuming too much " + a.name + ". You should consume fewer " + a.name + "-rich foods!");
			else
				System.out.println("You are consuming a suitable amount of " + a.name + ". Keep up the great nutrition!");

		}
	}
	
}
