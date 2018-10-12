
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		if(romanNum == "I") return 1;
		int result = 0;
		int r = 0;
		
		if(!checkIfNoIXCM3TimesInARow(romanNum)) return 0;
		else if(!checkIfNoVLDRepetitions(romanNum)) return 0;
		else if(!checkIfSubsLegal(romanNum)) return 0;
		
		for (int i = 0; i < romanNum.length(); i++){
	        r++;
			if(romanNum.charAt(i) == 'I'){
	        	if(r < romanNum.length() && subCheck(romanNum, i)) result -= 1;
	        	else result += 1;
	        }
	        else if(romanNum.charAt(i) == 'V'){
	        	result += 5;
	        }
	        else if(romanNum.charAt(i) == 'X'){
	        	if(r < romanNum.length() && subCheck(romanNum, i)) result -= 10;
	        	else result += 10;
	        }
	        else if(romanNum.charAt(i) == 'L'){
	        	result += 50;
	        }
	        else if(romanNum.charAt(i) == 'C'){
	        	if(r < romanNum.length() && subCheck(romanNum, i)) result -= 100;
	        	else result += 100;
	        }
	        else if(romanNum.charAt(i) == 'D'){
	        	result += 500;
	        }
	        else if(romanNum.charAt(i) == 'M'){
	        	result += 1000;
	        }
	        else{
	        	return 0;
	        }
	    }
		return result;	
	}
	
	private boolean checkIfNoIXCM3TimesInARow(String str){
		if(str.contains("IIII") || str.contains("XXXX") || str.contains("CCCC") || str.contains("MMMM")) return false;
		return true;
	}
	
	private boolean checkIfNoVLDRepetitions(String str){
		if(str.contains("VV") || str.contains("LL") || str.contains("DD")) return false;
		return true;
	}
	
	private boolean subCheck(String str, int it){ //returns true if have to subtract
		char chr = str.charAt(it);
		if(chr == 'I'){
			if(str.charAt(it+1) == 'V' || str.charAt(it+1) == 'X') return true;
		}
		if(chr == 'X'){
			if(str.charAt(it+1) == 'L' || str.charAt(it+1) == 'C') return true;
		}
		if(chr == 'C'){
			if(str.charAt(it+1) == 'D' || str.charAt(it+1) == 'M') return true;
		}
		return false;
	}
	
	private boolean checkIfSubsLegal(String str){ //return true if subtractions in string are legal
		if(str.contains("IIV") || str.contains("IIX") || str.contains("XXL") || str.contains("XXC") || str.contains("CCD") || str.contains("CCM")) return false;
		return true;
	}
}
