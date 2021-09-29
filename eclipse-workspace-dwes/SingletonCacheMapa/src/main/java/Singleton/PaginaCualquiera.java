package Singleton;

import java.util.Map;
import java.util.TreeMap;

public class PaginaCualquiera {
	private static Map<Integer , String> cache = null;

	public static Map<Integer, String> getCache() {
		if (cache == null) {
			cache = new TreeMap<Integer , String>();
		}
		return cache;
	}

	public static void setCache(Map<Integer, String> cache) {
		PaginaCualquiera.cache = cache;
	}

	
	
	
	
}
