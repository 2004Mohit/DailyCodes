import java.util.Scanner;
class RevTable {
	public static void main(String[] s) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		for(int i = 10 ;i>=1;i--) {
			System.out.println(num*i);
		}
	}
}
