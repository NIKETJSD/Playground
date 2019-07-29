import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
     
      int s=n/100;
      int w=n%10;
      int sum=s+w;
      System.out.println(sum);
	}
}