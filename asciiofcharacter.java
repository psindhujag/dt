import java.util.*;
class Asciiofcharacter
{
 public static void main(String argv[])
 {
   String s1;
   char ch;
   Scanner sc=new Scanner(System.in);
   s1=sc.nextLine();
   ch=s1.charAt(0);
   System.out.println("character="+(int)ch);
}
}
