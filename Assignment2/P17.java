  
class P17  
{  
public static void main(String[] args)  
{  
int i, j, k, c;  

  
c = 5;              
for (i= 0; i<= c-1 ; i++)  
{  
for (j=0; j<i; j++)  
{  
System.out.print(" ");  
}  
for (k=i; k<=c-1; k++)   
{   
System.out.print("*" + " ");   
}   
System.out.println("");   
}   
for (i= c-1; i>= 0; i--)  
{  
for (j=0; j<i; j++)  
{  
System.out.print(" ");  
}  
for (k=i; k<=c-1; k++)  
{  
System.out.print("*" + " ");  
}  
System.out.println("");  
}  

}  
}  