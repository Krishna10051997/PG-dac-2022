 public class P15  
{  
public static void main(String[] args)  
{  
int c=5;  
for (int i= 0; i<= c-1; i++)  
{  
for (int j=0; j<=i; j++)  
{  
System.out.print(" ");  
}  
for (int k=0; k<=c-1-i; k++)  
{  
System.out.print("*");  
}  
System.out.println();  
}  
}  
}  