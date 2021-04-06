package test;

import media.*;
import java.util.ArrayList;

public class Test 
{
    
    public static void main(String[] args) {
        ArrayList<String> authorList = new ArrayList<String>();
        Book nBook = new Book("OOP", "Code", 8.02f, authorList);
        
        nBook.addAuthors("author1");
        nBook.addAuthors("author2");
        nBook.addAuthors("author12");
        nBook.addAuthors("author3");
        nBook.printAuthors();
        
        System.out.println(nBook.getCost());
    }    
}