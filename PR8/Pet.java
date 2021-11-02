import java.util.*;


public  class Pet {
    String name = "";

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args)
    {
        Map<String, Pet> HMap = new HashMap<String, Pet>();

        Pet p1 = new Cat("Cat 1");
        Pet p2 = new Cat("Cat 2");
        Pet p3 = new Owl("Owl 1");
        Pet p4 = new Dog("Dog 1");
        Pet p5 = new Dog("Dog 2");
        Pet p6 = new Dog("Owl 2");

        HMap.put(p1.name, p1);
        HMap.put(p2.name, p2);
        HMap.put(p3.name, p3);
        HMap.put(p4.name, p4);
        HMap.put(p5.name, p5);

        for (Map.Entry<String, Pet> entry : HMap.entrySet()) {
            System.out.printf("Key: %s - Value: %s\n", entry.getKey(), entry.getValue().name);
        }
        HMap.put(p6.name, p6);

        main2();
    }

    public static void main2()
    {
        Map<Integer, Integer> Ints = new HashMap<Integer, Integer>();
        Integer num;
        System.out.print("Len: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        while(num-->0)
        {
            Integer num2 = (int)(Math.random()*10);
            if (Ints.containsKey(num2))
            {
                Ints.put(num2, Ints.get(num2)+1);
            }
            else
            {
                Ints.put(num2, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : Ints.entrySet()) {
            System.out.printf("Number: %d - Amount: %d\n", entry.getKey(), entry.getValue());
        }
    }
}


