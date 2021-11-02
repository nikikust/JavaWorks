import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Student[] Arr, Arr3;
        SortingStudentsByGPA[] Arr2;
        int A;

        System.out.print("Введите длину массива: ");
        if (scanner.hasNextInt()) {
            A = scanner.nextInt();
            Arr = new Student[A];
        }
        else {
            System.out.println("Ошибочный символ");
            return;
        }

        System.out.print("> ");
        for (int i = 0; i < A; i++) {
            System.out.print("> ");
            if (scanner.hasNextLine()) {
                Arr[i] = new Student(scanner.nextInt(), scanner.nextLine());
            }
            else {
                System.out.println("Ошибочный символ");
                return;
            }
        }

        // --- //

        System.out.println("Start: ");
        for (int i = 0; i < A; i++) {
            System.out.println(Arr[i]);
        }

        Student.insertionSort(Arr);

        System.out.println("\nSorted by InsertionSort:");
        for (int i = 0; i < A; i++) {
            System.out.println(Arr[i]);
        }

        // --- --- //

        System.out.print("\nВведите длину массива: ");
        if (scanner.hasNextInt()) {
            A = scanner.nextInt();
            Arr2 = new SortingStudentsByGPA[A];
        }
        else {
            System.out.println("Ошибочный символ");
            return;
        }

        System.out.print("> ");
        for (int i = 0; i < A; i++) {
            System.out.print("> ");
            if (scanner.hasNextLine()) {
                Arr2[i] = new SortingStudentsByGPA(scanner.nextInt(), scanner.nextLine());
            }
            else {
                System.out.println("Ошибочный символ");
                return;
            }
        }

        // --- //

        System.out.println("Start: ");
        for (int i = 0; i < A; i++) {
            System.out.println(Arr2[i]);
        }

        SortingStudentsByGPA.quickSort(Arr2, 0, A - 1);

        System.out.println("\nSorted by QuickSort:");
        for (int i = 0; i < A; i++) {
            System.out.println(Arr2[i]);
        }

        // --- //

        System.out.print("Введите длину массива 1: ");
        if (scanner.hasNextInt()) {
            A = scanner.nextInt();
            Arr = new Student[A];
        }
        else {
            System.out.println("Ошибочный символ");
            return;
        }

        for (int i = 0; i < A; i++) {
            System.out.print("> ");
            if (scanner.hasNextLine()) {
                Arr[i] = new Student(scanner.nextInt(), scanner.nextLine());
            }
            else {
                System.out.println("Ошибочный символ");
                return;
            }
        }

        System.out.print("\nВведите длину массива 2: ");
        if (scanner.hasNextInt()) {
            A = scanner.nextInt();
            Arr3 = new Student[A];
        }
        else {
            System.out.println("Ошибочный символ");
            return;
        }

        System.out.print("> ");
        for (int i = 0; i < A; i++) {
            if (scanner.hasNextLine()) {
                Arr3[i] = new Student(scanner.nextInt(), scanner.nextLine());
                System.out.print("> ");
            }
            else {
                System.out.println("Ошибочный символ");
                return;
            }
        }

        // --- //

        System.out.println("Start: ");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }

        System.out.println("Start: ");
        for (int i = 0; i < Arr3.length; i++) {
            System.out.println(Arr3[i]);
        }

        Student[] Arr4 = new Student[Arr.length + Arr3.length];
        System.arraycopy(Arr, 0, Arr4, 0, Arr.length);
        System.arraycopy(Arr3, 0, Arr4, Arr.length, Arr3.length);

        Student.mergeSort(Arr4, 0, Arr4.length - 1);

        System.out.println("\nSorted by MergeSort:");
        for (int i = 0; i < Arr4.length; i++) {
            System.out.println(Arr4[i]);
        }

        scanner.close();
    }
}
