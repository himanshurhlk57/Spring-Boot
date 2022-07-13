package ExceptionHandling;

/*
Throwable ->  class
|
sub class
Exception, Error
Exception(can he handled), Error(can't be handled')
Exception -> checked, unchecked
checked ->  IOException, SQLException
unchecked -> RuntimeException -> ArrayOutOfIndexException, FIleNotFoundExcpetion

*/

// creating own exception

// Handling basic divide by zero exception

public class ExceptionHandling {

  public static int divide(int a, int b) throws ArithmeticException, MyException {
    if (b == 0) {
      // throw new ArithmeticException("Please do not divide by zero");
      throw new MyException("My Exception");
    }
    return a / b;
  }

  public static void main(String[] args) {
    int a = 5;
    int b = 0;
    try {
      int ans = divide(a, b);
      System.out.println(ans);
    } catch (ArithmeticException | MyException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("This block will always execute");
    }
  }
}

// custom exception

public class MyException1 extends Exception {
  public MyException1(String message) {
    super(message);
  }
}

class ExceptionHandling1 {

  public static int divide(int a, int b) throws MyException {
    if (b == 0) {
      // throw new ArithmeticException("Please do not divide by zero");
      throw new MyException("My Exception");
    }
    return a / b;
  }

  public static void main(String[] args) {
    int a = 5;
    int b = 0;
    try {
      int ans = divide(a, b);
      System.out.println(ans);
    } catch (MyException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("This block will always execute");
    }
  }
}
