import java.util.*;
import java.io.File;

import static java.lang.Math.min;

public class GenericsWorld {
    public static <E> void ArrayToArrayList(E[] a, ArrayList<E> lst) {
        for (E e : a) lst.add(e);
    }

    public static <E> E get(E[] a, int index){
        return a[index];
    }

    public static void getDirectoryList(){
        List<String> dirList = new ArrayList<>();
        File dir = new File(".");

        if (dir.isDirectory()) {
            for (File file : dir.listFiles()) {
                dirList.add(file.getName());
            }
        }

        for (int i = 0; i < min(5, dirList.size()); i++) {
            System.out.println(dirList.get(i));
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3 , 4, 5, 6, 7, 8, 9, 0};
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayToArrayList(arr, arr2);
        System.out.println(arr2);

        Collection3000<Integer> arr3 = new Collection3000<>(arr);
        System.out.println(arr3);

        System.out.println("Value at index 2: " + get(arr, 2) + "\n\nDirectory list:");

        getDirectoryList();
    }
}
