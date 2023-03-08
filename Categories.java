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

}
