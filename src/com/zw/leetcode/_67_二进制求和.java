package com.zw.leetcode;

/**
 * 67.二进制求和
 *
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *  
 *
 * 提示：
 *
 * 每个字符串仅由字符 '0' 或 '1' 组成。
 * 1 <= a.length, b.length <= 10^4
 * 字符串如果不是 "0" ，就都不含前导零。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-binary
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _67_二进制求和 {

    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int x = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0 || x != 0) {
            char c1 = '0';
            char c2 = '0';
            if (i >= 0) {
                c1 = a.charAt(i);
            }
            if (j >= 0) {
                c2 = b.charAt(j);
            }

            int n1 = c1 - '0';
            int n2 = c2 - '0';
            switch (n1 + n2 + x) {
                case 0: {
                    sb.insert(0, '0');
                    x = 0;
                    break;
                }
                case 1: {
                    sb.insert(0, '1');
                    x = 0;
                    break;
                }
                case 2: {
                    sb.insert(0, '0');
                    x = 1;
                    break;
                }
                case 3: {
                    sb.insert(0, '1');
                    x = 1;
                    break;
                }
            }
            i--;
            j--;
        }
        return sb.toString();
    }

}
