package arraySolutions;

import java.util.HashSet;
import java.util.Scanner;

public class containsDuplicate {

    public static boolean Duplicate(int[] nums){
        HashSet<Integer>set = new HashSet<>();
        for (int num:nums){
            if (!set.add(num)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,1};
        int[] arr1 = {1,2,3,4};

        System.out.println(Duplicate(arr));
        System.out.println(Duplicate(arr1));
    }
}
