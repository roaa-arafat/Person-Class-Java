package w6;

import java.util.Scanner;

public class person_test {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number of persons : ");
        int p = s.nextInt();
        s.nextLine();

        person arr[] = new person[p];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = new person();

            System.out.println("person " + (1 + i));

            System.out.print("Enter Name :");
            String name = s.nextLine();
            arr[i].setName(name);

            System.out.print("Enter Age :");
            int age = s.nextInt();
            arr[i].setAge(age);

            s.nextLine();

        }

        int children = 0;
        int teenagers = 0;
        int adult = 0;

        for (int j = 0; j < arr.length; j++) {
            int age = arr[j].getAge();

            if (age >= 1 && age <= 12) {
                children++;
            } else if (age >= 13 && age <= 17) {
                teenagers++;
            } else if (age >= 18) {
                adult++;
            }
        }

        System.out.println("children = " + children);
        System.out.println("teenagers = " + teenagers);
        System.out.println("adult = " + adult);

    }

}
