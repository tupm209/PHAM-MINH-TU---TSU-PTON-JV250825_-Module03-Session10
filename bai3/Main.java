package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserManager userManager = new UserManager();
        int choice = -1;

        do {
            System.out.println("************ MENU QUẢN LÝ NGƯỜI DÙNG ************");
            System.out.println("1. Thêm người dùng");
            System.out.println("2. Xóa người dùng");
            System.out.println("3. Hiển thị danh sách người dùng");
            System.out.println("4. Thoát");

            try {
                choice = InputData.getInt(sc, "Lựa chọn của bạn: ");

                switch (choice){
                    case 1:
                        String name = InputData.getString(sc,"Nhập tên người dùng: ");
                        String email = InputData.getString(sc,"Nhập email người dùng: ");
                        String phoneNumber = InputData.getString(sc, "Nhập số điện thoại người dùng: ");
                        User user = new User(name, email, phoneNumber);
                        userManager.addUser(user);
                        break;
                    case 2:
                        String inputEmail = InputData.getString(sc,"Nhập email người dùng để xóa: ");
                        if(userManager.deleteUserByEmail(inputEmail)){
                            System.out.println("Đã xóa người dùng thành công");
                        }else{
                            System.out.println("Không tìm thấy người dùng");
                        }
                        break;
                    case 3:
                        System.out.println("Danh sách người dùng:");
                        userManager.displayData();
                        break;
                    case 4:
                        System.out.println("Thoát chương trình");
                        System.exit(0);
                    default:
                        System.out.println("Hãy nhập lựa chọn 1 - 4");
                }
            }catch (NumberFormatException e){
                System.out.println("Vui lòng chọn một số hợp lệ");
            }

        }while (true);
    }
}
