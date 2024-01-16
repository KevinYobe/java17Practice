package org.java17practice.java17practice.collections.map;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(Map.of(1, "Kevin", 2, "Yobe", 3, "Test", 5, "Nyasha"));
        System.out.println(map.getOrDefault(1, "DefaultValue"));
        map.merge(4, "Kevin ", (i, s)->s.concat("Yobe"));
        map.replaceAll((i,v)->v.concat(" key "+ i));
        Collection<String> values = map.values();

        System.out.println(values instanceof AbstractCollection);
        System.out.println(values.size());
    }
}
