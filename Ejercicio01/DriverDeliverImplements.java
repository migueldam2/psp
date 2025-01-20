package pruebaPSP;

class DriverDeliverImplements implements Runnable{
	private String driverName;
	private int deliveryTime;
	
	public DriverDeliverImplements(String driverName, int deliveryTime){
		this.driverName = driverName;
		this.deliveryTime = deliveryTime;
	}
	
	public void run() {
		System.out.println(driverName + " started driving.");
		try {
			Thread.sleep(deliveryTime*1000L);
		}catch (InterruptedException e) {
			System.out.println(driverName + " was interrupted while driving.");
		}
		System.out.println(driverName + " finished delivering.");
	}
	
	public static void main(String[] args) {
		DriverDeliverImplements d1 = new DriverDeliverImplements("Julian Muñoz", 10);
		DriverDeliverImplements d2 = new DriverDeliverImplements("Daniel Reguero", 15);
		DriverDeliverImplements d3 = new DriverDeliverImplements("Carlos Méndez", 20);
		
		
		Thread thread1 = new Thread(d1);
		Thread thread2 = new Thread(d2);
		Thread thread3 = new Thread(d3);
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		System.out.println("All drivers are delivering.");
	}
}
