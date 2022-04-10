import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above.
 * 
 * Example
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */
class PascalTraiangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();

        for(int i=0; i<numRows; i++){
            row.add(0, 1);

            for(int j=1; j<row.size()-1; j++){
                row.set(j, row.get(j)+row.get(j+1));
            }

            // allrows.add(row);
            allrows.add(new ArrayList<Integer>(row));
        }
        

        return allrows;
    }


    public static void main(String[] args){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result = generate(5);

        for(List<Integer> row: result){

            for(int i=0; i<row.size(); i++){
                System.out.print(row.get(i) + ", ");
            }

            System.out.println();

        }
        
    }

}
