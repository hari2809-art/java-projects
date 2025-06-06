package java_with_dsa;

class MyTask extends Thread{
	private String taskName;
	public MyTask (){
		this.taskName=getName();
	}
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println(taskName + "Steps"+i);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e) {
			}
		}
	}
	
}
public class SimpleConcurrency {

	public static void main(String[] args) {
		MyTask t1=new MyTask();
		MyTask t2=new MyTask();
		t1.start();
		t2.start();
	}
	
}
