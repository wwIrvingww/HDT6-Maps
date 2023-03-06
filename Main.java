import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Categories categories = new Categories();

        int option;
        System.out.println("-\n---Seleccione la interfaz que desea implementar----\n1.HashMap\n2.TreeMap\n3.LinkedHashMap");
        option = sc.nextInt();

        System.out.println("ingrese el producto");
        String producto = sc.next();
        String cat = categories.getCategorie(producto);
        System.out.println("la categoria de su producto es: "+cat);

    }
}
