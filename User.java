import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

interface User {

    public Colection getColection();



    public LinkedHashMap<String, Colection> getColectionLinked();


    public TreeMap<String, Colection> getColectionTree();

    public HashMap<String, Colection>  getColectionHash();

}