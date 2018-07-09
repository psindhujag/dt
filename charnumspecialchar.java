import java.util.*;
class Charnumspecialchar
{
 public static void main(String argv[])
 {
   String s1;
   char ch;
   Scanner sc=new Scanner(System.in);
   s1=sc.nextLine();
   ch=s1.charAt(0);
   if(ch>=65 && ch<=90)
   {
     System.out.println("capital="+ch);
   }
   else if(ch>=97 && ch<=122)
   {
     System.out.println("small="+ch);
   }
   else if(ch>='0' && ch<='9')
   {
      System.out.println("number="+ch);
   }
   else
   {
      System.out.println("specialcharacter="+ch);
   }
}
}

   


