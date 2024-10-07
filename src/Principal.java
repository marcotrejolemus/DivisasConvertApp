import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        String MonedaBaseTarget;
        Double valor=0.0;
        Double conversionValor;
        int opcion=0;

        GeneradorHistorial generador = new GeneradorHistorial();

        while ( opcion != 8) {
            System.out.println("************************************************");
            System.out.println("*** Sea Bienvenido/a al conversor de monedas ***:) ");
            System.out.println("1) Dolar =} Peso Mexicano");
            System.out.println("2) Peso Mexicano =} Dolar");
            System.out.println("3) Dolar =} Real Brasileiro");
            System.out.println("4) Real Brasileiro =} Dolar");
            System.out.println("5) Dolar =} Peso Colombiano");
            System.out.println("6) Peso Colombiano  =}Dolar");
            System.out.println("7) Otra Moneda Base/Moneda Cambio =} USD/MXN");
            System.out.println("8) Salir");
            System.out.println("************************************************");
            System.out.println("Captura opcion:");
            opcion = lectura.nextInt();
            System.out.println("Ingresa el valor de la cantidad que deseas convertir:");

            switch (opcion){
                case 1:
                    try{
                        valor = Double.valueOf(lectura.nextInt());
                        MonedaBaseTarget ="USD/MXN";
                        Moneda moneda = consulta.buscarMoneda(MonedaBaseTarget);
                        conversionValor = valor * Double.valueOf(moneda.conversion_rate());
                        System.out.println("El valor: "+valor + " (USD) " + "corresponde al valor final de =="+ conversionValor +" (MXN)");
                        generador.guardarTxt(MonedaBaseTarget, valor, conversionValor);
                    }catch (NumberFormatException e){
                        System.out.println("Moneda no encontrada" + e.getMessage());
                    }catch (RuntimeException | IOException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicacion");
                    }
                    break;
                case 2:
                    try{
                        valor = Double.valueOf(lectura.nextInt());
                        MonedaBaseTarget ="MXN/USD";
                        Moneda moneda = consulta.buscarMoneda(MonedaBaseTarget);
                        conversionValor = valor * Double.valueOf(moneda.conversion_rate());
                        System.out.println("El valor: "+valor + " (MXN) " + "corresponde al valor final de =="+ conversionValor +" (USD)");
                        generador.guardarTxt(MonedaBaseTarget, valor, conversionValor);
                    }catch (NumberFormatException e){
                        System.out.println("Moneda no encontrada" + e.getMessage());
                    }catch (RuntimeException | IOException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicacion");
                    }
                    break;
                case 3:
                    try{
                        valor = Double.valueOf(lectura.nextInt());
                        MonedaBaseTarget = "USD/BRL";
                        Moneda moneda = consulta.buscarMoneda(MonedaBaseTarget);
                        conversionValor = valor * Double.valueOf(moneda.conversion_rate());
                        System.out.println("El valor: "+valor + " (USD) " + "corresponde al valor final de =="+ conversionValor +" (BRL)");
                        generador.guardarTxt(MonedaBaseTarget, valor, conversionValor);
                    }catch (NumberFormatException e){
                        System.out.println("Moneda no encontrada" + e.getMessage());
                    }catch (RuntimeException | IOException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicacion");
                    }
                    break;
                case 4:
                    try{
                        valor = Double.valueOf(lectura.nextInt());
                        MonedaBaseTarget="BRL/USD";
                        Moneda moneda = consulta.buscarMoneda(MonedaBaseTarget);
                        conversionValor = valor * Double.valueOf(moneda.conversion_rate());
                        System.out.println("El valor: "+valor + " (BRL) " + "corresponde al valor final de =="+ conversionValor +" (USD)");
                        generador.guardarTxt(MonedaBaseTarget, valor, conversionValor);
                    }catch (NumberFormatException e){
                        System.out.println("Moneda no encontrada" + e.getMessage());
                    }catch (RuntimeException | IOException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicacion");
                    }
                    break;
                case 5:
                    try{
                        valor = Double.valueOf(lectura.nextInt());
                        MonedaBaseTarget ="USD/COP";
                        Moneda moneda = consulta.buscarMoneda(MonedaBaseTarget);
                        conversionValor = valor * Double.valueOf(moneda.conversion_rate());
                        System.out.println("El valor: "+valor + " (USD) " + "corresponde al valor final de =="+ conversionValor +" (COP)");
                        generador.guardarTxt(MonedaBaseTarget, valor, conversionValor);
                    }catch (NumberFormatException e){
                        System.out.println("Moneda no encontrada" + e.getMessage());
                    }catch (RuntimeException | IOException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicacion");
                    }
                    break;
                case 6:
                    try{
                        valor = Double.valueOf(lectura.nextInt());
                        MonedaBaseTarget="COP/USD";
                        Moneda moneda = consulta.buscarMoneda(MonedaBaseTarget);
                        conversionValor = valor * Double.valueOf(moneda.conversion_rate());
                        System.out.println("El valor: "+valor + " (COP) " + "corresponde al valor final de =="+ conversionValor +" (USD)");
                        generador.guardarTxt(MonedaBaseTarget, valor, conversionValor);
                    }catch (NumberFormatException e){
                        System.out.println("Moneda no encontrada" + e.getMessage());
                    }catch (RuntimeException | IOException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicacion");
                    }
                    break;
                case 7:
                    try{
                        valor = Double.valueOf(lectura.nextInt());
                        Scanner leer = new Scanner(System.in);
                        System.out.println("Ingresa la moneda ejemplo: USD/MXN");
                        MonedaBaseTarget = leer.nextLine();

                        Moneda moneda = consulta.buscarMoneda(MonedaBaseTarget);
                        conversionValor = valor * Double.valueOf(moneda.conversion_rate()); //MXN/CZK
                        System.out.println("El valor: "+valor + " "+MonedaBaseTarget.substring(0,3)+ " corresponde al valor final de == "+ conversionValor +" "+ MonedaBaseTarget.substring(4,7));
                        generador.guardarTxt(MonedaBaseTarget, valor, conversionValor);
                    }catch (NumberFormatException e){
                        System.out.println("Moneda no encontrada" + e.getMessage());
                    }catch (RuntimeException | IOException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicacion");
                    }
                    break;
            }

        }
        try {
            generador.cerrarTxt();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //leer
        generador.leerTxt();
    }
}
