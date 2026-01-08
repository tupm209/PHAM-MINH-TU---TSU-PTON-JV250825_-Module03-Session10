package bai2;

import java.util.ArrayList;
import java.util.HashMap;

public class BookManager {
    private HashMap<String, Book> bookHashMap;

    public BookManager() {
        this.bookHashMap = new HashMap<>();
    }

    public void addBook(Book book){
        bookHashMap.put(book.getName(), book);
    }

    public Book findBookByName(String name) throws Exception{
        if(!bookHashMap.containsKey(name)){
            throw new Exception("Sách không tồn tại");
        }
        return bookHashMap.get(name);
    }

    public void displayBooks(){
        if(bookHashMap.isEmpty()){
            System.out.println("Không có dữ liệu");
        }else{
            for (Book book : bookHashMap.values()){
                System.out.println(book);
            }
        }
    }
}
