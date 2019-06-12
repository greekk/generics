package DynamicArray;

import java.util.Arrays;
import java.util.Objects;

public class DynamicGenericArray<T> {
    private T[] data_store;
    private int size;

    public DynamicGenericArray(int size ){
        this.size = size;
        this.data_store =  (T[])new Object[this.size];
    }

    private void augmentingStore(){
        int length = this.size * 2;
        T[] tmp_store = (T[])new Object[length];
        int i = 0;
        for (T item: this.data_store) {
            tmp_store[i] = item;
            i++;
        }
        this.size = tmp_store.length;
        this.data_store = tmp_store;
    }

    public T getData(int key){
        return this.data_store[key];
    }

    public void insertData(T value){
        int i = 0;
        for (;!Objects.isNull(this.data_store[i]) && i < this.size;) {
            i++;
            if(i == this.size)
                this.augmentingStore();
        }

        this.data_store[i] = value;
    }

    public int getSize(){
        return this.size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DynamicGenericArray<?> that = (DynamicGenericArray<?>) o;
        return size == that.size &&
                Arrays.equals(data_store, that.data_store);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(data_store);
        return result;
    }
}
