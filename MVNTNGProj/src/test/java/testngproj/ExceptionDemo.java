package testngproj;

public class ExceptionDemo {

	public static void main(String[] args) throws Exception {

		int a=5;
		
		if(a<18) {
			throw new Exception("The person age is less the 18 !");// manually throw exception according to our condition.
		}

	}

}
