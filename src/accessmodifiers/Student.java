package accessmodifiers;

 class Student extends Protecttt {
	 private int graduationyear=2021;
	 
	public static void main(String[] args) {
		Student obj=new Student();
		System.out.println("Name: " + obj.fname);
		System.out.println("age: " + obj.age);
		System.out.println("graduationyear: " + obj.graduationyear);
		
	}

}
