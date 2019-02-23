import java.util.Scanner;

public class Problem1{
	public static int[] x,y,z;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		catAndMouse();
	}

	private static void catAndMouse() {
		Scanner sc = new Scanner(System.in);
		int queriesNo=sc.nextInt();
		int x[]= new int[queriesNo];
		int y[]= new int[queriesNo];
		int z[]= new int[queriesNo];
		for (int j = 0; j < queriesNo; j++) {
			x[j]=sc.nextInt();
			y[j]=sc.nextInt();
			z[j]=sc.nextInt();
		}
		for (int i = 0; i < queriesNo; i++) {
			if((Math.abs(x[i]-z[i])-Math.abs(y[i]-z[i]))==0) {
				System.out.println("Mouse C");
			}
			else if((Math.abs(x[i]-z[i])>Math.abs(y[i]-z[i]))){
				System.out.println("Cat B");
			}
			else {
				System.out.println("Cat A");
			}
		}
		
	}

	

}
