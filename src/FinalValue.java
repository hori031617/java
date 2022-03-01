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
