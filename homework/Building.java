public class Building{
	private int numWindows;
	private String ownerName;
	private boolean hasStairs;
	private String[] roomNames;
	public static void main(String[] args){
		Building b1 = new Building();
		Building b2 = new Building();
		String[] roomNamesA = {"living room", "bathroom", "bedroomA", "bedroomB", "family room"};
		String[] roomNamesB = {"living room", "cave room", "bedroomA", "bedroomB", "family room", "sauna"};
		b1.Building(6, "Hulk", true, roomNamesA);
		b2.Building(10, "Monica", false, roomNamesB);
		System.out.println(b1.sentence());
		System.out.println(b2.sentence());

	}
	public void Building(){
		numWindows = 6;
		ownerName = "Maya";
		hasStairs = false;
		roomNames = new String[5];
	}
	public void Building(int numWindows, String ownerName, boolean hasStairs, String[] roomNames){
		this.numWindows = numWindows;
		this.ownerName = ownerName;
		this.hasStairs = hasStairs;
		this.roomNames = roomNames;
	}
	public String toString(String[] roomNames){
		String roomNamesStr = "";
		for (int i = 0; i < roomNames.length; i++){
			if (i == roomNames.length - 1){
				roomNamesStr += roomNames[i];
			}
			else {
				roomNamesStr += roomNames[i] + ", ";
			}
		}
		return roomNamesStr;
	}
	public String sentence() {
		String sentence = "Building: number of windows = " + numWindows + ", ownerName = " + ownerName;
		if (hasStairs){
			sentence += ", has stairs, ";
		}
		else {
			sentence += ", does not have stairs, ";
		}
		sentence += "Rooms: " + toString(roomNames);

		return sentence;
	}
}