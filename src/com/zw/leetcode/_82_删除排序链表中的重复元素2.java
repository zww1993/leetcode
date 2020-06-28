package com.zw.leetcode;

/**
 * 82. 删除排序链表中的重复元素 II
 *
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 *
 * 示例 1:
 *
 * 输入: 1->2->3->3->4->4->5
 * 输出: 1->2->5
 * 示例 2:
 *
 * 输入: 1->1->1->2->3
 * 输出: 2->3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _82_删除排序链表中的重复元素2 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    //创建新链表
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode res = new ListNode(0);
        ListNode cur = res;
        ListNode p = null;
        ListNode c = head;
        ListNode n = head.next;

        while (c != null) {
            if (p == null) {
                if (c.val == n.val) {
                    p = c;
                    c = n;
                    n = n.next;
                    continue;
                }
            }else if (n == null) {
                if (p.val == c.val) break;
            }else {
                if (c.val == n.val || p.val == c.val) {
                    p = c;
                    c = n;
                    n = n.next;
                    continue;
                }
            }
            cur.next = new ListNode(c.val);
            cur = cur.next;
            p = c;
            c = n;
            if (n != null) {
                n = n.next;
            }
        }

        return res.next;
    }

    //不创建新链表
    public ListNode deleteDuplicates1(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode res = new ListNode(0);
        ListNode cur = res;
        ListNode p = null;
        ListNode c = head;
        ListNode n = head.next;

        while (c != null) {
            if (p == null) {
                if (c.val == n.val) {
                    p = c;
                    c = n;
                    n = n.next;
                    continue;
                }
            }else if (n == null) {
                if (p.val == c.val) break;
            }else {
                if (c.val == n.val || p.val == c.val) {
                    p = c;
                    c = n;
                    n = n.next;
                    continue;
                }
            }
            cur.next = c;
            cur = cur.next;
            p = c;
            c = n;
            if (n != null) {
                n = n.next;
            }
            p.next = null;
        }

        return res.next;
    }

}
