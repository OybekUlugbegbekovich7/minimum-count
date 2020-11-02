package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        FileInputStream input = new FileInputStream(string);
        Map <Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int bayt;
        while(input.available() > 0)
        {
            bayt = input.read();
            list.add(bayt);
        }
        input.close();
        for (int i = 0; i < list.size(); i++)
        {
            int sum = 0;
            for (int j = 0; j < list.size(); j++)
            {
                if (list.get(i).equals(list.get(j)))
                {
                   sum++;
                }map.put(list.get(i), sum);
            }
        }
        if (!map.isEmpty())
        {
            int min = Collections.min(map.values());
            for (Map.Entry<Integer, Integer> pair : map.entrySet())
            {
                if (pair.getValue() == min)
                {
                    System.out.print(pair.getKey() + " ");
                }
            }
        }

    }
}
