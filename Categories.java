import java.util.ArrayList;
public class Categories {
   ArrayList<String>MueblesTerraza;
   ArrayList<String>SillonesMasaje;
   ArrayList<String>Bebidas;
   ArrayList<String>Condimentos;
   ArrayList<String>Frutas;
   ArrayList<String>Carnes;
   ArrayList<String>Lacteos;

    public Categories(){
        MueblesTerraza = new ArrayList<String>();
        MueblesTerraza.add("silla");
        MueblesTerraza.add("mesasdejardin" );
        MueblesTerraza.add("silladejardin");
        MueblesTerraza.add("conjuntomesasysilladejardin");
        MueblesTerraza.add("mesadepingpongexteriores");

        SillonesMasaje = new ArrayList<String>();
        SillonesMasaje.add("cojinesycolchonetasdemasaje");
        SillonesMasaje.add("sillonesrelaxysofasdemasajes");
        SillonesMasaje.add("sillonesdemasajesavanzados");
        SillonesMasaje.add("sofacama");

        Bebidas = new ArrayList<String>();
        Bebidas.add("cervezatibetanabarley");
        Bebidas.add("tefrio");
        Bebidas.add("cocacola1litro");
        Bebidas.add("cocacola2litros");

        Condimentos = new ArrayList<String>();
        Condimentos.add("siropederegaliz");
        Condimentos.add("especiescajundelchef");
        Condimentos.add("mezclagumbodelchef");

        Frutas = new ArrayList<String>();
        Frutas.add("perassecas");
        Frutas.add("pasas");
        Frutas.add("manzanaroja");
        Frutas.add("manzanaverde");

        Carnes = new ArrayList<String>();
        Carnes.add("res");
        Carnes.add("pollo");
        Carnes.add("cerdo");
        Carnes.add("camarones");
        Carnes.add("pescados");

        Lacteos = new ArrayList<String>();
        Lacteos.add("quesodecabra");
        Lacteos.add("quesomanchego");
        Lacteos.add("lechedescremada");
        Lacteos.add("lechedeslactosada");
        Lacteos.add("lecheentera");

    }

    /**
     * obtiene la categoria de un producto
     * @param producto
     * @return
     */
    public String getCategorie(String producto){

        if (MueblesTerraza.contains(producto)){
            return "MueblesTerraza";
        }
        else if (SillonesMasaje.contains(producto)){
            return "SillonesMasaje";
        }
        else if (Bebidas.contains(producto)){
            return "Bebidas";
        }
        else if (Condimentos.contains(producto)){
            return "Condimentos";
        }
        else if (Frutas.contains(producto)){
            return "Frutas";
        }
        else if (Carnes.contains(producto)){
            return "Carnes";
        }
        else if (Lacteos.contains(producto)){
            return "Lacteos";
        }
        return "no existe";
    }

    /**
     * elimina los espacios en blanco de un string y hace que todos sean minúsculas
     * @param producto
     * @return
     */
    public String converter (String producto){
        int index = producto.indexOf(" "); // buscamos la posición del primer espacio en blanco
        if (index != -1) { // si encontramos un espacio en blanco
            String primeraPalabra = producto.substring(0, index); // tomamos la primera palabra
            String restoCadena = producto.substring(index).replaceAll(" +", ""); // eliminamos los espacios en blanco del resto de la cadena
            producto = primeraPalabra + restoCadena; // unimos las dos partes
            producto = producto.toLowerCase();
        }
        return producto;
    }

