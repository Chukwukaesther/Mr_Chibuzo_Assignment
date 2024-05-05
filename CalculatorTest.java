public class CalculatorTest { 

	public void testThatCalculatorCanAddTwoPositiveNumbers();
	     int sum = Calculator.add(2,2);
	     int expectedSum = 4;   
	     //assertion

	     iF(sum != expected){
		System.err.printf("Test failing\nExpected: %d\n Actual: expectedSum,sum");
              }else{
		        System.out.println("Test passed,yay :)");


	}


}

public static void main (String... args){
	       calcaulatorTestCalculatorTest = new calculatorTest();

             calculatorTest.testThatCalculatorCanAddTwoPositiveNumbers();
 
  }
}