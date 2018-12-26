package helloworld;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    private HelloWorld helloWorld = new HelloWorld();

    @Test
    public void testHelloWorld(){
        Assert.assertEquals(helloWorld.getMessage(), "hello world");
    }

}
