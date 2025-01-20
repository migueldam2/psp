package pruebaPSP;

class driverDeliver extends Thread {
	private String driverName;
	private int deliveryTime;

	public driverDeliver(String driverName, int deliveryTime) {
		this.driverName = driverName;
		this.deliveryTime = deliveryTime;
	}

	public void run() {
		System.out.println(driverName + " started the delivery.");
		try {
			Thread.sleep(deliveryTime * 1000L);
		} catch (InterruptedException e) {
			System.out.println(driverName + " was interrupted while delivering.");
		}
		System.out.println(driverName + " finished delivering.");
	}

	
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