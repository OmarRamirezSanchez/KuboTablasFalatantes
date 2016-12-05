import java.util.ArrayList;

/**
 * Created by Bambu on 30/11/2016.
 */
public class HistorialDeDias {

    private String meses[] = {"Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dic"};
    int tam_segmento, dataLength;



    public HistorialDeDias(){
        tam_segmento = 3;
        dataLength =  36;
    }

    /**
     * @param data
     * @param startDate se tiene que resivir en el Formato DDMMAAAA
     */

    public ArrayList<String> paceData(String data,String startDate){
        ArrayList<String> datos = new ArrayList<>();
        try {
            if (data.length() != dataLength) {
                System.err.println("La Cadena de Historico de Dias no cuenta con los  36 Caracteres");
                return datos;
            } else {
                int mes = Integer.parseInt(startDate.substring(2,4));
                int anio = Integer.parseInt(startDate.substring(4,8));

                for (int i=0;i<(data.length()/tam_segmento);i++){
                    int sb_inicio = i*3;
                    int sb_final = sb_inicio+3;
                    if (mes <= 0){
                        mes = 11;
                        anio--;
                    }else{
                        mes--;
                    }
                    System.out.println("Inicio : "+sb_inicio+ "   Final : "+sb_final);
                    datos.add(getDate(anio,mes)+" "+data.substring(sb_inicio,sb_final));
                }
            }
        }catch (Exception e){
            System.err.println("No se puede parcear el dato");
            e.printStackTrace();
        }
        return datos;
    }

    private String getDate(int year,int mont){
        String dateString = "Fecha Invalida";
        try {
            dateString = meses[mont]+" "+year;
        }catch (Exception e){
            System.err.println("El Mes Seleccionado "+ mont+" No entra dentro del rango Valido");
            e.printStackTrace();
        }
        return dateString;
    }

}


