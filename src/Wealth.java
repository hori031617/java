class Wealth {
    
    public static int maximumWealth(int[][] accounts){
        int result = 0;
        
        for(int[] i : accounts){
            int temp = 0;
            for(int j : i){
                temp += j;
            }
            // result = (result >= temp) ? result : temp;
            result = Math.max(result, temp);
        }

        return result;
    }

    public static void main(String[] args){
        int[][] accounts = {{1,2,3}, {3,2,1}};
        int result = maximumWealth(accounts);
        System.out.println(result);
    }
}
