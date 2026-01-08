package bai4;

import bai3.InputData;
import bai3.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AttendanceManager manager = new AttendanceManager();
        int choice = -1;

        do {
            System.out.println("************ MENU QUẢN LÝ ĐIỂM DANH ************");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên");
            System.out.println("5. Thoát");

            try {
                choice = InputDataBai4.getInt(sc, "Lựa chọn của bạn: ");

                switch (choice){
                    case 1:
                        int id = InputDataBai4.getInt(sc,"Nhập mã sinh viên: ");
                        String name = InputDataBai4.getString(sc, "Nhập tên sinh viên: ");
                        Student student = new Student(id, name);
                        manager.add(student);
                        System.out.println("Đã thêm sinh viên thành công");
                        break;
                    case 2:
                        manager.display();
                        int inputId = InputDataBai4.getInt(sc, "Nhập id sinh viên cần sửa: ");
                        int index = -1;

                        for (int i = 0; i < manager.students.size(); i++) {
                            if(manager.students.get(i).getId() == inputId){
                                index = i;
                                break;
                            }
                        }
                        if (index == -1){
                            System.out.println("Không tìm thấy sinh viên");
                        }else{
                            String inputName = InputDataBai4.getString(sc, "Nhập tên mới sinh viên: ");
                            manager.update(index, new Student(inputId, inputName));
                            System.out.println("Sinh viên đã được sửa thành công");
                        }
                        break;
                    case 3:
                        manager.display();
                        int idDelete = InputDataBai4.getInt(sc, "Nhập id sinh viên cần sửa: ");
                        int indexDelete = -1;

                        for (int i = 0; i < manager.students.size(); i++) {
                            if(manager.students.get(i).getId() == idDelete){
                                indexDelete = i;
                                break;
                            }
                        }

                        if (indexDelete == -1){
                            System.out.println("Không tìm thấy sinh viên");
                        }else{
                            manager.delete(indexDelete);
                            System.out.println("Sinh viên đã được xóa thành công");
                        }
                        break;
                    case 4:
                        manager.display();
                        break;
                    case 5:
                        System.out.println("Thoát chương trình");
                        sc.close();
                        return;
                    default:
                        System.out.println("Hãy nhập lựa chọn 1 - 5");
                }
            }catch (NumberFormatException e){
                System.out.println("Vui lòng chọn một số hợp lệ");
            }

        }while (true);
    }
}
