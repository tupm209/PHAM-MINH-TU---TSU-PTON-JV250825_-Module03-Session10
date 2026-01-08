package bai3;

import java.util.LinkedList;

public class UserManager {
    private LinkedList<User> userLinkedList;

    public UserManager(){
        this.userLinkedList = new LinkedList<>();
    }

    public UserManager(LinkedList<User> userLinkedList) {
        this.userLinkedList = userLinkedList;
    }

    public void addUser(User user){
        userLinkedList.add(user);
    }

    public void displayData(){
        if(userLinkedList.isEmpty()){
            System.out.println("Không có dữ liệu người dùng");
        }else{
            for (User user : userLinkedList){
                System.out.println(user);
            }
        }
    }

    public boolean deleteUserByEmail(String email){
        for (User user : userLinkedList){
            if(user.getEmail().trim().equalsIgnoreCase(email)){
                userLinkedList.remove(user);
                return true;
            }
        }
        return false;
    }
}
