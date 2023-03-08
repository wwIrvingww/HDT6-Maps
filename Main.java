import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inicializacion de variables
        UserFactory factory = new UserFactory();
        User user;
        Categories categories = new Categories();
        int option;
        int categorie;
        String producto;
        String exist;
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
        System.out.println(user.getClass());


        //Selecciona a la categoria a la que desea ingresar el producto
        System.out.println("-\n---Seleccione la categoria a la que desea agregar el producto----\n1.Mueble de terraza \n2.Sillones de masaje\n3.Bebidas" +
                "\n4.Condimentos \n5.Frutas \n6.Carnes \n7.Lacteos");
        categorie = sc.nextInt();

        //Selecciona el producto que desea ingresar
        System.out.println("Ingrese el nombre del producto");
        producto = sc.nextLine();
        producto = sc.nextLine();

        producto = categories.converter(producto);


        System.out.println(producto);



        //verifica si el producto existe
        exist = categories.getCategorie(producto);
        System.out.println(exist);
        System.out.println(categories.addProduct(categorie,producto,exist,user,type));

















    }

}
