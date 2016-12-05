import java.util.ArrayList;

/**
 * Created by Bambu on 16/11/2016.
 */
public class ClaveDePrevecionPersonaRealacionadaImpugnada {

    public void claveDePrevecionPersonaRealacionadaImpugnada(String cadena,int tam_Segmento,int tam_subseg,int tam_subsegSize){
        ArrayList<String[]> segmentos = new ArrayList<>();
        int noSegmentos =  cadena.length()/tam_Segmento;
        for (int i = 0;i<noSegmentos;i++){
            int inicio = tam_Segmento*i;
            int fin = inicio+tam_Segmento;
            String segmento_parce = cadena.substring(inicio,fin);
            segmentos.add(getSegmentClaveDePrevencion(segmento_parce,tam_subseg,tam_subsegSize));
        }
        printSegmentos(segmentos);
    }

    private String[] getSegmentClaveDePrevencion (String segmento,int subSeg,int segSize){
        String [] arr_Segmento = new String[subSeg];
        for (int k=0;k<subSeg;k++){
            int inicio =segSize*k;
            int fin = inicio+segSize;
            arr_Segmento[k] = segmento.substring(inicio,fin);
        }
        return arr_Segmento;
    }

    private void printSegmentos(ArrayList<String[]> arrayList){
        for(String[] segmento:arrayList){
            System.out.println(segmento[0]+" - "+segmento[1]);
        }
    }
}
