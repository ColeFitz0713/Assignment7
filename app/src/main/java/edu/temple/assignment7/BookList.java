package edu.temple.assignment7;

import java.util.ArrayList;

public class BookList {
    ArrayList<Book> list;
    public BookList(ArrayList<Book> list){
        this.list = list;
    }
    public void Add(Book newBook){
        list.add(newBook);
    }
    public void Remove(Book newBook){
        list.remove(newBook);
    }
    public Book get(int num){
        return list.get(num);
    }
    public int size(){
        return list.size();
    }
}
