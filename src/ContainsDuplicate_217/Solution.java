package ContainsDuplicate_217;

import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<Integer>(nums.length);
        for (int i : nums) {
            if (numsSet.contains(i)) return true;
            numsSet.add(i);
        }
        return false;
    }
}


//Approach #3 (Hash Table) [Accepted]
//        Intuition
//
//        Utilize a dynamic data structure that supports fast search and insert operations.
//
//        Algorithm
//
//        From Approach #1 we know that search operations is O(n)O(n) in an unsorted array and we did so repeatedly.
//        Utilizing a data structure with faster search time will speed up the entire algorithm.
//
//        There are many data structures commonly used as dynamic sets such as Binary Search Tree and Hash Table.
//        The operations we need to support here are search() and insert(). For a self-balancing Binary Search Tree
//        (TreeSet or TreeMap in Java), search() and insert() are both O(\log n)O(logn) time. For a Hash Table
//        (HashSet or HashMap in Java), search() and insert() are both O(1)O(1) on average. Therefore,
//        by using hash table, we can achieve linear time complexity for finding the duplicate in an unsorted array.