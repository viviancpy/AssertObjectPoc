package com.chan.vivian;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TargetObject {

    String name;
    Map<String, NestedObject> map;
    List<NestedObject> list;

    public TargetObject(){

        name = "Target Object";

        map = new HashMap<String, NestedObject>();
        map.put("Key 1", new NestedObject(3, "case 1", 4));
        map.put("Key 2", new NestedObject(5, "case 2", 9));
        map.put("Key 3", new NestedObject(7, "case 3", 16));

        list = new LinkedList<NestedObject>();
        list.add(new NestedObject(2, "list 1", 2));
        list.add(new NestedObject(2, "list 2", 2));
        list.add(new NestedObject(2, "list 3", 2));
    }
}
