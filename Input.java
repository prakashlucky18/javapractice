package corejava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Input {

	public static void main(String[] args) throws IOException { 
		System.out.println("enter a number");
//		bufferreader and inputstreamreader
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(in);
		int num=Integer.parseInt(bf.readLine());
		System.out.println(num);
		System.out.println("enter a  another number");
//		scanner class
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println(num1);
	}
}
