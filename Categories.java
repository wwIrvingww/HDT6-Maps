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
        MueblesTerraza.add("Silla");
        MueblesTerraza.add("Mesas de jardin" );
        MueblesTerraza.add("Sillas de jardin");
        MueblesTerraza.add("Conjuntos mesas y sillas de jardín");
        MueblesTerraza.add("Mesas de Ping Pong exteriores");

        SillonesMasaje = new ArrayList<String>();
        SillonesMasaje.add("Cojines y colchonetas de masaje");
        SillonesMasaje.add("Sillones relax y sofás de masajes");
        SillonesMasaje.add("Sillones de masajes avanzados");
        SillonesMasaje.add("Sofás camas");

        Bebidas = new ArrayList<String>();
        Bebidas.add("Cerveza tibetana Barley");
        Bebidas.add("Té frio");
        Bebidas.add("Coca cola 1 litro");
        Bebidas.add("Coca cola 2 litros");

        Condimentos = new ArrayList<String>();
        Condimentos.add("Sirope de regaliz");
        Condimentos.add("Especies Cajun del chef");
        Condimentos.add("Mezcla Gumbo del chef");

        Frutas = new ArrayList<String>();
        Frutas.add("Peras secas");
        Frutas.add("Pasas");
        Frutas.add("Manzana roja");
        Frutas.add("Manzana verde");

        Carnes = new ArrayList<String>();
        Carnes.add("Res");
        Carnes.add("Pollo");
        Carnes.add("Cerdo");
        Carnes.add("Camarones");
        Carnes.add("Pescados");

        Lacteos = new ArrayList<String>();
        Lacteos.add("Queso de cabra");
        Lacteos.add("Queso Manchego");
        Lacteos.add("Leche descremada");
        Lacteos.add("Leche deslactosada");
        Lacteos.add("Leche entera");

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
        return "";

    }

}
