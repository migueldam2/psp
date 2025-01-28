package pruebaPSP;

public class MultipleThreads extends Thread{
	private String driverName;
	private int deliveryTime;

	public MultipleThreads(String driverName, int deliveryTime) {
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
		
		int numberThreads = 99;
		int deliverTime = 1;
		Thread[] threads = new Thread[numberThreads];
		
		for (int i = 0; i < 99; i++) {
			threads[i] = new Thread(new MultipleThreads("Osvaldo del Carmen", deliverTime));
			threads[i].start();
			
			deliverTime++;
		}
		
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("The drivers are on their way");
	}
}
