
package linkedList;
//Definition for singly-linked list.
  class ListNode {
        int val;
         ListNode next;
        ListNode(int x) { val = x; }
     }

class Solution {
    public void deleteNode(ListNode node) {
        //if head is 
        ListNode curr= node;
        ListNode next = node.next;
        
        //iterrate over all, not good
        // while(next.next!=null){
        //     curr.val=next.val;
        //     curr = next;
        //     next = next.next;
        // }
        // curr.val = next.val;
        // curr.next = null;
        
        //just cody and delete
        curr.val = next.val;
            curr.next = next.next;
        
    }
}
// 4->5->1->9
//delNode = 5
//curr = 1
//next= 9
//4->1->9