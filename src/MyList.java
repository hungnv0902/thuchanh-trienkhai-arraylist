import java.util.ArrayList;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    ArrayList<E> elements = new ArrayList<>();

    public MyList() {
    }

    public MyList(int size) {
        this.size = size;
    }

    public void add(int index, E element) {
        elements.add(index, element);
        size ++;
    }

    public E remove(int index) {
        E element = elements.get(index);
        elements.remove(index);
        return element;

    }

    public int getSize() {
        return elements.size();
    }

    public void cloneArr() {
        ArrayList<E> cloneArrayList = (ArrayList<E>) elements.clone();
        for(int i = 0; i < cloneArrayList.size(); i ++) {
            System.out.println(cloneArrayList.get(i));
        }
    }

    public boolean contains(E o){
        return elements.contains(o);
    }

    public E get(int i) {
        return elements.get(i);
    }

    public void clear() {
        elements.clear();
    }


}
