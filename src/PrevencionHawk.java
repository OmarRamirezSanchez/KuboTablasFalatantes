/**
 * Created by Bambu on 16/11/2016.
 */
public class PrevencionHawk {
    String tipoJusgado;
    String tipoDeJuicio;
    String estadosProcesales;
    String fechaActualizacion;
    String no_Expediente;
    String anioEmplazamiento;
    String ubicacionJusgado;
    String nombreJusgado;
    //XX-XXX-XXXS
    String examplae = "4-ORC-ACD(09-07)-000171/2009-COA-SALTILLO CIV";

    public PrevencionHawk(String cadena){
        parcerData(cadena);
    }

    public void parcerData(String cadena){
        String data[] = cadena.split("-");
        if (data.length>=8){
            System.err.print("La Cadena No Cuenta con el Formato");
        }else {
            try{
                this.tipoJusgado = data[0];
                this.tipoDeJuicio = data[1];
                this.estadosProcesales = (data[2]+data[3]);
                this.no_Expediente = data[4].split("/")[0];
                this.anioEmplazamiento =  data[4].split("/")[1];
                this.ubicacionJusgado = data[5];
                this.nombreJusgado = data[6];
            }catch (Exception e){
                System.err.println("La Cadena de PrevencionHawk no tiene el formato establecido");
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "PrevencionHawk{" + "\n" +
                "tipoJusgado= " + tipoJusgado + "\n" +
                "tipoDeJuicio= " + tipoDeJuicio + "\n" +
                "estadosProcesales= " + estadosProcesales + "\n" +
                "fechaActualizacion= " + fechaActualizacion + "\n" +
                "no_Expediente= " + no_Expediente + "\n" +
                "anioEmplazamiento= " + anioEmplazamiento + "\n" +
                "ubicacionJusgado= " + ubicacionJusgado + "\n" +
                "nombreJusgado= " + nombreJusgado + "\n" +
                "examplae= " + examplae + "\n" +
                '}';
    }
}

