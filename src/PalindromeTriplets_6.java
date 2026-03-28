import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PalindromeTriplets_6 {


    /*
    6 (code) Palindrome Triplets [15 points] Given a String array of n unique words.
A palindrome triplet is a triplet of integers (i, j, k) such that:
• 0 ≤ i, j, k < words.length,
• 𝑖 ≠ 𝑗, 𝑗 ≠ 𝑘, 𝑖 ≠ 𝑘,
• words[i] + words[j] + words [k] (the concatenation of the three strings) is a palindrome.
Return an array of all the palindrome triplets of words as lists of three integers in the form {i, j, k}

Example 1: Input: words = ["race", "car", "ecar", ""] Output: [ {3, 1, 2} , {1, 2, 3} , {3, 1, 2} , {3, 0, 1} , {0, 1, 3}]
Constraints: • 1 ≤ n ≤ 300 • 0 ≤ s.length ≤ 300 • s contains only lowercase and uppercase should be treated as the same letter.
     */


    /*
    so im going to gifted a list of words and i need to find every combination of 3 words that get a palindrome
    so i get like 3 words in list and then i can put them together to make it palindrome so i put like in front and behind for al of them
    so can i jsut do like a double nexted loop for that or w
    i cant use the same word twice and i have to use all of them nooo i can jsut do like 2 /3 and if its good hten its fine i think



     */

    public static List<List<Integer>> palindromeTriplets(String[] words) {
        List<List<Integer>> res = new ArrayList<>();

        if (words == null || words.length < 3) {
            return res;
        }



        // do the hasmap so we know which word is which like indexing them basically wooo

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }// end for loop for hashmaping



        // next lets try every pair for certain not all three words together
        // so test each pair which is like that other sorting one maube
        // that was like better than bubble or not bubble sort but the one where you dont look at the earlier index i think i am thinking ofthe better bubble but this isnt relal that

        //it is the double nested though

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (i==j)continue;

                String togeher =  words[i] + words[j];


                // now ughhhhhhh
                // FINISH THIS PART SPLIT AND FIND PALINDROME

            }// end j loop
        }// end i loop



        return res;
    }

}// LAST BRACKET
