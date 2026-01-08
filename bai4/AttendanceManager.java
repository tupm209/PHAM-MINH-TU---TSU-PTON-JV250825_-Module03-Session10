package bai4;

import java.util.ArrayList;

public class AttendanceManager implements IManager<Student>{
    public ArrayList<Student> students;

    public AttendanceManager() {
        this.students = new ArrayList<>();
    }

    public AttendanceManager(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public void update(int index, Student student) {
        if (index >= 0 && index < students.size()) {
            students.set(index, student);
        }
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < students.size()) {
            students.remove(index);
        }
    }

    @Override
    public void display() {
        if(students.isEmpty()){
            System.out.println("Danh sách rỗng");
        }else{
            for (int i = 0; i < students.size(); i++) {
                System.out.println((i + 1) + ". " + students.get(i));
            }
        }
    }
}
