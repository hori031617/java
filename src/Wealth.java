/**
 * 1672.
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank.
 * Return the wealth that the richest customer has.
 * 
 * A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
 * 
 * Example
 * Input: accounts = [[1,5],[7,3],[3,5]]
 * Output: 10
 * Explanation: 
 * 1st customer has wealth = 6
 * 2nd customer has wealth = 10 
 * 3rd customer has wealth = 8
 * The 2nd customer is the richest with a wealth of 10.
 */
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
