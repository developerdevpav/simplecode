package by.devpav.remove_duplicates_from_sorted_list;

import by.devpav.common.ListNode;

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        var nodeItem = head;

        var tmp = new ListNode(head.getVal());
        var item = tmp;

        while(nodeItem != null) {
            if (nodeItem.getVal() > tmp.getVal()) {
                final var next = new ListNode(nodeItem.getVal());
                tmp.setNext(next);
                tmp = next;
            }

            nodeItem = nodeItem.getNext();
        }

        return item;
    }
}
