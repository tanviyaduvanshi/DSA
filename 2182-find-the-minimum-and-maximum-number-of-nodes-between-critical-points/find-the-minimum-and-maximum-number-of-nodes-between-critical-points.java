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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode curr=head.next;
        ListNode prev=head;
        int count=1;
        ArrayList<Integer>list=new ArrayList<>();
        //prev.next=head;
        while(curr!=null&&curr.next!=null){
            if((curr.val>prev.val&&curr.val>curr.next.val)||(curr.val<prev.val&&curr.val<curr.next.val)){
                list.add(count);
            }
            count++;
            prev=curr;
            curr=curr.next;
        }
        int arr[]=new int[2];
        Arrays.fill(arr,-1);
        Collections.sort(list);
        if(list.size()>1){
            arr[1]=list.get(list.size()-1)-list.get(0);
        arr[0]=Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            arr[0]=Math.min(arr[0],(list.get(i)-list.get(i-1)));
        }
        }
        
        return arr;
    }
}