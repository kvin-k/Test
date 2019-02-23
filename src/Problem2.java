import java.util.Scanner;

public class Problem2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String s1=sc.next();
		int n=marsExploration(s1);
		System.out.println(n);
	}

	private static int marsExploration(String s1) {
		int len=s1.length();
		StringBuilder stb= new StringBuilder();
		if(len%3!=0) {
			System.out.println("Invalid input");
		}
		else {
			for (int i = 0; i < len/3; i++) {
				stb.append("SOS");
			}
		}
		String original=stb.toString();
		char[] realMessage=original.toCharArray();
		char[] receivedMessage=s1.toCharArray();
		int errorCount=0;
		for (int i = 0; i < receivedMessage.length; i++) {
			if(realMessage[i]!=receivedMessage[i])
				errorCount++;
		}
		

		
		
		return errorCount;
	}

}
