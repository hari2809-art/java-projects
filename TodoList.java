package demo;
import java.util.ArrayList;
import java.util.Scanner;
public class TodoList {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> tasks=new ArrayList<String>();
		while(true) {
			System.out.println("Simple TO-DO-LIST-APP");
			System.out.println("1.add a Task");
			System.out.println("2.view a Task");
			System.out.println("3.Delete a Task");
			System.out.println("4.exit");
			System.out.println("choose an option(1-4)");
			int choice =sc.nextInt();
			if(choice==1) {
				System.out.println("Enter your Task:");
				String task=sc.nextLine();
				tasks.add(task);
				System.out.println("Task Added successfully");
			}
			else if(choice==2) {
				if(tasks.isEmpty()) {
					System.out.println("No task found");
				}else {
					System.out.println("Your tasks");
					for(int i=0;i<tasks.size();i++) {
						System.out.println((i+1)+""+tasks.get(i));
					}
				}
			}else if(choice==3) {
				if(tasks.isEmpty()) {
					System.out.println("Nothing is Delete");
				}else {
					System.out.println("Enter task number to0 delete");
					int tasknum=sc.nextInt();
					if(tasknum>=1&&tasknum<=tasks.size()) {
						tasks.remove(tasknum-1);
						System.out.println("Task deleted");
					}else {
						System.out.println("invalid number");
					}
				}
			}else if(choice==4) {
				System.out.println("GoodBye");
				break;
			}else {
				System.out.println("choose a value:");
			}
		}
		sc.close();1
	}
}
