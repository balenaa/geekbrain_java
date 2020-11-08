package com.company;


import static java.lang.Math.abs;
import static java.lang.Math.floorDiv;

public class Main {
    public static void method1(int input[]){
        for(int i=0; i<input.length; i++ ){
            input[i] = abs(input[i]-1);
        }
    }

    //2 Задать пустой целочисленный массив размером 8. Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
    public static int[] method2(int size){
        int result[] = new int[size];
        for(int i=0; i<size; i++){
           result[i]=1+i*3;
        }
        return result;
    }

    //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
    public static void method3(int input[]){
        for(int i=0; i<input.length; i++ ){
            if (input[i]<6) {
                input[i] = input[i] * 2;
            }
        }
    }

    //4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
    public static int method4_min(int input[]) throws Exception{
        if (input.length>0) {
            int min = input[0];
            for (int i = 1; i < input.length; i++) {
                if (input[i] < min) {
                    min = input[i];
                }
            }
            return min;
        } else {
            throw new Exception("No minimum for empty array");
        }
    }

    // 5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональные элементы единицами, используя цикл(ы);
    public  static int[][] method5(int size){
        int ar[][] = new int[size][size];
        for(int i=0; i<size; i++){
            ar[i][i]= 1;
        }
        return ar;
    }

    //   6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||, эти символы в массив не входят.
    public static boolean method6(int input[]){
        int right = 0, left = 0;
        for(int i=0; i<input.length; i++ ){
            right += input[i];
        }
        for(int i=0; i<input.length; i++ ){
            right -= input[i];
            left += input[i];
            if (right == left){
                return true;
            }
        }
        return false;
    }


   /*   7 * Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.
            8 ** Не пользоваться вспомогательным массивом при решении задачи 7.*/

    public static void method_78(int input[], int shift){
        int tmp;
        if (shift < 0){
            shift = input.length + (shift % input.length);
        }
        for(int j=0; j<shift; j++) {
            tmp = input[0];
            for (int i = 0; i < (input.length - 1); i++) {
                input[i] = input[i + 1];
            }
            input[input.length - 1] = tmp;
        }
    }

    public static int method4_max(int input[]) throws Exception{
        if (input.length>0) {
            int max = input[0];
            for (int i = 1; i < input.length; i++) {
                if (input[i] > max) {
                    max = input[i];
                }
            }
            return max;
        } else {
            throw new Exception("No maximum for empty array");
        }
    }


    public static void printarray(int input[]){
        for(int i=0; i<input.length; i++ ){
            System.out.print(input[i]);
            System.out.print(", ");
        }
        System.out.println("");
    }

    public static void main(String[] args) throws Exception  {
        System.out.println("method 1");
        int m1_input[] = new int[]{ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        method1(m1_input);
        printarray(m1_input);
        System.out.println("method 2");
        printarray(method2(8));
        System.out.println("method 3");
        int[] ar = new int[]{ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        method3(ar);
        printarray(ar);
        System.out.println("method 4");
        System.out.println(method4_min(ar));
        System.out.println(method4_max(ar));
        System.out.println("method 5");
        int[][] arr = method5(12);
        System.out.println("method 6");
        System.out.println(method6(new int[]{1, 1, 1, 2, 1}));
        System.out.println(method6(new int[]{9, 1, 1}));
        System.out.println("method 78");
        method_78(ar,-14);
        printarray(ar);

    }
}
