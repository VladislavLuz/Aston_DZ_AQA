import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            //printThreeWords();
            //checkSumSign();
            //printColor();
            //compareNumbers();
            // zadanie5(10,3);
            //zadanie6(0);
            //zadanie7(-5);
            //zadanie8("Hello!",5);
            //zadanie9(2024);
            //zadanie10();
            //zadanie11();
            //zadanie12();
            //zadanie13();
            //zadanie14(5,10);
        }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        Integer a = 0;
        Integer b = 4;
        if (a+b>=0){
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void  printColor(){
        Integer value = 100;
        if (value<=0){
            System.out.println("Красный");
        }else if(value>0&value<=100){
            System.out.println("Желтый");
        }else if(value>100){
            System.out.println("Зеленый");
    }else {
            System.out.println("Ошибка");
        }
    }

    public static void compareNumbers(){
        Integer a = 15;
        Integer b =20;
        if (a>=b){
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }

    public static boolean zadanie5(Integer a, Integer b){
        System.out.println(a+b>10 && a+b<=20);
        return a+b>10 && a+b<=20;
    }

    public static void zadanie6(Integer num){
        if(num>=0){
            System.out.println("Число положительное");
        }else{
            System.out.println("Число отрицательное");
        }
    }

    public static boolean zadanie7(Integer num){
        System.out.println(num<0);
        return num<0;
    }

    public static void zadanie8(String str,Integer num){
        for (Integer i=0; i<num; i++){
            System.out.println(str);
        }
    }

    public static boolean zadanie9(Integer year){
        System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ;
    }

    public static void zadanie10(){
        Integer[] array = {1,0,1,1,0,1,1};
        for (Integer i=0; i<array.length; i++){
            if(array[i]==0){
                array[i]=1;
            }else{
                array[i]=0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void zadanie11(){
        Integer[] array = new Integer[100];
        for (Integer i=0; i<array.length; i++) {
            array[i] = i+1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void zadanie12(){
        Integer[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (Integer i=0; i<array.length; i++){
            if(array[i]<6){
                array[i]*=2;
            }else{
                continue;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void zadanie13(){
        int n = 5;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            array[i][i] = 1; // Главная диагональ
            array[i][n - 1 - i] = 1; // Побочная диагональ
        }

        for (int i = 0; i < n; i++) {
            for (int v = 0; v < n; v++) {
                System.out.print(array[i][v] + " ");
            }
            System.out.println();
        }
    }

    public static int[] zadanie14(Integer len,Integer initialValue){
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
        return array;

    }





    }


