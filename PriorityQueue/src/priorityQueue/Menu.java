package priorityQueue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author manh2
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        HeapAdaptablePriorityQueue<Integer, String> T = new HeapAdaptablePriorityQueue();
        T.insert(6, "a");
        T.insert(9, "b");
        T.insert(2, "c");
        T.insert(1, "d");
        while (true) {
            System.out.println("=========== MENU ===========");
            System.out.println("0. Thoát");
            System.out.println("1. In ra Heap");
            System.out.println("2. Thêm Entry vào heap");
            System.out.println("3. In ra Entry có key nhỏ nhất");
            System.out.println("4. In ra Entry có key nhỏ nhất và xóa");
            System.out.println("5. Kích thước Heap");
            System.out.print("Nhập lựa chọn: ");
            int n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
//                    T.display();
                    System.out.println(T.display());
                    break;
                case 2:
                    System.out.print("Nhập key: ");
                    int ki = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập value: ");
                    String vi = sc.nextLine();
                    T.insert(ki, vi);
                    break;
                case 3:
                    System.out.print("Entry có key nhỏ nhất là: ");
                    System.out.println(T.min().toString());
                    break;
                case 4: 
                    System.out.print("Xóa Entry có key nhỏ nhất là: ");
                    System.out.println(T.removeMin().toString());
                    break;
                case 5:
                    System.out.print("Kích thước: ");
                    System.out.println(T.size());
                    break;

                default: System.out.println("Nhập số từ 0 >> 5. Vui lòng nhập lại!!!");
                    break;
            }
        }
        
  
    }
    
}
