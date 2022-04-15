package example;

class demo
{
	int a,b;
	
	public  demo()
	{
		a=10;
		b=20;
	}
	public demo(int a,int b) {
		
		
		this.a=a;
		this.b=b;
	}
	
	
	
}

 class demo2 extends demo
{

	public demo2(int a, int b) {
		super(99, 999);
		// TODO Auto-generated constructor stub
		
		this.a=a;
		this.b=b;
	}
	
	
}

//copy the one array elements into another

public class example {

	public static void main(String... sri) {
		// TODO Auto-generated method stub
	 
		demo2 d=new demo2(100,200);
		System.out.println(d.a);
		System.out.println(d.b);
		
	
		
				//System.out.println("the number of object creat   "+demo.a);
		
	}
}