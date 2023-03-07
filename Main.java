import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inicializacion de variables
        UserFactory factory = new UserFactory();
        User user;
        Categories categories = new Categories();
        int option;
        String type = "";
        Scanner sc = new Scanner(System.in);


        //menu
        System.out.println("-\n---Seleccione la interfaz que desea implementar----\n1.HashMap\n2.TreeMap\n3.LinkedHashMap");
        option = sc.nextInt();
        switch (option){
            case 1:
                type =  "hash";

            case 2:
                type = "tree";

            case 3:
                type = "linked";
        }
        //Implementacion del patron factory
        user = factory.crearUsuario(type);

        





    }

}
