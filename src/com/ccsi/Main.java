package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    String[] strings={"practice","makes","perfect","coding","makes"};
        int res=shortestDistance(strings,"coding","practice");
        System.out.println(res);
    }
    //Given a list of words and two words word1 and word2,return the shortest distance
    //between these two words in the list;
    public static int shortestDistance(String[] words,String word1,String word2){
        int p=0,q=0,diff=Integer.MAX_VALUE;
        while(true){
            while(p<words.length&&!word1.equals(words[p])) p++;
            if(p==words.length) break;
            while(q<words.length&&!word2.equals(words[q])) q++;
            if(q==words.length) break;
            if(p==q) return 0;
            else if(p>q) {
                diff=diff>p-q?p-q:diff;
                q++;
            }
            else {
                diff=diff>q-p?q-p:diff;
                p++;
            }
        }
        return diff;
    }
}
