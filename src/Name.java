import java.util.Scanner;

public class Name {

    String[] name = new String[5];

    void setFiveName(){

        this.name = name;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 5 imion:");
        name[0] = scanner.nextLine();
        name[1] = scanner.nextLine();
        name[2] = scanner.nextLine();
        name[3] = scanner.nextLine();
        name[4] = scanner.nextLine();
    }

        void getFiveName() {

        System.out.println("Cześć " + name[4]);
        System.out.println("Cześć " + name[3]);
        System.out.println("Cześć " + name[2]);
        System.out.println("Cześć " + name[1]);
        System.out.println("Cześć " + name[0]);
    }


}
