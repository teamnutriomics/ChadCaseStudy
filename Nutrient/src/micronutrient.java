
public class micronutrient {

	double dailyMin;
	double dailyMax;
	
	public double amountConsumed;
	public String increase;
	public String name;
	public micronutrient(String mn){
		
		name = mn;
		if(name.equals("Vitamin A")){
			dailyMin = .9;
			dailyMax = 3;
			increase = "Daraba (Sweet Potatoes)";
		}
		else if(name.equals("Vitamin C")){
			dailyMin = 90;
			dailyMax = 2000;
			increase = "Citrus Fruits";
		}
		else if(name.equals("Calcium")){
			dailyMin = 1000;
			dailyMax = 2500;
			increase = "Okra Gumbo or Citrus Fruits";
		}
		else if(name.equals("Iodine")){
			dailyMin = .15;
			dailyMax = 1.1;
			increase = "Okra Gumbo or Peanut Butter";

		}
		else if(name.equals("Folate")){
			dailyMin = .4;
			dailyMax = 1;
			increase = "Okra Gumbo, Peanut Butter, or Green Beans";

		}
		else if(name.equals("Zinc")){
			dailyMin = 11;
			dailyMax = 40;
			increase = "Beef";

		}
		else if(name.equals("Iron")){
			dailyMin = 8;
			dailyMax = 45;
			increase = "Green Beans or Pork";

		}
		
		amountConsumed = 0;
		
	}
	
}
