import java.util.Scanner;

public class con_statement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entry row Value: ");
		int row = sc.nextInt();
		System.out.println("Entry col Value: ");
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		System.out.println("Entry  Values : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Values are: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
