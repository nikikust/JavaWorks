public class Student {
    public int idNumber = 0;
    public String name = "";

    public Student(int id, String name) {
        this.idNumber = id;
        this.name = name;
    }
    public Student() {
        this.idNumber = 0;
        this.name = "";
    }

    public static void insertionSort(Student[] Arr){
        for (int i = 1; i < Arr.length; i++){
            Student cur = Arr[i];
            int prev = i - 1;

            while (prev >= 0 && Arr[prev].idNumber > cur.idNumber)
                Arr[prev + 1] = Arr[prev--];

            Arr[prev + 1] = cur;
        }
    }

    public static void merge(Student[] array, int left, int mid, int right) {
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        Student leftArray[] = new Student [lengthLeft];
        Student rightArray[] = new Student [lengthRight];

        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left+i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid+i+1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right + 1; i++) {
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex].idNumber < rightArray[rightIndex].idNumber) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    public static void mergeSort(Student[] array, int left, int right) {
        if (right <= left) return;
        int mid = (left+right)/2;
        mergeSort(array, left, mid);
        mergeSort(array, mid+1, right);
        merge(array, left, mid, right);
    }

    public String toString() {
        return "#" + idNumber + ") " + name;
    }
}