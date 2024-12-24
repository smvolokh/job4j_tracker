package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        Item[] copy = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            copy[i] = items[i];
        }
        return copy;
    }

    public Item[] findByName(String key) {
        Item[] itemsByName = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item != null && key.equals(item.getName())) {
                itemsByName[size] = items[i];
                size++;
            }
        }
        itemsByName = Arrays.copyOf(itemsByName, size);
        return itemsByName;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        Item foundItem = items[index];
        if (foundItem != null) {
            item.setId(foundItem.getId());
        }
        items[index] = item;
        return true;
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index == -1) {
            return;
        }
        int start = index + 1;
        int length = size - index - 1;
        System.arraycopy(items, start, items, index, length);
        items[size - 1] = null;
        size--;
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }
}