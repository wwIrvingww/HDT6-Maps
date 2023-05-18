import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Categories {
    private Map<String, List<String>> categoriasMap;

    public Categories() {
        categoriasMap = new HashMap<>();
    }

    public void leerArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("\\|");
                String categoria = partes[0].trim();
                String producto = partes[1].trim();

                categoriasMap.computeIfAbsent(categoria, k -> new ArrayList<>()).add(producto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<String, List<String>> obtenerCategoriasMap() {
        return categoriasMap;
    }


}
