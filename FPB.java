import java.util.Scanner;
public class FPB {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);

    	int a = scan.nextInt();
    	int b = scan.nextInt();

    	do {
    		int mod = a%b;
    		a = b;
    		b = mod;
    	} while (b > 0);

    	System.out.println("FPB nya adalah "+a);
    }
}