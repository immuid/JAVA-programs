package week_5;

import java.util.Date;
public class ThreadDemo2 {
	public static void main(String[] args) throws Exception{
		VaccinationCenter vc=new VaccinationCenter();
		Thread t=Thread.currentThread();
		t.setName("shoiab");
		System.out.println(new Date());
		System.out.println("Before comming to class....");
		Thread kala=new Thread(new JobToKala(vc),"kala");
		kala.start();
		//vc.getToken();
		System.out.println("Take class.....for 7-9 Golden Batch...."+new Date());
	}	
}
class JobToKala implements Runnable{
	VaccinationCenter vc;
	public JobToKala(VaccinationCenter vc) {
		this.vc=vc;
	}
@Override
	public void run() {
		System.out.println("The job given to kala is executed from this method...");
		try{
			vc.getToken();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
}
class VaccinationCenter {
	public void getToken() throws Exception{
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"...standing in queue for token....");
		Thread.sleep(10000);
		System.out.println("token received..."+new Date());
	}
}

//import java.util.Date;
//
//public class ThreadDemo2 {
//	public static void main(String[] args) throws Exception{
//		VaccinationCenter vc=new VaccinationCenter();
//		Thread t=Thread.currentThread();
//		t.setName("shoiab");
//		System.out.println(new Date());
//		System.out.println(" Before coming to class ...");
//		Thread kala=new Thread(new JobToKala(vc),"kala");
//		kala.start();
//		vc.getToken();
//		System.out.println("Take class for 7 to 9 am.."+new Date());
//		
//	}
//
//}
//class JobToKala implements Runnable{
//	VaccinationCenter vc;
//	public JobToKala(VaccinationCenteer vc){
//		this.vc=vc;
//		}
//	@Override
//	public void run() {
//		System.out.println("The job given t kala is executed..from this method...");
//		try {
//			vc.getToken();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//}
//class VaccinationCenter{
//	public void getToken() throws Exception{
//		Thread t=Thread.currentThread();
//		String name=t.getName();
//		System.out.println(name+"..standing is queue for token...");
//		
//		Thread.sleep(10000);
//		System.out.println("token received..."+new Date());
//	}
//}