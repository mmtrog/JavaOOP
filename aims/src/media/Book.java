package media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Book extends Media {
    private ArrayList<String> authorsList = new ArrayList<String>();
    private String content;
    
//************************************* Constructors *************************************
    
    public Book(int id, String title, String category, float cost, ArrayList<String> authorsList) {
        super(id, title, category, cost);
        this.authorsList.addAll(authorsList);
    }
//************************************* Getters and Setters methods ************************************* 

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


//************************************* ArrayList authors method ************************************* 


    public void addAuthors(String author) {
        if (authorsList.contains(author)) {
                System.out.println("Author exist!!!");
        }
        else {
                authorsList.add(author);
                System.out.println("Add author successfully!!!");
        }
    }

    public void removeAuthors(String author) {
        if (authorsList.contains(author)) {
            authorsList.remove(author);
            System.out.println("Remove author successfully!!!");
        }
        else {
            System.out.println("Author not exist!!!");
        }
    }

    public void printAuthors() {
        for(String test : authorsList) {
            System.out.println(test);
        }
    }
    
    
    //Sorted content List       
    private ArrayList<String> contentTokens = new ArrayList<String>();
    
    public void setContentTokens() {
        String[] arr = content.split("\\s");
        for (int i = 0; i < arr.length; i++) {
            contentTokens.add(arr[i]);
        }
        Collection<String> collection = contentTokens;
        Iterator<String> iterator = collection.iterator();
        if (collection instanceof List) {
            Collections.sort((List)collection);
        }
        else {
            System.out.println("Can't sort this collection");
        }
        
        //print tokens
        /*iterator = collection.iterator();
        while (iterator.hasNext()) {
            String tokenCheck = (String)iterator.next();
            System.out.println(tokenCheck);
        }*/
    }


    //Sorted Map
    private Map<Integer, String> wordFrequency = new HashMap<Integer, String>();
    
    public void setWordFrequency() {
        setContentTokens();
        for (int i = 0; i < contentTokens.size(); i++) {
            wordFrequency.put(i, contentTokens.get(i));
        }
        
        for (int i = 0; i < wordFrequency.size(); i++) {
            System.out.println(i + ": " + wordFrequency.get(i));
        }
    }


}