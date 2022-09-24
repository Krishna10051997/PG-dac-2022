class P10
{              
public static void main(String[] args)  
{  
for (int i = 0; i <= 4; i++)   
{  
int c = 65;   
for (int j = 4; j > i; j--)  
{  
System.out.print(" ");  
}  
for (int k = 0; k <= i; k++)  
{  
System.out.print((char) (c + k) + " ");  
}  
System.out.println();  
}  
}  
}  