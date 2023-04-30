package by.devpav.common;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
public class ListNode implements IListNode {

    private int val;

    private ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode bind(final int[] integers) {
        List<ListNode> collect = Arrays.stream(integers)
                .boxed()
                .map(ListNode::new)
                .toList();

        for (int i = 0; i < collect.size() - 1; i++) {
            ListNode list = collect.get(i);
            list.next = collect.get(i + 1);
        }

        return collect.get(0);
    }
}