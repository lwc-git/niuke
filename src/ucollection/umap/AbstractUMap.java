package ucollection.umap;

import java.util.Iterator;
import java.util.Map;

public abstract class AbstractUMap<K,V> implements UMap<K,V>{
    protected AbstractUMap(){

    }

    public int size(){
        return entrySet().size();
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public boolean containsValue(Object value){
        Iterator<Entry<K,V>> i = entrySet().iterator();
        if(value == null){
            while(i.hasNext()){
                Entry<K,V> e = i.next();
                if(e.getValue()==null)
                    return true;
            }
        }else{
            while(i.hasNext()){
                Entry<K,V> e = i.next();
                if(value.equals(e.getValue()))
                    return true;
            }
        }
        return false;
    }

    public boolean containsKey(Object key) {
        Iterator<Entry<K,V>> i = entrySet().iterator();
        if (key==null) {
            while (i.hasNext()) {
                Entry<K,V> e = i.next();
                if (e.getKey()==null)
                    return true;
            }
        } else {
            while (i.hasNext()) {
                Entry<K,V> e = i.next();
                if (key.equals(e.getKey()))
                    return true;
            }
        }
        return false;
    }

    public V remove(Object key){
        Iterator<Entry<K,V>> i = entrySet().iterator();
        Entry<K,V> correctEntry = null;
        if(key==null){
            while(correctEntry==null && i.hasNext()){
                Entry<K,V> e = i.next();
                if(e.getKey()==null)
                    correctEntry = e;
            }
        }else{
            while(correctEntry==null && i.hasNext()){
                Entry<K,V> e = i.next();
                if (key.equals(e.getKey()))
                    correctEntry = e;
            }
        }
        V oldValue = null;
        if(correctEntry!=null){
            oldValue = correctEntry.getValue();
            i.remove();
        }
        return oldValue;
    }

    public void clear(){
        entrySet().clear();
    }
}
