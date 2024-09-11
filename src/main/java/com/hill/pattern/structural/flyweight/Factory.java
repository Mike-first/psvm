//this is a type factory. It stores types in itself and returns them on request if the required type exists
//or creates a new one, stores it in itself and returns it if such a type did not exist before

package com.hill.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private static Map<TreeType, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        TreeType requiredTreeType = new TreeType(name, color, texture);
        // or treeTypes.putIfAbsent(requiredTreeType, requiredTreeType);
        if (treeTypes.get(requiredTreeType) == null) {
            treeTypes.put(requiredTreeType, requiredTreeType);
        }
        return treeTypes.get(requiredTreeType);
    }
}
