package BookPage;

import java.util.Scanner;

import static java.util.Collections.min;

public class Book {
    public int pageCount(int n,int p)
    {
        int front=p/2;
        int back;
        if(n%2==1)
            back=(n-p)/2;
        else
            back=(n-p+1)/2;
      return Math.min(front,back)  ;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of pages");
        int n=sc.nextInt();
        System.out.println("enter page u turn");
        int p=sc.nextInt();
        Book book=new Book();
        System.out.println(book.pageCount(n,p));
    }
}
