import java.util.LinkedList;
import java.util.Queue;
import tree.TreeNode2;

class maxDepth {

    public static int getMaxDepth(TreeNode2 root){
        Queue<TreeNode2> queue = new LinkedList<>();
        queue.offer(root);
        int count = 0;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-- > 0){
                TreeNode2 node = queue.poll();
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args){

        TreeNode2 node15 = new TreeNode2(15);
        TreeNode2 node7 = new TreeNode2(7);
        TreeNode2 node20 = new TreeNode2(20, node15, node7);
        TreeNode2 node9 = new TreeNode2(9);
        TreeNode2 node3 = new TreeNode2(3, node9, node20);

        System.out.println(getMaxDepth(node3));
    }
    
}
