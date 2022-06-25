package priorityQueue;


import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manh2
 */
public class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String a, String b){
        if (a.length() < b.length())
            return -1;
        else if (a.length() == b.length())
            return 0;
        else return 1;
    }

    
}
