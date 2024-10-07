
import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class GeneradorHistorial {
    public String MonedaBaseTarget;
    public Double valor;
    public Double conversionValor;
    public FileWriter archivoHistorial;
    {
        try {
            archivoHistorial = new FileWriter("Historial"+".txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void guardarTxt(String MonedaBaseTarget, Double valor, Double conversionValor) throws IOException {

        archivoHistorial.write("Conversion: "+MonedaBaseTarget+" "+"El valor: "+String.valueOf(valor)+" "+"Conversion resultado ==: "+conversionValor+" Insert_Time: "+java.time.LocalTime.now()+"\n");
    }
    public void cerrarTxt() throws IOException{
        archivoHistorial.close();
    }


    public void leerTxt(){
        System.out.println("Ultimas conversiones fueron: \n");
        String filePath = "C:/Users/sir_l/IdeaProjects/DivisasConvertApp/Historial.txt";  // Specify the file path

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Un error ocurrio mienrtas se leia el archivo...: " + e.getMessage());
        }
    }
}