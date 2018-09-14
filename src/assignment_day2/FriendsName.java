package assignment_day2;

import java.util.Scanner;

public class FriendsName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		String [] friends= {"Kesav","Neha","Srishti"};
		
		for(int i=0; i<friends.length; i++)
		{
			System.out.println(friends[i]);
		}
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ranging from 1-50");
		int num=sc.nextInt();
		
		//int [] array;
		//array=new int[4];
		//for (int i =0; i<4; i++) {
		//array[i]=Integer.parseInt(args[i]);
		//}
		
		
		int [] number= {23, 11, 36, 44, 6};
		int match=0;
		for(int i=0; i<5; i++)
		{
			if(num==number[i])
			{
				match=1;
			}
				
		}
		if(match==1)
		{
			System.out.println("Match found");
			}
		else
			System.out.println("Sorry");

		int [] arr;
	}
	
	
}
