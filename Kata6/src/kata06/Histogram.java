/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author doram
 */
public class Histogram<T> {
    private Map<T, Integer> map;
    
    public Histogram(Iterator<T> iterator) {
       this(iterableOf(iterator));
    }
    
    private static <x> Iterable<x> iterableOf(Iterator<x> iterator) {
        return new Iterable<x>() {
            @Override
            public Iterator<x> iterator() {
                return iterator;
            }
        };
    }
    
    
    public Histogram (Iterable<T> iterable) {
        this.map = new HashMap<>();
        for (T item : iterable) {
            add(item);
        }
    }

    private void add(T item) {
        map.put(item, get(item)+1);
    }
    
    private int get(T item) {
        return map.containsKey(item) ? map.get(item) : 0;
    }
    
    public Map<T,Integer> getMap() {
        return map;
    }
    
    
}