package com.tenpines.tddcourse;

public class LatinNumberToRomanTransformer {
	
	public String transform(int latinNumber){
		
		int decena = latinNumber / 10;
		int units = latinNumber % 10;
		String asOne = "I";
		String asFive = "V";
		String asTen = "X";
		
		
		 //davidgk@davidgk.com.ar
		String result = "";
		//result = convertDigitUsing(units,result, "X", "L", "C");
		result += convertDigitUsing(latinNumber-(decena *10), asOne, asFive, asTen);
		
		if(latinNumber > 9 && latinNumber < 20) {
			result = "X";
			result += convertDigitUsing(latinNumber-(decena*10), asOne, asFive, asTen);
		}
		
		if(latinNumber > 19 && latinNumber < 30) {
			result = "XX";
			result += convertDigitUsing(latinNumber-(decena*10), asOne, asFive, asTen);
		}
		
		if(latinNumber > 29 && latinNumber < 40) {
			result = "XXX";
			result += convertDigitUsing(latinNumber-(decena*10), asOne, asFive, asTen);
		}
		
		if(latinNumber > 39 && latinNumber < 50) {
			result = "XL";
			result += convertDigitUsing(latinNumber-(decena*10), asOne, asFive, asTen);
		}
		
		if(latinNumber > 39 && latinNumber < 50) {
			result = "XL";
			result += convertDigitUsing(latinNumber-(decena*10), asOne, asFive, asTen);
		}
		
		if(latinNumber > 49 && latinNumber < 90) {
			result = "L";
			result += addCharAsNeeded(decena-5, "X");
			result += convertDigitUsing(latinNumber-(decena*10), asOne, asFive, asTen);
		}
		
		return result;
		
	}

	private String convertDigitUsing(int latinNumber, String asOne, String asFive, String asTen) {
		String result = "";
		if (latinNumber <= 3){
			result += addCharAsNeeded(latinNumber,"I");
		}		 
		if(latinNumber == 4) {
			result = result + asOne + asFive;
		}
		
		if(latinNumber > 4 && latinNumber < 9) {
			result = result + asFive;
			result += addCharAsNeeded(latinNumber-5,"I");
		}
		if(latinNumber == 9) {
			result = result + asOne + asTen;
		}
		return result;
	}
	
	private String addCharAsNeeded(int latinNumber, String c){
		String result = "";
		for(int init= 0; init<latinNumber;init++){
			result = result + c;
		}
		return result;
	}

}
