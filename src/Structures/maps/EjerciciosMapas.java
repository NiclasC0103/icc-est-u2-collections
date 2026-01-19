package Structures.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjerciciosMapas {
    public Map<Integer, Integer> contarDuplicados(List<Integer> list){
        Map<Integer, Integer> conteo = new HashMap<>();
        for (Integer num : list) {
            conteo.put(num, conteo.getOrDefault(num, 0) + 1);
        }
        return conteo;
    }

    public Integer primerNoDuplicado(List<Integer> list){
        Map<Integer, Integer> conteo = new HashMap<>();
        for (Integer num : list) {
            conteo.put(num, conteo.getOrDefault(num, 0) + 1);
        }
        for (Integer num : list) {
            if (conteo.get(num) == 1) {
                return num;
            }
        }
        return null;
    }

    public void rankingPuntajes(List<String[]> list){
        Map<String, Integer> puntajes = new HashMap<>();
        for (String[] registro : list) {
            String nombre = registro[0];
            int puntaje = Integer.parseInt(registro[1]);
            puntajes.put(nombre, Math.max((puntajes.getOrDefault(nombre, 0)), puntaje));
        }

        for (String key : puntajes.keySet()){
            System.out.println(key + "->" + puntajes.get(key));
        }
    }


}
