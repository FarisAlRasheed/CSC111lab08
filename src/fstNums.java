import java.util.Scanner;
public class fstNums {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		int fNum = input.nextInt();
		System.out.print("Enter Second Number: ");
		int sNum = input.nextInt();
		System.out.print("Enter Third Number: ");
		int tNum = input.nextInt();
		
		for(int i =fNum; i <= sNum; i++){
			System.out.print((i) + " ");
		}
		System.out.println();
		for(int i =tNum; i >= sNum; i--){
			System.out.print((i) + " ");
		}
	}		


}
