import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RadixSort_5 {

    /*
    5 (code) Radix Sort [10 points] Write a program that takes in an array of Strings and uses radix sort to sort the array lexicographically.
Input Format An array of string s. where s[i] will be a string and s can be empty. Constraints • 1 ≤ |𝑠| ≤ 10!, where |𝒔| is the length of the strings
array
You are allowed to use the HashMap collection Output Format The sorted array + print the sorted array.
Sample Input ["google", "gojo", "amazingly", "jogo", "luna", "pup", "solas", "solo", "pupperino", "amaterasu", "amazon", "puppy", "hydra", "amazonia", "vueltiao"]
Sample Output ama, amaterasu, amazingly , amazon, amazonia, gojo, google, hydra, jogo, luna, pupperino, puppy
     */


    /*
    okays oi have array of strings and i put them alphabetically like the strings as a whole word i just put the words in lapahbeticla order
    i use hashmap and its just a b so kind of like the leetcode one where letters are numbers can i just use that thing a-'c'

    radix sort is doing the one character at a time  by either starting at least or first characyer and going towards front of worf

    all of them diff lengths though soo do like a bit thing like -1 in between the words to know when stop
    or null whatever so you want to start from end of array and work towards front and u know you hti the end if you hit null

    you can create buckets hooray and i f it starts with like a put in a bucket then sort each of those buckets also because multiple a but ab vs az

ohh okay but i have to do everything at the same time so i have to make teh strings equal length im not like
going through the string in whole i have to do its like for i and then look at the index of everything for the one i index thing oay


     */


    public static String[] radixSort(String[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }


        // so first im going to find my like max string so i can adjust the null chaacrters on each side so they are all same length ao loop through frist

        // like columsn and rows

        int highestLength =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > highestLength) {
                highestLength = arr[i].length();
            }
        } // end for loop

        String[] paddedArray = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            paddedArray[i] = (arr[i]);
            while(paddedArray[i].length() < highestLength) {
                paddedArray[i] = paddedArray[i] + "\0";
            }
        } // end for loop

        for (int x = highestLength -1; x >= 0; x--) {

            ///sort them here into buckets by first letter then sort those buckets later
            HashMap<Character, List<String>> buckets = new HashMap<>();
            buckets.put('\0', new ArrayList<>());
            for (char c = 'a'; c <= 'z'; c++) {
                buckets.put(c, new ArrayList<>());
            }

            int index = 0;
            for (String s : paddedArray) {
                char c = s.charAt(x);
                buckets.get(c).add(s);
            }

            for (String s : buckets.get('\0')) {
                paddedArray[index++] = s;
            }

            // BUCKETS
            for (char c = 'a'; c <= 'z'; c++) {
                for (String s : buckets.get(c)) {
                    paddedArray[index++] = s;
                }
            }

            for (int i = 0; i < arr.length; i++) {
                arr[i] = paddedArray[i].replace("\0", "");
            }

        }// end for loop

        System.out.println(String.join(", ", arr));


        return arr;
    }

    /*
   time complexity is O(n × m) where n is the number of words and m is the
longest word length. The outer loop runs m times (once per character position,
right to left). Inside that loop you touch every single word once to drop it
into a bucket, which is n operations. So total is n × m operations.
Before all of that you also loop through the whole list once to find the
longest word, but that is just O(n) which gets absorbed into O(n × m).

space complexity is also O(n × m) where n is the number of words and m is
the longest word length because you create paddedArray which stores every
word padded out to full length m. So you are holding n words each of size m
in memory at the same time.
     */



} //LAST BRACKET
