package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.PomPro;


public class TestActitime3 extends BaseTest
{
	@Test
	public void login() throws IOException
	{
		PomPro l=new PomPro(driver);
		l.loginMethod();
	}
}
