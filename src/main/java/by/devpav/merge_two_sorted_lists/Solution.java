package by.devpav.merge_two_sorted_lists;

import by.devpav.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }

        final int[] integers = new int[200];

        enrich(list1, integers);
        enrich(list2, integers);

        return toNode(integers);
    }

    public ListNode toNode(int[] integers) {
        final List<ListNode> integerList = new ArrayList<>();

        for (int i = integers.length - 1; i > 100; i--)
            if (integers[i] > 0)
                for (int j = 0; j < integers[i]; j++)
                    integerList.add(new ListNode(((i - 100) * -1)));

        for (int i = 0; i <= 100; i++)
            if (integers[i] > 0)
                for (int j = 0; j < integers[i]; j++)
                    integerList.add(new ListNode(i));

        if (integerList.isEmpty()) {
            return null;
        }

        for (int i = 0; i < integerList.size() - 1; i++) {
            final ListNode listNode = integerList.get(i);
            listNode.setNext(integerList.get(i + 1));
        }

        return integerList.get(0);
    }

    public void enrich(final ListNode node, final int[] integers) {
        ListNode item = node;

        if (item == null) {
            return;
        }

        do {
            if (item.getVal() >= 0) {
                integers[item.getVal()]++;
            } else {
                integers[(item.getVal() * -1) + 100]++;
            }
            item = item.getNext();
        } while (item != null);
    }
}
