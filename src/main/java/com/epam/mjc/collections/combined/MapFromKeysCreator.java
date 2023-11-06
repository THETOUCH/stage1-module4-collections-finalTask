package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> newMap = new HashMap<>();
        for (Map.Entry<String, Integer> e : sourceMap.entrySet()) {
            Set<String> keysSet = newMap.getOrDefault(e.getKey().length(), new HashSet<>());
            keysSet.add(e.getKey());
            newMap.put(e.getKey().length(), keysSet);
        }
        return newMap;
    }
}
