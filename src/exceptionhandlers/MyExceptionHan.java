package exceptionhandlers;
		class MyExceptionHan extends Exception{
			   String str1;
			   MyExceptionHan(String str2) {
				str1=str2;
			   }
			   public String toString(){ 
				return ("MyException Occurred: "+str1) ;
			   }
			

	}


