package com.glearning.build;


import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

 @Test
 public void testSum(){
     HelloWorld helloWorld = new HelloWorld();
     int result = helloWorld.sum(99, 56);
     Assert.assertEquals(101, result);
 }

}
