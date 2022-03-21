import java.util.HashMap;
import java.util.Map;

/**
 * 13.
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * 
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII,
 * which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * Roman numerals are usually written largest to smallest from left to right. However,
 * the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four. The same principle applies to the number nine,
 * which is written as IX. There are six instances where subtraction is used:
 * 
 * I can be placed before V (5) and X (10) to make 4 and 9. 
 * X can be placed before L (50) and C (100) to make 40 and 90. 
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 * 
 * Example
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
class RomanNumber {
    public static int romanToInt(String s){
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int rNumber = 0;
        int curNumber = 0;
        int preNumber = 0;

        while(s.length() != 0){
            curNumber = map.get(s.charAt(s.length()-1));
            if(preNumber > curNumber){
                rNumber -= curNumber;
            }else{
                rNumber += curNumber;
            }
            preNumber = curNumber;
            s = s.replaceFirst(".$","");
        }

        return rNumber;
    }

    public static int romanToInt2(String s){
        if (s == null || s.length() == 0){
            return -1;
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int len = s.length();
        int result = map.get(s.charAt(len - 1));

        for (int i = len - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))){
                result += map.get(s.charAt(i));
            }else{
                result -= map.get(s.charAt(i));
            }
        }
        return result;
    }


    public static void main(String[] args){
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt2("MCMXCIV"));
    }
}