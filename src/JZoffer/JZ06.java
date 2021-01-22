//链表反转 使用ArrayList链表类
package JZoffer;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class JZ06 {
    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        int len = list.size();
        int[] nums = new int[len];
        for(int i = 0; i < len; i++)
            nums[i] = list.get(len - i - 1);
        return nums;
    }
}
