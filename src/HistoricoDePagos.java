import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Bambu on 22/11/2016.
 */
public class HistoricoDePagos {
    private String meses[] = {"Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dic"};
    private String razones[] = {
            "Cuenta al corriente, 0 días de atraso de su fecha límite de pago.",
            "Cuenta con atraso de 1 a 29 días de su fecha límite de pago.",
            "Cuenta con atraso de 30 a 59 días de su fecha límite de pago.",
            "Cuenta con atraso de 60 a 89 días de su fecha límite de pago.",
            "Cuenta con atraso de 90 a 119 días de su fecha límite de pago.",
            "Cuenta con atraso de 120 a 179 días de su fecha límite de pago.",
            "Cuenta con atraso de 180 días o más de su fecha límite de pago."};


    public HistoricoDePagos(){
    }

    /**
     * @param data
     * @param startDate se tiene que resivir en el Formato DDMMAAAA
     */

    public ArrayList<String> paceData(String data, String startDate){
        ArrayList<String> datos = new ArrayList();
        try {
           if (data.length() != 24) {
               System.err.println("La Cadena de Historico de Pagos no cuenta con los  24 Caracteres");
               return datos;
           } else {
               int mes = Integer.parseInt(startDate.substring(2,4));
               int anio = Integer.parseInt(startDate.substring(4,8));
               for (int i=0;i<data.length();i++){
                   if (mes <= 0){
                       mes = 11;
                       anio--;
                   }else{
                       mes--;
                   }
                   datos.add(getDate(anio,mes)+" "+getRazon(Integer.parseInt(data.charAt(i)+"")));
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

    private String getRazon(int num){
        String razon = "El numero "+num+" no corresponde al alguna opción";
        if (num<0||num>razones.length){

        }else {
            razon = razones[num];
        }
        return razon;
    }
}
