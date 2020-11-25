package Juanraz89.CalculadoraDescarga;
import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.font.NumericShaper;
import java.util.concurrent.TimeUnit;

public class CalculadoraDescargaMain {

    public static void main(String[] args) {


        try {

            String VelocidadDescarga = JOptionPane.showInputDialog(null, "Cual es tu velocidad de descarga en megabits? Si no lo sabes www.speedtest.com. ");

            String PreguntarTipoPeso = JOptionPane.showInputDialog(null, "Escribe el tipo de tamaño del archivo de esta forma (TB, GB, MB, KB) ");


            double LongVelocidadDescargaMegaBits = Double.parseDouble(VelocidadDescarga);
            double LongVelocidadDescarga = LongVelocidadDescargaMegaBits / 8;


            if (PreguntarTipoPeso.equalsIgnoreCase("TB")) {


                JOptionPane.showMessageDialog(null, "Has seleccionado el tipo de peso en TeraBits. ");
                String PesoArchivoTB = JOptionPane.showInputDialog(null, "Escribe el tamaño de peso en TeraBits. ");

                long IntPesoArchivoTB = Integer.parseInt(PesoArchivoTB);
                long TBGB = IntPesoArchivoTB * 1024;
                long TBMB = TBGB * 1024;

                double ResultadoTB = TBMB / LongVelocidadDescarga;

                int ResultadoHoras = (int) TimeUnit.SECONDS.toHours((long) ResultadoTB);
                long ResultadoTBMinutos = TimeUnit.SECONDS.toMinutes((long)ResultadoTB) - (TimeUnit.SECONDS.toHours((long)ResultadoTB) * 60);
                long ResultadoTBSegundos = TimeUnit.SECONDS.toSeconds((long)ResultadoTB) - (TimeUnit.SECONDS.toMinutes((long)ResultadoTB) * 60);


                String ResultadoTiempoTB = "Te quedan " + ResultadoHoras + " Horas, " + ResultadoTBMinutos + " Minutos y " + ResultadoTBSegundos + " Segundos.";
                JOptionPane.showMessageDialog(null, "Te queda este tiempo para que se descargue el archivo:\n " + ResultadoTiempoTB + "\n Su velocidad de descarga actual es de "+LongVelocidadDescarga+ " MegaBits por segundo");


            } else if (PreguntarTipoPeso.equalsIgnoreCase("GB")) {

                JOptionPane.showMessageDialog(null, "Has seleccionado el tipo de peso en GigaBits. ");
                String PesoArchivoGB = JOptionPane.showInputDialog(null, "Escribe el tamaño de peso en GigaBits. ");
                long IntPesoArchivoGB = Long.parseLong(PesoArchivoGB);

                long GBMB = IntPesoArchivoGB * 1024;

                double ResultadoGB = GBMB / LongVelocidadDescarga;

                int ResultadoHoras = (int) TimeUnit.SECONDS.toHours((long)ResultadoGB);
                long ResultadoTBMinutos = TimeUnit.SECONDS.toMinutes((long)ResultadoGB) - (TimeUnit.SECONDS.toHours((long)ResultadoGB) * 60);
                long ResultadoTBSegundos = TimeUnit.SECONDS.toSeconds((long)ResultadoGB) - (TimeUnit.SECONDS.toMinutes((long)ResultadoGB) * 60);


                String ResultadoTiempoTB = "Te quedan " + ResultadoHoras + " Horas, " + ResultadoTBMinutos + " Minutos y " + ResultadoTBSegundos + " Segundos. ";
                JOptionPane.showMessageDialog(null, "Te queda este tiempo para que se descargue el archivo:\n " + ResultadoTiempoTB + "\n Su velocidad de descarga actual es de "+LongVelocidadDescarga+ " MegaBits por segundo");


            } else if (PreguntarTipoPeso.equalsIgnoreCase("MB")) {


                JOptionPane.showMessageDialog(null, "Has seleccionado el tipo de peso en MegaBits. ");
                String PesoArchivoMB = JOptionPane.showInputDialog(null, "Escribe el tamaño de peso en MegaBits. ");
                long IntPesoArchivoMB = Long.parseLong(PesoArchivoMB);

                double ResultadoMB = IntPesoArchivoMB / LongVelocidadDescarga;

                int ResultadoHoras = (int) TimeUnit.SECONDS.toHours((long)ResultadoMB);
                long ResultadoTBMinutos = TimeUnit.SECONDS.toMinutes((long)ResultadoMB) - (TimeUnit.SECONDS.toHours((long)ResultadoMB) * 60);
                long ResultadoTBSegundos = TimeUnit.SECONDS.toSeconds((long)ResultadoMB) - (TimeUnit.SECONDS.toMinutes((long)ResultadoMB) * 60);


                String ResultadoTiempoTB = "Te quedan " + ResultadoHoras + " Horas, " + ResultadoTBMinutos + " Minutos y " + ResultadoTBSegundos + " Segundos.";
                JOptionPane.showMessageDialog(null, "Te queda este tiempo para que se descargue el archivo:\n " + ResultadoTiempoTB + "\n Su velocidad de descarga actual es de "+LongVelocidadDescarga+ " MegaBits por segundo");


            } else if (PreguntarTipoPeso.equalsIgnoreCase("KB")) {


                JOptionPane.showMessageDialog(null, "Has seleccionado el tipo de peso en KiloBits. ");
                String PesoArchivoKB = JOptionPane.showInputDialog(null, "Escribe el tamaño de peso en KiloBits. ");
                long IntPesoArchivoKB = Long.parseLong(PesoArchivoKB);
                long PesoArchivoMB = IntPesoArchivoKB / 1024;
                double ResultadoKB = PesoArchivoMB / LongVelocidadDescarga;

                int ResultadoHoras = (int) TimeUnit.SECONDS.toHours((long)ResultadoKB);
                long ResultadoTBMinutos = TimeUnit.SECONDS.toMinutes((long)ResultadoKB) - (TimeUnit.SECONDS.toHours((long)ResultadoKB) * 60);
                long ResultadoTBSegundos = TimeUnit.SECONDS.toSeconds((long)ResultadoKB) - (TimeUnit.SECONDS.toMinutes((long)ResultadoKB) * 60);

                String ResultadoTiempoTB = "Te quedan " + ResultadoHoras + " Horas, " + ResultadoTBMinutos + " Minutos y " + ResultadoTBSegundos + " Segundos.";
                JOptionPane.showMessageDialog(null, "Te queda este tiempo para que se descargue el archivo:\n " + ResultadoTiempoTB + "\n Su velocidad de descarga actual es de "+LongVelocidadDescarga+ " MegaBits por segundo");





            } else {

                JOptionPane.showMessageDialog(null, "Error no has escrito el tipo de peso correctamente, vuelve a probarlo. ");
                main(args);
                return;

            }
        }

        catch (NumberFormatException e){

            JOptionPane.showMessageDialog(null, "Error. Has introducido letras y no numeros, vuelve a intentarlo. ");
            main(args);
            return;


        }



    }}