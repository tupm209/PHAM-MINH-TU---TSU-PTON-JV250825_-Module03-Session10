package bai2;

import java.util.Scanner;

public class InputData {
    public static String getString(Scanner scanner, String suggest){
        String input = "";
        do {
            System.out.println(suggest);
            input = scanner.nextLine().trim();

            if(input.isEmpty()){
                System.out.println("Vui lòng không để trống");
            } else if (!input.matches("^[a-zA-Z\\s]*$")) {
                System.out.println("Hãy nhập chữ cái");
            }else{
                break;
            }
        }while (true);
        return input;
    }

    public static int getInt(Scanner scanner, String suggest){
        String rs = "";
        do {
            System.out.println(suggest);
            rs = scanner.nextLine();

            try {
                if (rs.isEmpty()){
                    System.out.println("Vui lòng không để trống");
                }else if(Integer.parseInt(rs) <= 0){
                    System.out.println("Vui lòng nhập năm là số nguyên dương > 0");
                }else{
                    break;
                }
            }catch (Exception e){
                System.out.println("Vui lòng nhập năm là số nguyên dương > 0");
            }
        }while(true);
        return Integer.parseInt(rs);
    }

}
