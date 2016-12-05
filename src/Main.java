import java.util.ArrayList;

/**
 * Created by Bambu on 16/11/2016.
 */
public class Main {
    public static void main(String[] pps){
        System.out.println("Clave de Prevencion ----------------------------------------------");
        ClaveDePrevencion parceoCadena = new ClaveDePrevencion();
        parceoCadena.claveDePrevencion("02780180018102820283018401850186",4,2,2);
        System.out.println("Persona Relacionada ----------------------------------------------");
        ClaveDePrevecionPersonaRealacionada personaRealacionada = new ClaveDePrevecionPersonaRealacionada();
        personaRealacionada.claveDePrevencionPersonaRelacionada("02780180018102820283018401850186",4,2,2);
        System.out.println("Clave de Prevención Impugnada -------------------------------------");
        ClaveDePrevencionImpugnada claveDePrevencionImpugnada =  new ClaveDePrevencionImpugnada();
        claveDePrevencionImpugnada.claveDePrevencionPersonaRelacionada("0179",4,2,2);
        System.out.println("Relacion Impugnada ------------------------------------------------");
        ClaveDePrevecionPersonaRealacionadaImpugnada claveRalacionadaImpugnada = new ClaveDePrevecionPersonaRealacionadaImpugnada();
        claveRalacionadaImpugnada.claveDePrevecionPersonaRealacionadaImpugnada("0179",4,2,2);
        System.out.println("Prevencion Hawk ----------------------------------------------------");
        PrevencionHawk prevencionHawk =  new PrevencionHawk("4-ORC-ACD(09-07)-000171/2009-COA-SALTILLO CIV");
        System.out.println(prevencionHawk);
        System.out.println("Historico de Pagos -------------------------------------------------");
        HistoricoDePagos historicoDePagos = new HistoricoDePagos();
            for (String pago: historicoDePagos.paceData("111111111321111143211111","25052015")){
                System.out.println(pago);
            }
        System.out.println("Hitorico de Dias ----------------------------------------------------");
        HistorialDeDias historialDeDias = new HistorialDeDias();
            for (String dia:historialDeDias.paceData("000250224195163125097068042015000000","25012015")){
                System.out.println(dia);
            }
        System.out.println("CALIFICACION DE CARTERA ----------------------------------------------------");
        CalificacionCartera calificacionCartera = new CalificacionCartera();
            for (String calificacion:calificacionCartera.getData("01A102B1")){
                System.out.println(calificacion);
            }
    }
}
