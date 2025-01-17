package pruebaPSP;



public class testDriverDelivers {
	public static void main(String[] args) {
				driverDeliver d1 = new driverDeliver("Osvaldo del Carmen", 10);
				driverDeliver d2 = new driverDeliver("Juan Sebastián", 20);
				driverDeliver d3 = new driverDeliver("Marcos Rodriguez", 25);
				
				
				d1.start();
				d2.start();
				d3.start();
				
				System.out.println("The drivers are on their way");
	}
}

