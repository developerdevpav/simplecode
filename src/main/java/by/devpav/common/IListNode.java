package by.devpav.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public interface IListNode {

    int getVal();

    void setVal(final int number);

    IListNode getNext();

    default int[] toArray() {
        final Stack<IListNode> listNodes = new Stack<>();
        listNodes.push(this);

        final List<Integer> integers = new ArrayList<>();

        do {
            final IListNode listNode = listNodes.pop();

            integers.add(listNode.getVal());

            if (listNode.getNext() != null) {
                listNodes.push(listNode.getNext());
            }
        } while (!listNodes.empty());

        return integers.stream().mapToInt(it -> it).toArray();
    }

}
