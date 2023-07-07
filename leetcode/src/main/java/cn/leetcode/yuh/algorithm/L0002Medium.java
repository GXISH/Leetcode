package cn.leetcode.yuh.algorithm;

public class L0002Medium {
    public static void main(String[] args) {
        L0002Medium l0002Medium = new L0002Medium();

        ListNode listNode1 = new ListNode(6);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(3);
        listNode1.next.next.next = new ListNode(3);

        ListNode listNode2 = new ListNode(9);
        listNode2.next = new ListNode(9);
        listNode2.next.next = new ListNode(9);
        listNode2.next.next.next = new ListNode(9);

        ListNode listNode = l0002Medium.addTwoNumbers(listNode1, listNode2);
        System.out.println(listNode);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //作为头节点
        ListNode dummyHead = new ListNode();
        //作为替换节点
        ListNode retuenNode = dummyHead;
        //作为每回合向下一位进的数
        int progeny = 0;
        while (true) {
            //本回合节点之和 + 上回合的节点余数
            int sum = progeny;
            //没有余位的时候就结束循环
            if (l1 == null && l2 == null) {
                break;
            }
            if (l1 != null) {
                //若节点不为空 则将值加于总和 并且该节点"作废" 直接切换到下一个节点
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                //若节点不为空 则将值加于总和 并且该节点"作废" 直接切换到下一个节点
                sum += l2.val;
                l2 = l2.next;
            }
            //计算是否有进数
            progeny = sum / 10;
            //将值赋予新链表的对应节点
            retuenNode.next = new ListNode(sum % 10);
            retuenNode = retuenNode.next;
        }
        if (progeny > 0) {
            retuenNode.next = new ListNode(progeny);
        }
        return dummyHead.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "val=" + val +
                    " —> nextVal=" + next;
        }


    }
}
