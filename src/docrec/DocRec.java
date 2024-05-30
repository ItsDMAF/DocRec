package docrec;

import java.util.Scanner;

public class DocRec {
    
    static Scanner dmaf = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        Potencia y proposito general:
        Ayudar a los doctores a mantener un record virutal 
        de la informacion de sus pacientes para poder accender y 
        mantener informacion con un mejor nivel de organicacion.
        
        Mi prioridad es ayudar a la gente,ayudando a los doctores
        mantener al dia la informacion de los pacientes 
         */
        /*
        -Nombre
        -Edad
        -Sexo
        -Lugar de Residencia
        -Telefono
        -Sintomas Principales (Por que causa visita)
        Historia de la enfermedad actual (Describe sus
        sintomas, desde cuando, por ejemplo: como es el dolor
        si se irradia a otros lado, si tiene atenuantes o 
        exacervantes etc.)
        -Si hay otros sintomas
        -Antecedentes personales patologicos (o se enfermedades
        de las que padece, desde cuanfo y si toma medicamentos y cuales)
        -Antecedentes  familiares (  si  sus padres  , hnos   o abuelos 
        padecen de alguna enfermedad como diabetes  hipertension  
        cáncer etc.  )
        -Antecedentes alergicos(  si el paciente padece   de alergia 
        a algún medicamento o alimento)
        -Antecedentes  Hospitalarios y quirúrgicos  ( si     
        ha estafó hospitalizado   y porque , si lo han 
        operado   cuando y de que)
        - Se le toman sus  signos vitales (   presion arterial , 
        frecuencia cardiaca , pulso   ,, saturacion  de oxígeno, 
        peso  , talla,   )
        - Su examen fisico (se revisa al px)
        -Diagnostico
        - Y de acuerdo al diagnostico se le indican examenes de 
        lab o y otros tratamientos famacologicos
         */
        int opcion;
        do {
            System.out.println("1 <- ");
            System.out.println("2 <- ");
            System.out.println("3 <- ");
            System.out.println("Ingrese su opcion: ");
            opcion = dmaf.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("");
                    break;
//------------------------------------------------------------------------------
                case 2:
                    System.out.println("");
                    break;
//------------------------------------------------------------------------------
                case 3:
                    System.out.println("");
                    break;
//------------------------------------------------------------------------------
                default:
                    System.out.println("");
                    break;
            }
        } while (opcion != 0);
    }
}
