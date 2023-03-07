import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.TreeMap;


class UserFactory {


    class UserLinked implements User {
        LinkedHashMap<String, ArrayList<String>> colectionLinked = new LinkedHashMap<>();
    }

    class UserTree implements User {
        TreeMap<String, ArrayList<String>> colectionTree= new TreeMap<>();
    }

    class UserHash implements User {
        HashMap colectionHash = new HashMap<String,ArrayList<String>>();
    }

    public User crearUsuario(String tipo) {
        if (tipo.equalsIgnoreCase("linked")) {
            return new UserLinked();
        } else if (tipo.equalsIgnoreCase("tree")) {
            return new UserTree();
        } else if (tipo.equalsIgnoreCase("hash")) {
            return new UserHash();
        } else {
            throw new IllegalArgumentException("Tipo de usuario no soportado");
        }
    }
}
