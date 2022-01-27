package constructors;

public class ParameterizedConstructors {
	int x,y;
	ParameterizedConstructors(int a, int b)
	{
		x=a; y=b;
	}
	
void show()
{
	System.out.println(x+" "+y);

}
	public static void main(String[] args) {
		ParameterizedConstructors ref=new ParameterizedConstructors(100,200);
		ref.show();
	}

}
