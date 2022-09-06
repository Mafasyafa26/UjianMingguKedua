package UjianKedua;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import DataGenerate.DataGenerate;

import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestStringNumeric {
	
	StringNumeric sN = new StringNumeric();
	DataGenerate dg = new DataGenerate();
	Random rdm = new Random();
	
//	@BeforeTest
//	   public void beforeTest() {
//	      System.out.println("== BEFORE TEST DIMULAI ==");
//	   }
	
	@BeforeClass
	   public void beforeClass() {
		  System.out.println("================================");
	      System.out.println("== BEFORE CLASS STRINGNUMERIC ==");
		  System.out.println("================================");
	   }
	
//	@BeforeMethod
//	public void beforeMethod() {
//		System.out.println("== BEFORE METHOD ==");
//	}
	
	@Test
	public void testParseOne() {
		String strInput = dg.stringRdm();
		AssertJUnit.assertEquals(sN.testParseToIntActual(strInput), sN.testParseToIntExpect(strInput));
	}
//	ketika input bernilai bilangan bulat maka akan menghasilkan output true karena merupakan tipe data integer
//	namun jika input string akan menghasilkan false karena string di convert ke int
//	jika input char akan menghasilkan false karena char mengandung karakter sedangkan output yang diminta adalah int
//	input double akan menghasilkan false karena harusnya bernilai output integer
	
	
//	@AfterMethod
//	   public void afterMethod() {
//	      System.out.println("== AFTER METHOD ==");
//	   }
	
	@AfterClass
	   public void afterClass() {
		  System.out.println("===============================");
	      System.out.println("== AFTER CLASS STRINGNUMERIC ==");
		  System.out.println("===============================");
	   }
	
//	@AfterTest
//	   public void afterTest() {
//	      System.out.println("== AFTER TEST ==");
//	   }
}
