import java.io.*;
import java.util.*;
class passgene
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String fname=s.next();
        String lname=s.next();
        String pin=s.next();
        int n=s.nextInt();
        String arr[]={fname,lname};
        Arrays.sort(arr);
        ArrayList<String> a1=new ArrayList<String>();
        ArrayList<String> a2=new ArrayList<String>();
       
        for(int i=0;i<fname.length();i++)
        {
            char ch=fname.charAt(i);
            a1.add(Character.toString(ch));
        }
        for(int i=0;i<lname.length();i++)
        {
            char ch=lname.charAt(i);
            a2.add(Character.toString(ch);
        }
        Collections.sort(a1);
        Collections.sort(a2);
        String max="",d="";
        String min="";
        if(a1.size()>a2.size())
        {
        max=fname;
        min=lname;
        }
        else if(a1.size()<a2.size())
        {
        max=lname;
        min=fname;
        }
        else if(a1.size()==a2.size())
        {
            min=arr[0];
            max=arr[1];
        }
        d=Character.toString(max.charAt(0))+""+min;
        for(int i=0;i<d.length();i++)
        {
            if(Character.isLowerCase(d.charAt(i)))
                System.out.print((Character.toString(d.charAt(i))).toUpperCase());
            else
                System.out.print((Character.toString(d.charAt(i))).toLowerCase());
        }
        System.out.print(pin.charAt(n-1));
        System.out.print(pin.charAt(pin.length()-n));
        
    }
}


