package ra.run;

import ra.entity.Book;
import ra.entity.ListBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Process {
Book book = new Book();
int numberBook = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListBook listBook = new ListBook();
        listBook.dummyData();
        run(scanner,listBook);
    }

    public static void menu (){
        System.out.println("1. Nhập thông tin n sách (n nhập từ bàn phím)");
        System.out.println("2. Tính lợi nhuận các sách");
        System.out.println("3. Hiển thị thông tin sách");
        System.out.println("4. Sắp xếp sách theo giá bán tăng dần");
        System.out.println("5. Sắp xếp sách theo lợi nhuận giảm dần");
        System.out.println("6. Tìm sách theo tên sách (tên sách nhập từ bàn phím)");
        System.out.println("7. Thống kê số lượng sách theo năm xuất bản");
        System.out.println("8. Thống kê số lượng sách theo tác giả");
        System.out.println("9. Thoát");
    }
    public static void run(Scanner scanner, ListBook listBook){
        boolean isExit = true;
        do {
            menu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    Book book = new Book();
                    book.input(listBook.getListBook());
                    listBook.addBook(book);
                    break;
                case 2:
                   listBook.interestBookAll();
                    System.out.println("Da tinh xong loi nhuan cac Sach");
                    break;
                case 3:
                    System.out.println("BookId\tBookName \tTac Gia\t\t\tGia Nhap\tGia Ban\t Loi Nhuan \t\t Nam xuat ban");
                    listBook.interestBookAll();
                    listBook.outputData();
                    break;
                case 4:
                    listBook.sortUp(listBook.getListBook());
                    listBook.outputData();
                    break;
                case 5:
                    listBook.sortDown(listBook.getListBook());
                    listBook.outputData();
                    break;
                case 6:
                    System.out.println("Nhap ten sach can tim");
                    String bookName = scanner.nextLine();
                    ArrayList<Book> list =  listBook.searchName(bookName);
                    listBook.outputData2(list);
                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    isExit = false;
                    break;
                default:
                    System.out.println("Vui long nhap lai");
                    break;

            }
        }while (isExit);
    }
    public  void input (Scanner scanner){
        System.out.println("Nhap so sach can nhap: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            
        }
    }




}
