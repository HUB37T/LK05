import java.util.*;
public class Inventory<T>{
    private List<T> items;
    public Inventory(){
        this.items = new ArrayList<>();
    }
    public void addItem(T item){
        items.add(item);
    }
    public void removeItem(T item){
        items.remove(item);
    }
    public T getItem(int index){
        return items.get(index);
    }
    public List<T> searchItems(String keyword){
        List<T> search = new ArrayList<>();
        for(T item : items){
            if(item.toString().contains(keyword)){
                search.add(item);
            }
        }
        return search;
    }
}
