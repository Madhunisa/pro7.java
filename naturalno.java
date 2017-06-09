# pro7.java
	import java.io.*;
	import java.util.*;
	public class naturalno
	{
    public static void main(String args[])
{
        int x, i = 1 ;
        int sum = 0;
        System.out.println("Enter Number of items :");
        Scanner s = new Scanner(System.in);
	        x = s.nextInt();
	        while(i <= x)
        {
            sum = sum +i;
            i++;
            }
        System.out.println("Sum of "+x+" numbers is :"+sum);
    } 
    
}


