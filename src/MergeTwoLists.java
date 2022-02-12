import list.ListNode;

class MergeTwoLists {
    
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        ListNode result = new ListNode(0);
        ListNode temp = result;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1 != null){
            temp.next = list1;
        }
        if(list2 != null){
            temp.next = list2;
        }

        return result.next;
    }

    public static void main(String[] args){

        ListNode list1_4 = new ListNode(4);
        ListNode list1_2 = new ListNode(2, list1_4);
        ListNode list1_1 = new ListNode(1, list1_2);
        
        ListNode list2_4 = new ListNode(4);
        ListNode list2_3 = new ListNode(3, list2_4);
        ListNode list2_1 = new ListNode(1, list2_3);

        ListNode resultList = mergeTwoLists(list1_1, list2_1);

        while(resultList != null){
            System.out.println(resultList.val);
            resultList = resultList.next;
        }
    }
}
