package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        String continueInput;

        do {
            String name = InputData.getString(sc, "Nhập tên sinh viên: ");
            int age = InputData.getInt(sc,"Nhập tuổi sinh viên: ");
            double averageScore = InputData.getDouble(sc,"Nhập điểm trung bình: ");

            Student student = new Student(name, age, averageScore);
            studentManager.addStudent(student);

            continueInput = InputData.getString(sc, "Bạn có muốn thêm sinh viên khác không? (y/n)");
        }while (continueInput.equalsIgnoreCase("y"));

        System.out.println("\nDanh sách sinh viên");
        studentManager.displayStudents();
        sc.close();
    }
}
