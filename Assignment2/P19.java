 
class P19 
{  
public static void main(String[] args)  
{  
int i, j, c;  
 c=5;          
for (i= 0; i<= c-1; i++)  
{  
for (j=0; j<=i; j++)   
{  
System.out.print("*");  
}   
System.out.println("");   
}   
for (i=c-1; i>=0; i--)  
{  
for(j=0; j <= i-1;j++)  
{  
System.out.print("*");  
}  
System.out.println("");  
}  
}  
}  
