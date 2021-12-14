import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CustomException extends Exception{
    public CustomException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }

    public static void main(String[] args) throws CustomException {
        int i = 0;

        HashMap<Integer, String> Names = new HashMap<>();
        Names.put(++i, "Andrey");
        Names.put(++i, "Andy");
        Names.put(++i, "Bob");
        Names.put(++i, "Billy");
        Names.put(++i, "Emily");
        Names.put(++i, "Jack");
        Names.put(++i, "John");
        Names.put(++i, "Nikita");

        Scanner scanner = new Scanner(System.in);

        int id;
        String name;

        System.out.print("Name: ");
        name = scanner.nextLine();

        System.out.print("ID: ");
        id = scanner.nextInt();

        try {
            if (Names.get(id).equals(name))
                System.out.println("All OK!");
            else
                throw new CustomException("Wrong info", null);
        }
        catch (java.lang.NullPointerException ex) {
            throw new CustomException("Wrong info", null);
        }

        scanner.close();
    }
}
