import java.util.*;
public class EmpleadoED_53059113E {
        static final double FACTOR_HORA_EXTRA = 1.2;
        private String nombreComleto, dni;
        private double salarioBasePorHora = 10.56;

     public EmpleadoED_53059113E(String nombreCompleto, String dni) {
        this.nombreComleto = nombreCompleto;
        this.dni = dni;
     }
     public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora *
    FACTOR_HORA_EXTRA;
        salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
     }

     // Este método no lo comentaremos con JavaDoc
     public static void main(String[] args) {
        EmpleadoED_53059113E emp = new EmpleadoED_53059113E("MARCOS SAN ANTONIO SERRANO",
       "53059113E");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreComleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra) + " euros, al hacer " + horasExtra + " horas extra.");
    }
}