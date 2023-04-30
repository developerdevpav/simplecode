package by.devpav.add_to_numbers;

import by.devpav.common.ListNode;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        final int[] arr1 = reverseListNode(l1);
        final int[] arr2 = reverseListNode(l2);

        final int[] result = arr2.length >= arr1.length
                ? sum(arr1, arr2)
                : sum(arr2, arr1);

        return convertToReverseListNode(reverse(result));
    }

    private int[] sum(int[] minArr, int[] maxArr) {
        int[] result = new int[maxArr.length];

        int indexMinArr = minArr.length - 1;
        int indexMaxArr = maxArr.length - 1;

        int remains = 0;

        do {
            int numMaxArray = maxArr[indexMaxArr];
            int numMinArray = minArr[indexMinArr];

            int sum = numMaxArray + numMinArray;

            sum = sum + remains;

            if (sum > 9) {
                remains = 1;
                sum = sum - 10;
            } else {
                remains = 0;
            }

            result[indexMaxArr] = sum;

            indexMaxArr--;
            indexMinArr--;
        } while (indexMinArr >= 0);

        if (remains > 0) {
            if (indexMaxArr < 0) {
                maxArr = arrayExtend(maxArr);
                result = arrayExtend(result);
                indexMaxArr = 0;
            }

            while (indexMaxArr >= 0) {
                int sum = maxArr[indexMaxArr] + remains;

                if (sum > 9) {
                    remains = 1;
                    sum = sum - 10;
                } else {
                    remains = 0;
                }

                if (remains > 0 && indexMaxArr == 0) {
                    maxArr = arrayExtend(maxArr);
                    maxArr[indexMaxArr] = remains;
                    result = arrayExtend(result);
                    result[indexMaxArr] = remains;
                } else {
                    result[indexMaxArr] = sum;
                }

                indexMaxArr--;
            }
        } else {
            while (indexMaxArr >= 0) {
                result[indexMaxArr] = maxArr[indexMaxArr];
                indexMaxArr--;
            }
        }

        return result;
    }

    private int[] arrayExtend(int[] maxArr) {
        int[] tmp = new int[maxArr.length + 1];

        for (int i = 0; i < maxArr.length; i++) {
            tmp[i + 1] = maxArr[i];
        }

        return tmp;
    }

    private int[] reverseListNode(ListNode node) {
        int length = length(node);

        int[] numbers = new int[length];

        int index = 0;

        ListNode itemNode = node;
        do {
            numbers[index++] = itemNode.getVal();
            itemNode = itemNode.getNext();
        } while (itemNode != null);

        return reverse(numbers);
    }

    private int length(final ListNode listNode) {
        int count = 0;

        ListNode itemNode = listNode;

        do {
            count++;
            itemNode = itemNode.getNext();
        } while (itemNode != null);

        return count;
    }

    private ListNode convertToReverseListNode(final int[] numbers) {
        final ListNode[] listNodes = new ListNode[numbers.length];

        for (int i = numbers.length - 1; i >= 0; i--) {
            listNodes[i] = new ListNode(numbers[i]);
        }

        for (int i = 0; i < listNodes.length - 1; i++) {
            listNodes[i].setNext(listNodes[i + 1]);
        }

        return listNodes[0];
    }

    private int[] reverse(int[] arr) {
        final int[] tmp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[(arr.length - 1) - i];
        }

        return tmp;
    }
}
