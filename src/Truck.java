
public class Truck {

	void Load() {
		System.out.println("Truck - Load");
	}

	void Load(int weight) {
		System.out.println("Truck - Load " + weight + " tons");
	}

	void Load(int weight, String material) {
		System.out.println("Truck - Load " + weight + " tons of " + material);
	}

	public static void main(String[] args) {
		Truck truck = new Truck();
		truck.Load();
		truck.Load(10);
		truck.Load(10, "sand");
	}

}
