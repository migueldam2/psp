package pruebaPSP;

public class testDriverDeliverImplements {
public static void main(String[] args) {
	driverDeliverImplements d1 = new driverDeliverImplements("Julian Muñoz", 10);
	driverDeliverImplements d2 = new driverDeliverImplements("Daniel Reguero", 15);
	driverDeliverImplements d3 = new driverDeliverImplements("Carlos Méndez", 20);
	
	
	Thread thread1 = new Thread(d1);
	Thread thread2 = new Thread(d2);
	Thread thread3 = new Thread(d3);
	
	
	thread1.start();
	thread2.start();
	thread3.start();
	
	
	System.out.println("All drivers are delivering.");
}
}
