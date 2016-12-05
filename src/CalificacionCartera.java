import java.util.ArrayList;

/**
 * Created by Bambu on 30/11/2016.
 */
public class CalificacionCartera {

    int tam_cadena;
    int tam_segmento;
    CalificacionCartera(){
        tam_cadena = 8;
        tam_segmento = 4;
    }
    public ArrayList<String> getData(String data){
        ArrayList datosSegmentados = new ArrayList();
        if (data == null){
            System.err.println("La cadena es nulla");
            return datosSegmentados;
        }
        if (data.length()!= tam_cadena){
            System.err.println("La cadena no cuenta con los 8 caracteres");
            return datosSegmentados;
        }

        for (int char_index=0;char_index<data.length()/tam_segmento;char_index++){
            int sg_inicial = char_index * tam_segmento;
            int sg_final = sg_inicial+tam_segmento;
            try {
                String datos = data.substring(sg_inicial,sg_inicial+2)
                        +" Usuarios calificaron al Cliente con : "
                        + data.substring(sg_inicial+2,sg_final);
                datosSegmentados.add(datos);
            }catch (Exception e){
                System.err.println("No se pudo obtener los segementos en la cadena");
                e.printStackTrace();
            }
        }

         return datosSegmentados;
    }


}
