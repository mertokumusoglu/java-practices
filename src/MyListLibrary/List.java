package MyListLibrary;

public class List <T> {
    T[] list;
    int capacity;

    public List() {
        this.capacity = 10;
        this.list = (T[]) new Object[capacity];
    }
    public List(int capacity) {
        this.capacity = capacity;
        this.list = (T[]) new Object[capacity];
    }
    public int size() {
        int count = 0;
        for(int i = 0; i < this.list.length; i++) {
            if(this.list[i] != null) {
                count++;
            }
        }
        return count;
    }
    public int getCapacity() {
        return list.length;
    }
    public void add(T data) {
        int index = size();
        if (index == this.list.length) {
            capacity *= 2;
            T[] tempList = (T[]) new Object[capacity];
            for (int i = 0; i < this.list.length; i++) {
                tempList[i] = this.list[i];
            }
            this.list = tempList;
        }
        this.list[index] = data;
    }

    public T get(int index) {
        return this.list[index];
    }
    public void remove(int index) {
        if (size() > this.getCapacity() ) {
            return;
        }
        else {
            T[] tempList = (T[]) new Object[getCapacity()];
            for(int i = 0; i < this.size(); i++) {
                if(i != index) {
                    tempList[i] = this.list[i];
                }
                else {
                    tempList[i] = this.list[i+1];
                }
            }
            this.list = tempList;
        }
    }
    public void set(int index, T data) {
        if(index == this.size()) {
            return;
        }
        else {
        this.list[index] = data;
        }
    }
    public String toString() {
        String str = "";
        for(int i = 0; i < this.size(); i++) {
            if (this.list[i + 1] == null) {
                str += this.list[i];
            }
            else if(this.list[i] != null) {
                str += (this.list[i] + ",");
            }
        }
        return str;
    }
    public int indexOf(T data) {
        for(int i = 0; i < this.size(); i++) {
            if(data == this.list[i]) {
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(T data) {
        for(int i = this.list.length - 1; i > 0; i--) {
            if(data == this.list[i]) {
                return i;
            }
        }
        return -1;
    }
    public boolean isEmpty() {
        if (this.size() > 0) {
            return false;
        }
        else {
            return true;
        }
    }
    public T[] toArray() {
        T[] newArr = (T[]) new Object[capacity];
        newArr = this.list;
        return newArr;
    }
    public void clear() {
        for(int i = 0; i < this.list.length; i++) {
            this.list[i] = null;
        }
    }
    public List<T> sublist(int start, int finish) {
        List<T> newList = new List<>();
        for (int i = start; i <= finish; i++) {
            newList.list[i] = this.list[i];

        }
        return newList;
    }
    public boolean contains(T data){
        for (T value : this.list){
            if(data == value)
                return true;
        }
        return false;
    }
}