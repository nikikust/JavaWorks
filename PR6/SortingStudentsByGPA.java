import java.util.Comparator;

public class SortingStudentsByGPA implements Comparable<SortingStudentsByGPA>{
    public String name = "";
    public int score = 0;

    public SortingStudentsByGPA(){}
    public SortingStudentsByGPA(int score, String name){
        this.name = name;
        this.score = score;
    }

    public int compareTo(SortingStudentsByGPA student) {
        return ((this.score - student.score < 0)? 0 : 1);
    }

    public static void quickSort(SortingStudentsByGPA[] Arr, int low, int high) {
        if (Arr.length == 0)
            return;

        if (low >= high)
            return;

        int middle = (low + high) / 2;
        SortingStudentsByGPA base = Arr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (base.compareTo(Arr[i]) == 0)
                i++;

            while (Arr[j].compareTo(base) == 0)
                j--;

            if (i <= j) {
                SortingStudentsByGPA tmp = Arr[i];
                Arr[i++] = Arr[j];
                Arr[j--] = tmp;
            }
        }

        if (low < j)
            quickSort(Arr, low, j);

        if (high > i)
            quickSort(Arr, i, high);
    }

    public String toString() {
        return "#" + score + ") " + name;
    }
}
