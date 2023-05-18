/**
 * Codigo que simula el inventario de una tienda.
 * Author: Irving Acosta 22781
 * Catedrático: Pablo Godoy
 * Auxiliar: Cristian Laynez
 */

import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Categories categorias = new Categories();
        categorias.leerArchivo("ListadoProducto.txt");

        Map<String, List<String>> categoriasMap = categorias.obtenerCategoriasMap();

        for (Map.Entry<String, List<String>> entry : categoriasMap.entrySet()) {
            String categoria = entry.getKey();
            List<String> productos = entry.getValue();

            System.out.println("Categoría: " + categoria);
            System.out.println("Productos:");
            for (String producto : productos) {
                System.out.println(producto);
            }
            System.out.println();
        }




        /**
        //Inicializacion de variables
        UserFactory factory = new UserFactory();
        User user;
        Categories categories = new Categories();
        categories.leerArchivo("ListadoProducto.txt");
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

        System.out.println("Ingrese una opcion: \n1.Agregar producto\n2.Mostrar categoría de un producto\n3.Mostrar datos de un producto\n4.Mostrar los datos del producto (ordenadas por tipo)" +
                "\n5.Mostrar el producto y la categoría de todo el inventario\n6.Mostrar el producto y la categoría existentes, ordenadas por tipo.\n7.Salir ");
        int option2 = sc.nextInt();
        while (option2 != 7){
            switch (option2){
                case 1:
                    //Selecciona a la categoria a la que desea ingresar el producto
                    System.out.println("-\n---Seleccione la categoria a la que desea agregar el producto----\n1.Mueble de terraza \n2.Sillones de masaje\n3.Bebidas" +
                            "\n4.Condimentos \n5.Frutas \n6.Carnes \n7.Lacteos");
                    categorie = sc.nextInt();

                    //Selecciona el producto que desea ingresar
                    System.out.println("Ingrese el nombre del producto");
                    producto = sc.nextLine();
                    producto = sc.nextLine();

                    producto = categories.converter(producto);

                    //verifica si el producto existe
                    exist = categories.getCategorie(producto);
                    //Agrega el producto
                    System.out.println(categories.addProduct(categorie,producto,exist,user,type));

                    System.out.println("Ingrese una opcion: \n1.Agregar producto\n2.Mostrar categoría de un producto\n3.Mostrar datos de un producto\n4.Mostrar los datos del producto (ordenadas por tipo)" +
                            "\n5.Mostrar el producto y la categoría de todo el inventario\n6.Mostrar el producto y la categoría existentes, ordenadas por tipo.\n7.Salir ");
                    option2 = sc.nextInt();

                case 2:
                    //Selecciona el producto
                    System.out.println("Ingrese el nombre del producto");
                    producto = sc.nextLine();
                    producto = sc.nextLine();
                    producto = categories.converter(producto);


                    System.out.println(categories.getCategorie(producto));

                    System.out.println("Ingrese una opcion: \n1.Agregar producto\n2.Mostrar categoría de un producto\n3.Mostrar datos de un producto\n4.Mostrar los datos del producto (ordenadas por tipo)" +
                            "\n5.Mostrar el producto y la categoría de todo el inventario\n6.Mostrar el producto y la categoría existentes, ordenadas por tipo.\n7.Salir ");
                    option2 = sc.nextInt();

                case 3:
                    //Selecciona el producto
                    System.out.println("Ingrese el nombre del producto");
                    producto = sc.nextLine();
                    producto = sc.nextLine();
                    producto = categories.converter(producto);

                    System.out.println(categories.dateProduct(producto,user));


                    System.out.println("Ingrese una opcion: \n1.Agregar producto\n2.Mostrar categoría de un producto\n3.Mostrar datos de un producto\n4.Mostrar los datos del producto (ordenadas por tipo)" +
                            "\n5.Mostrar el producto y la categoría de todo el inventario\n6.Mostrar el producto y la categoría existentes, ordenadas por tipo.\n7.Salir ");
                    option2 = sc.nextInt();

                case 4:
                    //Selecciona el producto
                    System.out.println("Ingrese el nombre del producto");
                    producto = sc.nextLine();
                    producto = sc.nextLine();
                    producto = categories.converter(producto);

                    System.out.println(categories.dateProduct(producto,user));

                    System.out.println("Inventario ");

                case 5:
                    //Selecciona el producto
                    System.out.println("Ingrese el nombre del producto");
                    producto = sc.nextLine();
                    producto = sc.nextLine();
                    producto = categories.converter(producto);

                    System.out.println("El producto es: " + producto);
                    // Imprimir el nombre de cada lista y sus elementos
                    System.out.println("MueblesTerraza: ");categories.printCat(user.getColection().MueblesTerraza);
                    System.out.println("SillonesMasaje: ");categories.printCat(user.getColection().SillonesMasaje);
                    System.out.println("Bebidas: ");categories.printCat(user.getColection().Bebidas);
                    System.out.println("Condimentos: ");categories.printCat(user.getColection().Condimentos);
                    System.out.println("Frutas: ");categories.printCat(user.getColection().Frutas);
                    System.out.println("Carnes: ");categories.printCat(user.getColection().Carnes);
                    System.out.println("Lacteos: ");categories.printCat(user.getColection().Lacteos);



            }
        }*/
    }
}
