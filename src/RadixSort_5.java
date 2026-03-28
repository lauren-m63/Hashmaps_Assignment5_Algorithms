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



     */


    public static String[] radixSort(String[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }


        return arr;
    }





} //LAST BRACKET
