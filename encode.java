import java.io.*;
import java.util.*;
class encode
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        int l=s1.length();
        for(int i=0;i<s.length();i++)
        { int n=(int)s.charAt(i)+10;
        if(Character.isLowerCase(s.charAt(i)))
         {
              if(n>(26+96))
              {
             int n5=(96+(10-((26+96)-(int)s.charAt(i))));
         System.out.print((char)n5);
       
              }
              else
           System.out.print((char)n);
         }
         else
         {
         if(n>(26+64))
              {
                     int n5=(64+(10-((26+64)-(int)s.charAt(i))));
         System.out.print((char)n5);
                    }
              else
              System.out.print((char)n);  
              }
        }
        System.out.println(" ");
        System.out.print(s1.charAt(0));
        String s2=s1.substring(1,str1.length()-1);
        for(int i=0;i<s2.length();i++)
          {
              int n1=(int)s2.charAt(i)+10;
              if(Character.isLowerCase(s2.charAt(i)))
              {
              if(n1>(26+96))
              {
               int n3=(96+(10-((26+96)-(int)s2.charAt(i))));
         System.out.print((char)n3);
                      }
              else
              System.out.print((char)n1);
        }
              else
              {
                if(n1>(26+64))
              {
               int n3=(64+(10-((26+64)-(int)s2.charAt(i))));
         System.out.print((char)n3);
                      }
              else
              System.out.print((char)n1);  
              }
          }
        System.out.print(s1.charAt(s1.length()-1));
        
    }
}
