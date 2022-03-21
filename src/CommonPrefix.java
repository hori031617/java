/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */
class CommonPrefix{

    public static String longestCommonPrefix(String[] strs) {
        
        if(strs == null || strs.length == 0){
            return "";
        }

        // String result = "";
        // for(int i=1; i<strs.length; i++){
        //     while(strs[0].length()!=0 && strs[i].length()!=0){
        //         if(strs[0].charAt(0) == strs[i].charAt(0)){
        //             result += strs[0].charAt(0);
        //             strs[0] = strs[0].substring(1);
        //             strs[i] = strs[i].substring(1);
        //         }else{
        //             break;
        //         }
        //     }
        // }

        String result = strs[0];
        for(int i=1; i<strs.length; i++){

            while(!strs[i].startsWith(result)){
                System.out.println("Before: " + result);
                result = result.substring(0, result.length()-1);
                System.out.println("After: " + result);
            }

        }

        return result;
    }


    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

}