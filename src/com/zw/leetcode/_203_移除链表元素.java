package com.zw.leetcode;

/**
 * 203. 移除链表元素
 *
 * 删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 *
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class _203_移除链表元素 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        if (head.next == null && head.val == val) return null;
        ListNode h = head;
        ListNode pre = null;
        while (h != null) {
            if (h.val == val) {
                if (pre != null) {
                    pre.next = h.next;
                    h = h.next;
                }else {
                    if (head == null) return null;
                    head = head.next;
                    h = h.next;
                }
            }else {
                pre = h;
                h = h.next;
            }
        }
        return head;
    }

}
