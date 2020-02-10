import java.util.* ;

public class MainApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int n1 = sc.nextInt();
		System.out.println("Enter Number 2");
		int n2 = sc.nextInt();
		
		System.out.println("Enter the operation between them ");
		char c ;
		
		c = sc.next().charAt(0);
		switch(c) {
		case '+' : System.out.println(Calculator.add(n1, n2)); break ;
		case '*' : System.out.println(Calculator.mul(n1, n2)); break ;
		case '-' : System.out.println(Calculator.sub(n1, n2)); break ;
		case '/' : System.out.println(Calculator.div(n1, n2)); break ;
		
		default : System.out.println("Invalid Operation");
		}
		
	}
}
