package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer idDeudor;
        String tipoDocumento;
        String documento;
        String nombre;
        String apellidos;
        String telefonoMOvil;
        String telefonoFijo;
        String direccion;
        Integer idFiador;
        String nombresFiador;
        String documentoFiador;
        Double valorBrutoMoto;
        Double valorTotalMoto;

        Boolean tieneLicenciaElConductor;
        String tipoDeCompra;

        Scanner leer = new Scanner(System.in);

        //PROCESO

        System.out.println("Cuenta usted con licencia?");
        tieneLicenciaElConductor = leer.nextBoolean();


        //PRIMERA PREGUNTA O DECISION

        if (tieneLicenciaElConductor == true) {
            System.out.println("Nombre cliente");
            nombre = leer.nextLine();

            System.out.println("Apellidos Clientes");
            apellidos = leer.nextLine();

            System.out.println("Tipo Documento:");
            tipoDocumento = leer.nextLine();

            System.out.println("Numero Documento:");
            documento = leer.nextLine();

            System.out.println("Telefono Movil:");
            telefonoMOvil = leer.nextLine();

            System.out.println("Telefono Fijo:");
            telefonoFijo = leer.nextLine();

            System.out.println("Direccion");
            direccion = leer.nextLine();

            System.out.println("Documento Fiador");
            documentoFiador = leer.nextLine();

            System.out.println("Nombres Fiador");
            nombresFiador = leer.nextLine();

            System.out.println("Nuestras Motocicles");
            System.out.println("1. Yamaha SZR-125---$9000000");
            System.out.println("2. Yamaha CRIPTON-FI---$8000000");
            System.out.println("3. Yamaha XTZ 125-$10500000");
            System.out.println("4. Yamaha MT10-$72500000");
            System.out.println("3. Yamaha NMAX 300-$34000000");

            Integer motoSeleccionada;
            System.out.println("Digite la motocicleta deseada");
            motoSeleccionada=leer.nextInt();
            Double valorMoto=0.0;
            if (motoSeleccionada==1){
            valorMoto=9000000.0;

            } else if (motoSeleccionada==2){
            valorMoto=10500000.0;

            } else if (motoSeleccionada==3){
            valorMoto=10500000.0;

            } else if (motoSeleccionada==4){
            valorMoto=72500000.0;

            } else if (motoSeleccionada==5){
            valorMoto=34000000.0;
            }else{
                System.out.println("Moto Invalida");

            }
            System.out.println("Usuario digite /credito o /contado para continuar su compra");
            leer.nextLine();
            tipoDeCompra = leer.nextLine().toLowerCase();

            if (tipoDeCompra.equals("credito")) {
                double porcentajecredito;
                System.out.println("ingresa el porcentaje a financiar");
                porcentajecredito = leer.nextDouble();
                if (porcentajecredito == 1.0) {
                    Double valorIntereses = 0.25;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);

                } else if (porcentajecredito == 0.7) {
                    Double valorIntereses = 0.15;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);

                } else if (porcentajecredito == 0.5) {
                    Double valorIntereses = 00.7;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);

                }else{


                }
            } else {
                System.out.println("Apreciado usuario, no podemos continuar la");
                System.out.println("lo invitamos a transmitar su licencia, vuelva pronto...");
            }


        }
    }
}
