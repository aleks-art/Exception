package Exceptions;

import Exceptions.Parsing.ParserException;
import Exceptions.Parsing.Parsing;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParserException {
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные");
        String[] arr = new String[5];
        String str = sc.nextLine();
        Parsing.parseInput(str);
//            for (String s : str.split(" ")) {
//                arr[i] = s;
//                i++;
//            }
//        for (String w : arr) {
//            if (w==null){
//                throw new IllegalArgumentException("Введеные данные не верны");
//            }
//            System.out.println(w);
//        }
    }
}
