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