package edu.tum.cs.i1.pse;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cache<K, V> extends LinkedHashMap<K, V>{
	private static int MAX_ENTRIES;

	public Cache(int capacity) {
		MAX_ENTRIES = capacity;
	}

	@Override
     protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > MAX_ENTRIES;
     }
}
