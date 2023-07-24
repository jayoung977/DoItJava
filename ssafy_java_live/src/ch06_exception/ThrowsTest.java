package ch06_exception;

public class ThrowsTest {
    // TODO: 1. methodCall2()에서 uncheckedExceptionMethod()를 호출할 때 발생하는 예외를
    // throws로 처리하세요.
    // TODO: 2. methodCall2()에서 checkedExceptionMethod()를 호출할 때 발생하는 예외를
    // throws로 처리하세요.
	// throws 위임된 곳 3 = JVM
     public static void main(String[] args) {
    	 try {
        methodCall1();
        } catch (ClassNotFoundException e){
    		 e.printStackTrace();
    	 }catch (ArithmeticException e){
    		 e.printStackTrace();
    	 }
    	 
        System.out.println("done");
    }

     private static void methodCall1()throws ClassNotFoundException{
        methodCall2(); // throws 위임된 곳 2
    }

     private static void methodCall2()throws ClassNotFoundException{
        uncheckedExceptionMethod(); //명시적 throws 불필요하지만 그래도 try-catch는 반드시 한번은 필요
//        checkedExceptionMethod(); // throws 위임된 곳 1 , try-catch는 반드시 한번은 필요
    }

    @SuppressWarnings("unused")
     private static void checkedExceptionMethod()throws ClassNotFoundException{
        Class.forName("Hello");
    }

    @SuppressWarnings("unused")
    private static void uncheckedExceptionMethod() {
        int i = 1 / 0;
    }

}
