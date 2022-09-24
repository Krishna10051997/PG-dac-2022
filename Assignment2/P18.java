class P18 
{  
public static void main(String[] args)  
{  
int i, j, k;  
int c=5;
          
for (i= 1; i<= c ; i++)  
{  
for (j=i; j <c ;j++)              
{  
System.out.print(" ");  
}  
for (k=1; k<=i;k++)   
{  
System.out.print("*");   
}   
System.out.println("");   
}   
for (i=c; i>=1; i--)  
{  
for(j=i; j<=c;j++)  
{  
System.out.print(" ");  
}  
for(k=1; k<i ;k++)   
{  
System.out.print("*");  
}  
System.out.println("");  
}  
 
}  
}  


