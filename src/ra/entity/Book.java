package ra.entity;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Book {

    static final int START_YEAR = 2000;
    //1 Attributes

    private String bookId;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String author;
    private  float interest;
    private int year;

    //2 get set

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getInterest() {
        return interest;
    }

    //3 Constructor


    public Book() {
    }

    public Book(String bookId, String bookName, float importPrice, float exportPrice, String author, int year) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.year = year;
    }
    //4 input, output.
    public void input( ArrayList<Book>bookArrayList){
        boolean fag =true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap Ma sach: ");
            this.bookId = scanner.nextLine();
            fag = false;
        }while (fag);

        System.out.print("");
        do {
            fag = true;
            System.out.print("Nhap ten sach( Bat dau ki tu la B): ");
            this.bookName = scanner.nextLine();
            fag = false;
        }while (fag);
        System.out.print("");

        do {
            fag = true;
            System.out.print("Tac Gia");
            this.author = scanner.nextLine();
            String authorRegex = "^(?=.{6,50}$)[A-Za-zÀ-ỹ][A-Za-zÀ-ỹ ]*$";
            boolean isAuthor = Pattern.matches("authorRegex","this.author");
            if (isAuthor){
                fag=false;
            }
        }while (fag);

        System.out.print("");
        do {
            System.out.print("Gia nhap sach: ");
            this.importPrice = Float.parseFloat(scanner.nextLine());
        }while ( this.importPrice <0);

        System.out.print("");
        do {
            System.out.print("Gia ban sach");
            this.exportPrice = Float.parseFloat(scanner.nextLine());
        }while ( this.exportPrice<(this.importPrice*1.3));
        System.out.print("");

        do {
            System.out.print("Nam san xuat(tu nam 2000 tro di): ");
            this.year = Integer.parseInt(scanner.nextLine());
        }while ( this.year<START_YEAR);


        System.out.print("");
    }
    public  void ouputData(){
        System.out.println(this.bookId +"\t\t"+ this.bookName +"\t\t"+this.author
                +"\t\t"+this.importPrice +"\t\t"+this.exportPrice
                +"\t\t"+this.interest+"\t\t"+this.year);
    }

//    5 Methous
    public void interestData(){
        this.interest = this.exportPrice - this.importPrice;
    }

    public boolean checkId (String bookId ,ArrayList<Book> bookArrayList){
        boolean checkId =false;
        for (Book bk: bookArrayList) {
           if (bk.getBookId()==bookId){
               checkId = true;
           }
        }

        return checkId;
    }
    public boolean checkName (String bookName,ArrayList<Book> bookArrayList){
        boolean checkName =false;
        for (Book bk: bookArrayList) {
            checkName =  bookName.toLowerCase().trim().equals(bk.getBookName());
        }
        return checkName;
    }
}

