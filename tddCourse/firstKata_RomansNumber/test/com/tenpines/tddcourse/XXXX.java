package com.tenpines.tddcourse;



import org.junit.Assert;
import org.junit.Test;

public class XXXX {
	
	
	@Test
	public void test001(){
		//given
			LatinNumberToRomanTransformer sut = new LatinNumberToRomanTransformer();
		//when
			String expected = sut.transform(1);
		//then
			Assert.assertTrue("I".equals(expected));
	}
	
	@Test
	public void test002(){
		//given
			LatinNumberToRomanTransformer sut = new LatinNumberToRomanTransformer();
		//when
			String expected = sut.transform(2);
		//then
			Assert.assertTrue("II".equals(expected));
	}
	
	@Test
	public void test003(){
		//given
			LatinNumberToRomanTransformer sut = new LatinNumberToRomanTransformer();
		//when
			String expected = sut.transform(3);
		//then
			Assert.assertTrue("III".equals(expected));
	}
	
	@Test
	public void test004(){
		//given
			LatinNumberToRomanTransformer sut = new LatinNumberToRomanTransformer();
		//when
			String expected = sut.transform(4);
		//then
			Assert.assertTrue("IV".equals(expected));
	}
	
	@Test
	public void test005(){
		//given
			LatinNumberToRomanTransformer sut = new LatinNumberToRomanTransformer();
		//when
			String expected = sut.transform(5);
		//then
			Assert.assertTrue("V".equals(expected));
	}
	
	@Test
	public void test006(){
		//given
			LatinNumberToRomanTransformer sut = new LatinNumberToRomanTransformer();
		//when
			String expected = sut.transform(6);
		//then
			Assert.assertTrue("VI".equals(expected));
	}
	
	@Test
	public void test007(){
		//given
			LatinNumberToRomanTransformer sut = new LatinNumberToRomanTransformer();
		//when
			String expected = sut.transform(7);
		//then
			Assert.assertTrue("VII".equals(expected));
	}
	
	@Test
	public void test008(){
		//given
			LatinNumberToRomanTransformer sut = new LatinNumberToRomanTransformer();
		//when
			String expected = sut.transform(8);
		//then
			Assert.assertTrue("VIII".equals(expected));
	}
	
	@Test
	public void test009(){
		//given
			LatinNumberToRomanTransformer sut = new LatinNumberToRomanTransformer();
		//when
			String expected = sut.transform(9);
		//then
			Assert.assertTrue("IX".equals(expected));
	}
	
	@Test
	public void test010(){
		//given
			LatinNumberToRomanTransformer sut = new LatinNumberToRomanTransformer();
		//when
			String expected = sut.transform(10);
		//then
			Assert.assertTrue("X".equals(expected));
	}

	@Test
	public void test011(){
		//given
			LatinNumberToRomanTransformer sut = new LatinNumberToRomanTransformer();
		//when
			String expected = sut.transform(11);
		//then
			Assert.assertTrue("XI".equals(expected));
	}
	
	@Test
	public void test012(){
		//given
			LatinNumberToRomanTransformer sut = new LatinNumberToRomanTransformer();
		//when
			String expected = sut.transform(12);
		//then
			Assert.assertTrue("XII".equals(expected));
	}
	
	@Test
	public void test013(){
		//given
			LatinNumberToRomanTransformer sut = new LatinNumberToRomanTransformer();
		//when
			String expected = sut.transform(13);
		//then
			Assert.assertTrue("XIII".equals(expected));
	}

	@Test
	public void test014(){
		//given
			LatinNumberToRomanTransformer sut = new LatinNumberToRomanTransformer();
		//when
			String expected = sut.transform(14);
		//then
			Assert.assertTrue("XIV".equals(expected));
	}

	
	@Test
	public void test015_15A18(){
		//given
			LatinNumberToRomanTransformer sut = new LatinNumberToRomanTransformer();
		//when
			String expected = sut.transform(15);
		//then
			Assert.assertTrue("XV".equals(expected));
		//when
			expected = sut.transform(16);
		//then
			Assert.assertTrue("XVI".equals(expected));
		//when
			expected = sut.transform(17);
		//then
			Assert.assertTrue("XVII".equals(expected));
		//when
			expected = sut.transform(18);
		//then
			Assert.assertTrue("XVIII".equals(expected));
	}
	
