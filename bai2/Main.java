package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManager bookManager = new BookManager();
        int choice = -1;

        do {
            System.out.println("********* MENU QUẢN LÝ SÁCH *********");
            System.out.println("1. Thêm sách");
            System.out.println("2. Tìm kiếm sách");
            System.out.println("3. Hiển thị danh sách sách");
            System.out.println("4. Thoát");

            try {
                choice = InputData.getInt(sc,"Nhập lựa chọn của bạn: ");

                switch (choice){
                    case 1:
                        // thêm sách
                        String name = InputData.getString(sc,"Nhập tên sách: ");
                        String author = InputData.getString(sc, "Nhập tác giả: ");
                        int year = InputData.getInt(sc, "Nhập năm xuất bản: ");

                        Book book = new Book(name, author, year);
                        bookManager.addBook(book);
                        System.out.println("Thêm sách thành công");
                        break;
                    case 2:
                        //tìm kiếm sách
                        String searchKey = InputData.getString(sc,"Nhập tên sách để tìm kiếm");
                        try {
                            Book foundBook = bookManager.findBookByName(searchKey);
                            System.out.println("Thông tin sách tìm thấy: " + foundBook);
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        // hiển thị danh sách
                        System.out.println("Danh sách sách");
                        bookManager.displayBooks();
                        break;
                    case 4:
                        System.out.println("Thoát chương trình");
                        System.exit(0);
                    default:
                        System.out.println("Nhập lựa chọn 1 - 4");
                }
            }catch (NumberFormatException e){
                System.out.println("Vui lòng chọn một số hợp lệ");
            }
        }while (true);
    }
}
