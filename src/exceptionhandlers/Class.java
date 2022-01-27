package exceptionhandlers;


		class Class{
			   public static void main(String args[]){
				try{
					System.out.println("Starting of try block");
					// I'm throwing the custom exception using throw
					throw new MyExceptionHan("This is My error Message");
				}
				catch(MyExceptionHan exp){
					System.out.println("Catch Block") ;
					System.out.println(exp) ;
				}
			   }
			

	}


