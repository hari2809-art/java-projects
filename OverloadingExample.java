package java_with_dsa;
class Calculator{
	int calculate(int a,int b){
		return a+b;
	}
	double calculate1(double a,double b) {
		return a+b;
	}
	int calculate(int a,int b,int c) {
		return a*b*c;
	}
	double calculate(double a,double b) {
		return a*b;
	}
}
public class OverloadingExample {
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		System.out.println(calc.calculate(10,20));
		System.out.println(calc.calculate(10,20,30));
		System.out.println(calc.calculate(20.5,20.5));
	}
}
