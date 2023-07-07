package org.example;
//Пусть дан произвольный список целых чисел.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение
public class Main {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < 10; i++) {list.add(rand.nextInt(10));}
        System.out.println(list);
        DeleteEvenNumbers(list);
        System.out.println(list);
        System.out.println(GetMaxValue(list));
        System.out.println(GetMinValue(list));
        System.out.println(GetArithmeticMeanValue(list));
    }
    static ArrayList DeleteEvenNumbers(ArrayList list) //Не указали тип, можем получать любые списки))
    {
        int index = 0;
        while (index < list.size())
        {
            if ((int) list.get(index) % 2 == 0) {list.remove(index);}
            else {index++;}
        }
        return list;

        //Интересно что работает быстрее?

//      Iterator iterator = list.iterator();
//      while(iterator.hasNext())
//      {
//          if((int)iterator.next() % 2 == 0) {iterator.remove();}
//      }
//      return list;
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