package pruebaPSP;

class DriverDeliver extends Thread {
	private String driverName;
	private int deliveryTime;

	public DriverDeliver(String driverName, int deliveryTime) {
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
		DriverDeliver d1 = new DriverDeliver("Osvaldo del Carmen", 10);
		DriverDeliver d2 = new DriverDeliver("Juan Sebastián", 20);
		DriverDeliver d3 = new DriverDeliver("Marcos Rodriguez", 25);

		d1.start();
		d2.start();
		d3.start();

		System.out.println("The drivers are on their way");
	}
}