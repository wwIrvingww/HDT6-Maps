import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.TreeMap;


class UserFactory {

    //LinkedMap//
    class UserLinked implements User {

        Colection colection = new Colection();
        LinkedHashMap<String, Colection> colectionLinked = new LinkedHashMap<>();
        public LinkedHashMap<String, Colection> getColectionLinked() {
            return colectionLinked;
        }

        @Override
        public Colection getColection() {
            return colection;
        }



        @Override
        public TreeMap<String, Colection> getColectionTree() {
            return null;
        }

        @Override
        public HashMap<String, Colection> getColectionHash() {
            return null;
        }
    }
    /*
    ----------------------------------------------------------------------------------------------------------------
     */








    //TreeMap
    class UserTree implements User {
        Colection colection = new Colection();

        TreeMap<String, Colection> colectionTree= new TreeMap<>();

        public TreeMap<String, Colection> getColectionTree() {
            return colectionTree;
        }
        @Override
        public Colection getColection() {
            return colection;
        }



        @Override
        public HashMap<String, Colection> getColectionHash() {
            return null;
        }


        @Override
        public LinkedHashMap<String, Colection> getColectionLinked() {
            return null;
        }

    }
    //HashMap
    class UserHash implements User {

        Colection colection = new Colection();

        HashMap colectionHash = new HashMap<String,Colection>();

        public HashMap<String, Colection> getColectionHash() {
            return colectionHash;
        }

        @Override
        public Colection getColection() {
            return colection;
        }


        @Override
        public LinkedHashMap<String, Colection> getColectionLinked() {
            return null;
        }
        @Override
        public TreeMap<String, Colection> getColectionTree() {
            return null;
        }


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
