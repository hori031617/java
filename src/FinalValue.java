/**
 * 2011.
 * There is a programming language with only four operations and one variable X:
 * 
 * ・ ++X and X++ increments the value of the variable X by 1.
 * ・ --X and X-- decrements the value of the variable X by 1.
 * Initially, the value of X is 0.
 * 
 * Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
 * 
 * Example 1:
 * Input: operations = ["--X","X++","X++"]
 * Output: 1
 * Explanation: The operations are performed as follows:
 * Initially, X = 0.
 * --X: X is decremented by 1, X =  0 - 1 = -1.
 * X++: X is incremented by 1, X = -1 + 1 =  0.
 * X++: X is incremented by 1, X =  0 + 1 =  1.
 */
class FinalValue {

    public static int finalValueAfterOperations(String[] operations) {
        String plus = "++";
        String muinus = "--";
        int result = 0;

        for(String operation : operations){
            if(operation.indexOf(plus) != -1){
                result += 1;
            }else if(operation.indexOf(muinus) != -1){
                result -= 1;
            }
        }

        return result;
    }

    public static int finalValueAfterOperationsReference(String[] operations) {
    	int val = 0;
    	for(int i=0;i<operations.length;i++) {
    		if(operations[i].charAt(1)=='+') val++;
    		else val--;
    	}
    	return val;        
    }


    public static void main(String[] args){
        String[] operations = {"++X","++X","X++"};
        int result = finalValueAfterOperations(operations);
        System.out.println(result);
    }
    
}
