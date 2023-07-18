package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Train
{
    public static void main(String[]args)
    {
        TimeComparing();
    }

    static void TimeComparing()
    {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();
        l.
        //Запуск таймера
        long start0 = System.currentTimeMillis();

        for(int i = 0; i < 1_000_000; i++)
        {
            l.add(5);
        }

        //Вывод результата замеров ArrayList
        System.out.println(System.currentTimeMillis() - start0);

        //Запуск таймера
        long start1 = System.currentTimeMillis();

        for(int i = 0; i < 1_000_000; i++)
        {
            al.add(5);
        }

        //Вывод результата замеров ArrayList
        System.out.println(System.currentTimeMillis() - start1);

        //Запуск таймера
        long start2 = System.currentTimeMillis();
        for(int i = 0; i < 1_000_000; i++)
        {
            ll.add(5);
        }

        //Вывод результата замеров LinkedList
        System.out.println(System.currentTimeMillis() - start2);

    }
}