    /**
     * agrega un producto a la coleccion del usuario
     * @param categoria
     * @param producto
     * @param exist
     * @param user
     * @param type
     * @return
     */
    public String addProduct(int categoria, String producto, String exist, User user, String type){

        if (exist == "no existe"){
            return "este producto no existe";
        }
        else {
            switch (type){
                case "hash":
                    switch (categoria){
                        case 1:
                            user.getColectionHash().put("MueblesTerraza", user.getColection());
                            user.getColection().MueblesTerraza.add(producto);
                        case 2:
                            user.getColectionHash().put("SillonesMasaje", user.getColection());
                            user.getColection().SillonesMasaje.add(producto);
                        case 3:
                            user.getColectionHash().put("Bebidas", user.getColection());
                            user.getColection().Bebidas.add(producto);
                        case 4:
                            user.getColectionHash().put("Condimentos", user.getColection());
                            user.getColection().Condimentos.add(producto);
                        case 5:
                            user.getColectionHash().put("Frutas", user.getColection());
                            user.getColection().Frutas.add(producto);
                        case 6:
                            user.getColectionHash().put("Carnes", user.getColection());
                            user.getColection().Carnes.add(producto);
                        case 7:
                            user.getColectionHash().put("Lacteos", user.getColection());
                            user.getColection().Lacteos.add(producto);
                    }
                case "tree":
                    switch (categoria){
                        case 1:
                            user.getColectionTree().put("MueblesTerraza", user.getColection());
                            user.getColection().MueblesTerraza.add(producto);
                        case 2:
                            user.getColectionTree().put("SillonesMasaje", user.getColection());
                            user.getColection().SillonesMasaje.add(producto);
                        case 3:
                            user.getColectionTree().put("Bebidas", user.getColection());
                            user.getColection().Bebidas.add(producto);
                        case 4:
                            user.getColectionTree().put("Condimentos", user.getColection());
                            user.getColection().Condimentos.add(producto);
                        case 5:
                            user.getColectionTree().put("Frutas", user.getColection());
                            user.getColection().Frutas.add(producto);
                        case 6:
                            user.getColectionTree().put("Carnes", user.getColection());
                            user.getColection().Carnes.add(producto);
                        case 7:
                            user.getColectionTree().put("Lacteos", user.getColection());
                            user.getColection().Lacteos.add(producto);
                    }
                case "linked":
                    switch (categoria){
                        case 1:
                            user.getColectionLinked().put("MueblesTerraza", user.getColection());
                            user.getColection().MueblesTerraza.add(producto);
                        case 2:
                            user.getColectionLinked().put("SillonesMasaje", user.getColection());
                            user.getColection().SillonesMasaje.add(producto);
                        case 3:
                            user.getColectionLinked().put("Bebidas", user.getColection());
                            user.getColection().Bebidas.add(producto);
                        case 4:
                            user.getColectionLinked().put("Condimentos", user.getColection());
                            user.getColection().Condimentos.add(producto);
                        case 5:
                            user.getColectionLinked().put("Frutas", user.getColection());
                            user.getColection().Frutas.add(producto);
                        case 6:
                            user.getColectionLinked().put("Carnes", user.getColection());
                            user.getColection().Carnes.add(producto);
                        case 7:
                            user.getColectionLinked().put("Lacteos", user.getColection());
                            user.getColection().Lacteos.add(producto);
                    }
            }

            return "se ha agregado exitosamente";
        }

    }


    /**
     * retorna los datos especificos de un producto
     * @param producto
     * @param user
     * @return
     */
    public String dateProduct(String producto, User user){
        String categorie = getCategorie(producto);
        int productos = numProduc(producto, user);

        return "La categoria del producto es: " + categorie + "\n" + "El total del producto es: " + productos;
    }

    /**
     * retorna el numero total que hay de un producto
     * @param producto
     * @param user
     * @return
     */
    public int numProduc(String producto, User user) {
        String categorie = getCategorie(producto);
        int numProduc = 0;


        switch (categorie){
            case "MueblesTerraza":
                numProduc = contArray(user.getColection().MueblesTerraza,producto);

            case "SillonesMasaje":
                numProduc = contArray(user.getColection().SillonesMasaje,producto);

            case "Bebidas":
                numProduc = contArray(user.getColection().Bebidas, producto);

            case "Condimentos":
                numProduc = contArray(user.getColection().Condimentos, producto);

            case "Frutas":
                numProduc = contArray(user.getColection().Frutas, producto);

            case "Carnes":
                numProduc = contArray(user.getColection().Carnes, producto);

            case "Lacteos":
                numProduc = contArray(user.getColection().Lacteos, producto);

        }

        return numProduc;
        }

    /**
     * cuanta cuantas veces se repite un producto en un arraylist
      * @param araarylist
     * @param producto
     * @return
     */
    public int contArray(ArrayList<String> araarylist, String producto){
        int i = 0;
        int totProducto = 0;
        String comparable;
        while (i<araarylist.size()){
            comparable = araarylist.get(i);
            if (comparable == producto){
                totProducto++;
                i++;
            }
            else {i++;}
        }
        return totProducto;
    }

    /**
     * imprime elementos de un arraylist
     * @param arrayList
     */
    public void printCat(ArrayList<String> arrayList) {
        for (String elemento : arrayList) {
            System.out.println(elemento);
        }
    }

}
