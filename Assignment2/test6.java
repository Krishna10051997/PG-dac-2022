class test6{
	static int x =30;
	int y =40;
	 void Display()
	{
		
		System.out.println(x);
		System.out.println(++y);
	}
	void show()
	{
		
		//System.out.println();
		System.out.println(y);
	}
	public static void main(String args[]){
		test6 obj = new test6();
		obj.Display();
		obj.show();
	}
}