import com.lol.character.Hero;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        TreeSet<Integer> treeSet = new TreeSet<Integer>(c);

        int[] nums = {5, 1, 2, 9, 7, 10, 3, 8};
        for (int num : nums) {
            treeSet.add(num);
        }

        System.out.println(treeSet);
    }
}