	@Test
	public void test019(){
		//given
			LatinNumberToRomanTransformer sut = new LatinNumberToRomanTransformer();
		//when
			String expected = sut.transform(19);
		//then
			Assert.assertTrue("XIX".equals(expected));
	}
	
	@Test
	public void test020_20a29(){
		Assert.assertTrue("XX".equals(doTest(20)));
		/*
		 * 	String initial ="XX";
		Assert.assertTrue((initial).equals(doTest(30)));
		Assert.assertTrue((initial+"I").equals(doTest(31)));
		Assert.assertTrue((initial+"II").equals(doTest(32)));
		Assert.assertTrue((initial+"III").equals(doTest(33)));
		Assert.assertTrue((initial+"IV").equals(doTest(34)));
		Assert.assertTrue((initial+"V").equals(doTest(35)));
		Assert.assertTrue((initial+"VI").equals(doTest(36)));
		Assert.assertTrue((initial+"VII").equals(doTest(37)));
		Assert.assertTrue((initial+"VIII").equals(doTest(38)));
		Assert.assertTrue((initial+"IX").equals(doTest(39)));
	
		 * */
	}
	@Test
	public void test030_30a39(){
		String initial ="XXX";
		Assert.assertTrue((initial).equals(doTest(30)));
		Assert.assertTrue((initial+"I").equals(doTest(31)));
		Assert.assertTrue((initial+"II").equals(doTest(32)));
		Assert.assertTrue((initial+"III").equals(doTest(33)));
		Assert.assertTrue((initial+"IV").equals(doTest(34)));
		Assert.assertTrue((initial+"V").equals(doTest(35)));
		Assert.assertTrue((initial+"VI").equals(doTest(36)));
		Assert.assertTrue((initial+"VII").equals(doTest(37)));
		Assert.assertTrue((initial+"VIII").equals(doTest(38)));
		Assert.assertTrue((initial+"IX").equals(doTest(39)));
	
	}
	
	@Test
	public void test040_40a49(){
		String initial ="XL";
		Assert.assertTrue((initial).equals(doTest(40)));
		Assert.assertTrue((initial+"I").equals(doTest(41)));
		Assert.assertTrue((initial+"II").equals(doTest(42)));
		Assert.assertTrue((initial+"III").equals(doTest(43)));
		Assert.assertTrue((initial+"IV").equals(doTest(44)));
		Assert.assertTrue((initial+"V").equals(doTest(45)));
		Assert.assertTrue((initial+"VI").equals(doTest(46)));
		Assert.assertTrue((initial+"VII").equals(doTest(47)));
		Assert.assertTrue((initial+"VIII").equals(doTest(48)));
		Assert.assertTrue((initial+"IX").equals(doTest(49)));
	
	}
	
	@Test
	public void test050_50a89(){
		String initial ="L";
		Assert.assertTrue((initial).equals(doTest(50)));
		Assert.assertTrue((initial+"I").equals(doTest(51)));
		Assert.assertTrue((initial+"XV").equals(doTest(65)));
		Assert.assertTrue((initial+"XVIII").equals(doTest(68)));
		Assert.assertTrue((initial+"XX").equals(doTest(70)));
		Assert.assertTrue((initial+"XXVII").equals(doTest(77)));
		Assert.assertTrue((initial+"XXX").equals(doTest(80)));
		Assert.assertTrue((initial+"XXXIX").equals(doTest(89)));
	}
	
	private String doTest(int valueToProcess){
		//given
		LatinNumberToRomanTransformer sut = new LatinNumberToRomanTransformer();
	//when
		return  sut.transform(valueToProcess);
	//then
		
	}
}
