package assignment2;

class ClassStudents extends Thread {
	public void run(){
		for (int i=0; i<=3 ; i++){
			System.out.println(Thread.currentThread().getName());
			Thread.yield();




			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}


	public static void main(String args[]) throws InterruptedException{

		ClassStudents a = new ClassStudents();
		ClassStudents b= new ClassStudents();
		ClassStudents c = new ClassStudents();


		a.setName("John");
		b.setName("Johny");
		c.setName("Joe");


		a.start();
		b.start();
		c.start();

		b.join();
		c.join();


	}
}






