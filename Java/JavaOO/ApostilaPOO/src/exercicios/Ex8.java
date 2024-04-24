package exercicios;

public class Ex8 {
	public static void main(String[] args) {
		
		
        int a = 0;
        int b = 1;
        
        for(int i = 2; i <= 100; i++) {
        	int temp = b;
        	b = a + b;
        	a = temp;
        	System.out.print(b + ", ");
        	
        	if(b >= 100) {
        		break;
        	}
        	
        }
	}
}
