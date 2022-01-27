package constructors;

public class DefaultConstructors {
	int a; String name;
	 DefaultConstructors()
	 {
		 a=0; name=null;
	 }
	void show()
	{
		System.out.println(a+" "+name);
	}
	

	public static void main(String[] args) {
		 DefaultConstructors ref=new  DefaultConstructors();
		 ref.show();
		 
	}

}
