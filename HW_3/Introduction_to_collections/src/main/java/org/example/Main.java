package org.example;
//Пусть дан произвольный список целых чисел.

import java.util.ArrayList;
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
        DeleteEvenNumbers(list);
        System.out.println(list);
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

    static int GetMaxValue(ArrayList list)
    {
        int value = 0;
        return value;
    }

    static int GetMinValue(ArrayList list)
    {
        int value = 0;
        return value;
    }

    static int GetArithmeticMeanValue(ArrayList list)
    {
        int value = 0;
        return value;
    }
}