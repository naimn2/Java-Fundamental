import java.util.Scanner;
public class KPK {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);

    	int a = scan.nextInt();
    	int b = scan.nextInt();
      int p = a;
      int q = b;

    	do {
    		int mod = a%b;
    		a = b;
    		b = mod;
    	} while (b > 0);
      
      int kpk = (p/a)*q;

    	System.out.println("KPK nya adalah "+kpk);
    }
}
