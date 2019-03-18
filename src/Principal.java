import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=0;
		int res=0;
		
		Scanner leo=new Scanner(System.in);
		System.out.println("Introduce el primer número");
		num1= leo.nextInt();
		
		System.out.println("Introduce el segundo número");
		num2= leo.nextInt();
		
		System.out.println("Introduce la operación a realizar");
		String operacion=leo.next();
		
		Principal calc=new Principal();
		
		if(operacion.equals("+")) {
			calc.sumar(num1, num2);
			
		}else if(operacion.equals("-")) {
			calc.restar(num1, num2);
			
		}else if(operacion.equals("*")) {
	
			
		}else if(operacion.equals("/")) {
			
		}
	
	}
	
	public int sumar(int n1, int n2) {
		int r=n1+n2;
		return r;
	}
	
	public int restar(int n1, int n2) {
		int r=n1-n2;
		return r;
	}

	public int multiplicar (int n1, int n2) {
		int r=n1*n2;
		return r;
	}
	
	public double dividir (int n1, int n2) {
		double r=n1/n2;
		return r;
	}
}
