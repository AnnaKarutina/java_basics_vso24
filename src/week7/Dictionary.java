package week7;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    HashMap<String, String> dictionary;

    public Dictionary() {
        dictionary = new HashMap<String, String>();
    }

    public String translate(String word){
        if(this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } else {
            return null;
        }
    }

    public boolean add(String word, String translation){
        if(this.dictionary.containsKey(word)) {
            return false;
        } else {
            this.dictionary.put(word, translation);
            return true;
        }
    }

    public int amountOfWords(){
        return this.dictionary.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> wordpairs = new ArrayList<String>();
        for(String word : this.dictionary.keySet()) {
            wordpairs.add(word + " = " +  this.dictionary.get(word));
        }
        return wordpairs;
    }
}
