
import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        int m=0;
        Scanner sc=new Scanner(System.in);
        StringBuffer s1=new StringBuffer(sc.next());
        StringBuffer t=new StringBuffer("");
        StringBuffer t1=new StringBuffer("");
        StringBuffer t2=new StringBuffer("");
        for(int i=0;i<s1.length();i++)
        {
            for(int j=i+1;j<s1.length();j++)
            {
                t=new StringBuffer(s1.substring(i,j));
                t1=new StringBuffer(s1.substring(i,j));
          t.reverse();   
          if(t1.toString().equals(t.toString())&&t.length()>m)
            {
        m=t1.length();
        t2=t1;
        
    }
}
}
    System.out.print(t2);
    
    }
}

   


