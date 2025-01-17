package pruebaPSP;

class driverDeliverImplements implements Runnable{
	private String driverName;
	private int deliveryTime;
	
	public driverDeliverImplements(String driverName, int deliveryTime){
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
}
