
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        //List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        //List<String> words = new ArrayList<>(List.of("table", "ball", "sport", "ball", "head"));

        List<String> words = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

        //task1(nums);
        //task2(nums);
        //task3(words);
        task4(words);
    }

    public static void task1(List<Integer> list)
    {
        for (Integer integer : list)
        {
            if (integer % 2 == 1)
                System.out.println(integer);
        }
    }

    public static void task2(List<Integer> list)
    {
        Set<Integer> alreadyPrintedNumbers = new HashSet<>();

        for (Integer integer : list)
        {
            if (!alreadyPrintedNumbers.contains(integer))
            {
                if (integer % 2 == 1)
                {
                    System.out.println(integer);
                    alreadyPrintedNumbers.add(integer);
                }
            }
        }
    }

    public static void task3(List<String> words)
    {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    public static void task4(List<String> words)
    {
        Map<String, Integer> map = new HashMap<>();

        for (String word : words)
        {
            if (map.containsKey(word))
            {
                map.put(word, map.get(word) + 1);
            }
            else
            {
                map.put(word, 1);
            }
        }

        for (String key: map.keySet())
        {
            System.out.println ("Слово " + key + " встречается " + map.get(key) + " раз");
        }

    }

}