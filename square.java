import java.util.*;
public class square
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n[]=new int[8];
        for(int i=0;i<n.length;i++)
        {
            n[i]=s.nextInt();
        }
      if((n[1]==n[2])&&(n[4]==n[6])&&(n[1]==n[7])&&(n[3]==n[5]))
      {
      System.out.print("square");
    }
    }
}
