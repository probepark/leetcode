package com.probeio.leetcode._20200608;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountAndSay {
    public String countAndSay(int n) {
        return countAndSayInternal("1", n);
    }

    private String countAndSayInternal(String prev, int n) {
        if (n == 1) {
            return prev;
        }
        String result = groupBy(prev)
                .stream()
                .map(item -> item.value.size() + item.key)
                .collect(Collectors.joining(""));
        return countAndSayInternal(result, n - 1);
    }

    private List<Item> groupBy(String prev) {
        Item currentItem = null;
        List<Item> result = new ArrayList<>();
        for (int i = 0; i < prev.length(); i++) {
            String key = String.valueOf(prev.charAt(i));
            if (currentItem == null || !currentItem.key.equals(key)) {
                currentItem = newItem(key);
                currentItem.value.add(key);
                result.add(currentItem);
            } else {
                currentItem.value.add(key);
            }
        }
        return result;
    }

    private Item newItem(String key) {
        Item item = new Item();
        item.key = key;
        item.value = new ArrayList<>();
        return item;
    }

    private static class Item {
        private String key;
        private List<String> value;
    }
}
