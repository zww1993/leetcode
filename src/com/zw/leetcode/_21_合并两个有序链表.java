package com.zw.leetcode;

/**
 * 21.合并两个有序链表
 *
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 *  
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class _21_合并两个有序链表 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode c = res;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                c.next = l2;
                c = c.next;
                l2 = l2.next;
                continue;
            }
            if (l2 == null) {
                c.next = l1;
                c = c.next;
                l1 = l1.next;
                continue;
            }

            if (l1.val > l2.val) {
                c.next = l2;
                c = c.next;
                l2 = l2.next;
                continue;
            }

            c.next = l1;
            c = c.next;
            l1 = l1.next;
        }
        return res.next;
    }
}

