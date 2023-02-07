package fibonacci;

import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;


public class TestFibonacci {

    @Test
    public void TestFibonacci(){
        Assertions.assertEquals(Fibonacci.fibonacci(10), 55);
    }

}
