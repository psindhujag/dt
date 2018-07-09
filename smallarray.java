class SmallArray
{ 
 public static void main(String argv[])
 {
  int i;
  int a[]={50,20,40,30,10};
  int temp=a[0];
  for(i=0;i<5;i++)
  {
    if(temp>a[i])
    {
     temp=a[i];
    }
}  
  System.out.println("small="+temp);
  
 }
}
   