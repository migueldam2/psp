package pruebaPSP;

class driverDeliver extends Thread{
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
			}catch (InterruptedException e) {
				System.out.println(driverName + " was interrupted while delivering.");
			}
			System.out.println(driverName + " finished delivering.");
		}
	}
	
