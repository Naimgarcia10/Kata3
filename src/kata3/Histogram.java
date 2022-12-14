package kata3;

import java.util.*;

class Histogram<T> {
    private final Map<T, Integer> map = new HashMap<T, Integer>();

    void increment(T key) {
        this.map.put(key, this.map.containsKey(key) ?  
                          this.map.get(key) + 1 : 1);
    }
    
    public Integer get(T key) {
        return this.map.get(key);
    }
    
    public Set<T> keySet () {
        return this.map.keySet();
    }
}
