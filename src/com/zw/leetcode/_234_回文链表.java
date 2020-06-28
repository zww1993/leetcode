package com.zw.leetcode;

import java.util.Stack;

/**
 * 234. 回文链表
 *
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _234_回文链表 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public boolean isPalindrome(ListNode head) {
        int l = 0;
        ListNode p = head;
        while (p != null) {
            l++;
            p = p.next;
        }

        p = head;
        l = l/2;
        while (l > 0) {
            p = p.next;
            l--;
        }

        ListNode np = null;
        while (p != null) {
            ListNode tmp = p;
            p = p.next;
            tmp.next = np;
            np = tmp;
        }

        while (np != null && head != null) {
            if (np.val != head.val) return false;
            np = np.next;
            head = head.next;
        }
        return true;
    }

}
