public class Farm{
	private String farmName;
	private Animal[] animals;
	private int numAnimals;
	// public static void main(String[] args){
	// 	Farm farm = new Farm();
	// 	Animal lion = new Animal("lion", 1999, 12, 'f');
	// 	farm.printAllDetails();
	// }
	public static void main(String[] args){
    Farm[] farm = new Farm[10];
		Animal lion = new Animal("lion", 1999, 12, 'f');
		lion.printDetails();
		farm[0] = new Farm();
		farm[0].addAnimal(lion);
	}
	public Farm(){
		animals = new Animal[10];
		farmName = "";
		numAnimals = 0;
	}
	public Farm(String farmName){
		this.farmName = farmName;
		animals = new Animal[10];
		numAnimals = 0;
	}
	public Farm(int maxAnimals){
		animals = new Animal[maxAnimals > 0 ? maxAnimals : 0];
		farmName = "";
		numAnimals = 0;
	}
	public Farm(java.lang.String farmName, int maxAnimals){
		this.farmName = farmName;
		animals = new Animal[maxAnimals > 0 ? maxAnimals : 0];
		numAnimals = 0;
	}
	public void setFarmName(String name){
		farmName = name;
	}
	public String getFarmName(){
		return farmName;
	}
	public void addAnimal(Animal a){
		if (numAnimals >= animals.length){
			//resizeAnimalArray();
		}
		animals[numAnimals] = a;
		numAnimals += 1;
	}
	public Animal getAnimal(int index){
		if (index > numAnimals || index < 0){
			return null;
		}
		else {
			return animals[index];
		}
	}
	public int getNumAnimals(){
		return numAnimals;
	}
	public Animal getFirstAnimal(){
		return getAnimal(0);
	}
	public Animal getLastAnimal(){
		return getAnimal(numAnimals-1);
	}
	public Animal[] getAnimals(){
		return animals;
	}
	public Animal removeAnimal(int index){
		Animal removedAnimal = null;
		if (index >= 0 && index < numAnimals){
			removedAnimal = animals[index];
			for (int i = index; i < numAnimals - 1; i++){
				animals[i] = animals[i+1];
			}
			animals[numAnimals-1] = null;
			numAnimals -= 1;
		}
		return removedAnimal;
	}
	public void removeAllAnimals(){
		for (int i = 0; i < numAnimals; i++){
			animals[i] = null;
		}
		numAnimals = 0;
	}
	public double getTotalWeightOfAllAnimals(){
		double sum = 0.0;
		for (int i = 0; i < numAnimals; i++){
			Animal a = animals[i];
			sum += a.getWeight();
		}
		return sum;
	}
	public double getAverageWeightOfAllAnimals(){
		double sum = getTotalWeightOfAllAnimals();
		return sum / numAnimals;
	}
	public int getNumberOfAnimalsAboveWeight(double weight){
		int numOfAboveAvg = 0;
		for (int i = 0; i < numAnimals; i++){
			if (animals[i].getWeight() > weight){
				numOfAboveAvg++;
			}
		}
		return numOfAboveAvg;
	}
	public int getNumberOfAnimalsBelowWeight(double weight){
		int numOfBelowAvg = 0;
		for (int i = 0; i < numAnimals; i++){
			if (animals[i].getWeight() < weight){
				numOfBelowAvg++;
			}
		}
		return numOfBelowAvg;
	}
	public void increaseWeightOfAllAnimals(){
		for (int i = 0; i < numAnimals; i++){
			animals[i].gainWeight();
		}
	}
	public void increaseWeightOfAllAnimals(double weight){
		for (int i = 0; i < numAnimals; i++){
			animals[i].gainWeight(weight);
		}
	}
	public void printAllDetails(){
		int length = animals.length;
		System.out.printf("FarmName: %20s | Number of Animals: %4d | Farm Size: %4d\n", farmName, numAnimals, length);
		for (int i = 0; i < numAnimals; i++){
			animals[i].printDetails();
		}

	}



}