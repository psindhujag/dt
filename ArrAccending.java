import java.util.*;
class ArrAccending
{
 public static void main(String args[])
{
 int i,j;
 int temp;
 int a[]={30,50,20,40,10};
 for(i=0;i<5;i++)
 {
  for(j=i+1;j<5;j++)
  {
    if(a[i]>a[j])
    {
    temp=a[i];
    a[i]=a[j];
    a[j]=temp;
    }
   }
  }
 for(i=0;i<5;i++)
 {
 System.out.println("accending ="+a[i]);
 }
}
}