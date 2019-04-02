package com.pidal.mavenTDD;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	AppTestTwo.class,
	AppTest2.class, 
	ParameterizedTests.class
})
public class AppTest {

}
