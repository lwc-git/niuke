package ucollection.umap;

import java.util.Set;

/**
 * hashMap非线程安全，当在查找hashcode时，若对某一线程返回true，如果恰好有一删除操作，那么就会照成死锁
 */
public interface UMap<K,V> {

    //返回map的大小
    int size();

    //判断这个map是否为空
    boolean isEmpty();

    //判断这个链表的key是否存在
    boolean containsKey(Object key);

    boolean containsValue(Object Value);

    V get(Object key);

    V put(K key, V value);

    V remove(Object key);

    void clear();

    Set<UMap.Entry<K,V>> entrySet();



    interface Entry<K,V> {
        K getKey();

        V getValue();

        V setValue(V value);

        boolean equals(Object o);

        int hashCode();

    }


}
