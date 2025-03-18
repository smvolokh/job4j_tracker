package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("smvolokh@qwoke.ru", "Volokh Semen M");
        map.put("key", "value");
        map.put("key", "anotherValue");
        map.put("school", "1000");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }
    }
}
