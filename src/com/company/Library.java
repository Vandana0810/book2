package com.company;

import java.util.Scanner;

public class Library {
    private String bookname;
    public void setBookName(String bookname) {
        this.bookname=bookname;
    }
    public String getBookName() {
        return this.bookname;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Library obj= new Library();
        String bookname = sc.nextLine();
        obj.setBookName(bookname);
        System.out.println(obj.getBookName());
    }
}









