/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public static int getCount(ListNode head){
        int count =0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = getCount(head);
      

        ListNode curr = head;
        int customCount =0;
         if (count == n) {
            return head.next;
        }

         
          while(curr !=null ){
             customCount++;
           if(customCount == count - n){
        curr.next = curr.next.next;
        break; 
    }
            else{
                curr = curr.next;
            }
          
          }

        return head;
      
    
        
    }
}