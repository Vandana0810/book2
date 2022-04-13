package com.company;

import java.util.Arrays;
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
        int noOfBooks=sc.nextInt();
        String[] bookNames= new String[noOfBooks];
        Library obj= new Library();
        for(int i=0;i<noOfBooks;i++) {
            bookNames[i]=sc.next();
        }

        String bookname= Arrays.toString(bookNames);
        obj.setBookName(bookname);
        System.out.println(obj.getBookName());
        }

}
