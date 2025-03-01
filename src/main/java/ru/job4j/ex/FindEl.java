package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Element with value of " + key + " not found in array");
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            FindEl.indexOf(
                    new String[]{"hello", "hey", "ttest"},
                    "test"
            );
        } catch (ElementNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}