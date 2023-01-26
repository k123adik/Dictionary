package com.example.dictionaryaditya;

import java.util.HashMap;

public class DictionaryUsingHashMap {
    HashMap<String, String> dictionary = new HashMap<>();

    public DictionaryUsingHashMap() {
        this.dictionary = new HashMap<>();
        addWordList();
    }

    public boolean addWords(String word, String meaning){
        try{
            dictionary.put(word, meaning);

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public String getMeaning(String word){
        if (dictionary.containsKey(word)) {

            return dictionary.get(word);
        }
        else{
            return "Word not found!";
        }
    }
    private void addWordList(){

        addWords("shubh", "Auspicious");
        addWords("Phase", "a stage in the development of something");
        addWords("project", "an individual or collaborative enterprise that is carefully planned to achieve a particular aim");
        addWords("start", "beginning");
        addWords("Depreciating assets ", "Whose value decreases with time");


    }

}
