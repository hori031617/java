/**
 * 2114.
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 * You are given an array of strings sentences, where each sentences[i] represents a single sentence.
 * Return the maximum number of words that appear in a single sentence.
 * 
 * Example
 * Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
 * Output: 6
 * Explanation: 
 * - The first sentence, "alice and bob love leetcode", has 5 words in total.
 * - The second sentence, "i think so too", has 4 words in total.
 * - The third sentence, "this is great thanks very much", has 6 words in total.
 * Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
 */
class MostWords{

    public static int mostWordsFound(String[] sentences){
        int maxLength = 0;

        // for(String sentence : sentences){
        //     maxLength = Math.max(sentence.split(" ").length, maxLength);
        // }

        for(int i=0; i<sentences.length; i++){
            maxLength = Math.max(sentences[i].split(" ").length, maxLength);
        }

        return maxLength;
    }

    public static void main(String args[]){
        // String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        int ret = mostWordsFound(sentences);
        System.out.println(ret);
    }
}