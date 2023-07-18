package org.example;
//Пусть дан произвольный список целых чисел.

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Iterator;

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение
public class Main
{
    public static void main(String[] args)
    {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < 10; i++) {list1.add(rand.nextInt(10));}

        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < list1.size(); i++)
        {
            list2.add(list1.get(i));
        }

        long startTime = System.nanoTime();
        System.out.println(DeleteEvenNumbers(list1, temp));
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

        System.out.println(list1);
//        System.out.println(GetMaxValue(list));
//        System.out.println(GetMinValue(list));
//        System.out.println(GetArithmeticMeanValue(list));
    }
    static List DeleteEvenNumbers(List<Integer> list2, List temp)
    {
        for (int i = 0; i < list2.size(); i++) {if (list2.get(i) % 2 != 0) {temp.add(list2.get(i));}}
        return temp;
    }

    static int GetMaxValue(ArrayList<Integer> list)
    {
        int value = list.get(0);
        for(Integer num : list) {if(num > value) {value = num;}}
        return value;
    }

    static int GetMinValue(ArrayList<Integer> list)
    {
        int value = list.get(0);
        for(Integer num : list) {if(num < value) {value = num;}}
        return value;
    }

    static double GetArithmeticMeanValue(ArrayList<Integer> list)
    {
        int value = 0;
        for(Integer num : list){value += num;}
        return (double)value / list.size();
    }
}