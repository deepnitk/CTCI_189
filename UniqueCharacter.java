package CTCI_189;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str = "sonu";
        boolean isUnique = checkUnique(str);
        if (isUnique){
            System.out.println("It's a unique string");
        }
        else {
            System.out.println("It is not unique");
        }
    }

    // Hint 1
    // use of extra DS -- Try a hash Table
    // TC: O(N) SC: O(N)
//    private static boolean checkUnique(String str) {
//        if (str.length() > 128)
//            return false;
//
//        boolean[] chars = new boolean[128];
//        Arrays.fill(chars, false);
//
//        for(int i = 0; i < str.length(); i++) {
//            int index = (int)str.charAt(i);
//            System.out.println("index:"+index);
//            if (chars[index] == true)
//                return false;
//            chars[index] = true;
//        }
//        return true;
//    }

    // Hint 2
    // use of extra DS -- Try bit vector
    // TC: O(N) SC: O(N)
//    private static boolean checkUnique(String str) {
//        int checker = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            int bitAtIndex = str.charAt(i) - 'a';
//
//            // if that bit is already set in checker,
//            // return false
//            if ((checker & (1 << bitAtIndex)) > 0)
//                return false;
//
//            // otherwise update and continue by
//            // setting that bit in the checker
//            checker = checker | (1 << bitAtIndex);
//        }
//
//        // no duplicates encountered, return true
//        return true;
//    }

    // Hint 2
    // Try to sort the array and check subsequent elements
    // TC: O(NlogN) SC: O(1)
//    private static boolean checkUnique(String str) {
//        char[] charArray = str.toCharArray();
//        Arrays.sort(charArray);
//        for (int i = 0; i < charArray.length - 1; i++) {
//            if (charArray[i] != charArray[i + 1]) {
//                continue;
//            }
//            else {
//                return false;
//            }
//        }
//        return true;
//    }

    // TC: O(N) SC: O(N) -- HashSet solution
//    private static boolean checkUnique(String str) {
//        HashSet<Character> hashSet = new HashSet<>();
//        for(int i = 0; i < str.length();i++) {
//            if ( hashSet.contains(str.charAt(i)) ) {
//                return false;
//            }
//            else {
//                hashSet.add(str.charAt(i));
//            }
//        }
//        return true;
//    }

    // TC: O(N2) SC: O(1) -- 2 loop solution
//    private static boolean checkUnique(String str) {
//
//        for(int i = 0; i < str.length() - 1;i++) {
//            for (int j = i + 1; j < str.length();j++){
//                if (str.charAt(i) == str.charAt(j)) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

}
