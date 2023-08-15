package ra.entity;

import java.util.ArrayList;
import java.util.Comparator;

public class ListBook {
    ArrayList<Book> listBook = new ArrayList<Book>();

    public ArrayList<Book> getListBook() {
        return listBook;
    }

    public void setListBook(ArrayList<Book> listBook) {
        this.listBook = listBook;
    }

    public  void dummyData(){
        Book book = new Book();
        book = new Book("M001","B21",10,30,"Anh Tuan",2000);
        listBook.add(book);
        book = new Book("M002","B22",20,50,"Ngoc Linh",2000);
        listBook.add(book);
        book = new Book("M003","B23",30,80,"Thanh Tung",2000);
        listBook.add(book);
        book = new Book("M004","B24",40,90,"Nguyen Phuong",2000);
        listBook.add(book);
    }
    public void addBook(Book book){
        this.listBook.add(book);
    }
    public void interestBookAll(){
        for (Book book:listBook
        ) {book.interestData();

        }
    }
    public void outputData(){
        for (Book book:listBook
        ) {book.ouputData();

        }
    }
    public void outputData2(ArrayList<Book>listbook){
        for (Book book:listbook
        ) {book.ouputData();
        }
    }



    public void sortUp(ArrayList<Book>bookArrayList){
       bookArrayList.sort(new Comparator<Book>() {
           @Override
           public int compare(Book o1, Book o2) {
               return o1.getImportPrice()>o2.getImportPrice()?1:-1;
           }
       });
    }

    public void sortDown(ArrayList<Book>bookArrayList){
        bookArrayList.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getExportPrice()>o2.getExportPrice()?-1:1;
            }
        });
    }

    public ArrayList<Book> searchName(String name){
        ArrayList<Book> list = new ArrayList<Book>();
        for (Book book : this.listBook) {
            if (book.getBookName().equalsIgnoreCase(name)){
                list.add(book);
            }
        }return  list;
    }
//    public int[] authorforYear(){
//        boolean isAuthor = false;
//        int [] author = new int[this.listBook.size()];
//        int indexArray;
//        for (int i = 0; i < this.listBook.size(); i++) {
//            for (int j = 0; j < this.listBook.size(); j++) {
//                if (this.listBook[j])
//            }
//        }
//
//    }
//    public void printYear (){
//        int [] yearNew = authorforYear();
//        for ( int year year : yearNew
//             ) {
//
//        }
//    }

}
