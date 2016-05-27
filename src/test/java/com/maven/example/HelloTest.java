package com.maven.example;

import com.maven.example.Hello;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class HelloTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HelloTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( HelloTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testHello()
    {
    	Hello hello = new Hello();
    	String result = hello.sayHello();
        assertEquals( "hello maven",result );
    }
}
