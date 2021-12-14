import java.util.Arrays;

public class Collection3000 <E>{
    public E[] field;

    public Collection3000(E[] data){
        field = data;
    }

    public void setField(E[] field) {
        this.field = field;
    }

    public E[] getField() {
        return field;
    }

    @Override
    public String toString() {
        return "Collection3000: " + Arrays.toString(field);
    }
}