import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int s=n%10;
       int v=n/10;
       int sum=s+v;
       System.out.println(sum);
      
	}
}