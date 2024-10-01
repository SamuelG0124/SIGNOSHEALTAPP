package org.example;

import org.example.MODELOS.*;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner recogerDatos = new Scanner(System.in);


        Paciente paciente2= new Paciente(1L, "Juan", "Pérez", "O+", "+1234567890", true,
                LocalDateTime.now().of(1990, 5, 20, 0, 0), "Calle 123, Ciudad, País",
                "juan.perez@example.com", "Masculino", 75.0, 1.80,
                "Alergia a la penicilina, cirugía de apendicitis en 2010", 34,
                "María Pérez (hermana)", "+0987654321");



        System.out.println(paciente2);


        Medico medico1 =new Medico();
        Medico medico2 =new Medico(31L, "Carlos", "Gómez", LocalDateTime.of(1985, 3, 15, 0, 0),
                "Masculino", "Avenida 456, Ciudad, País",
                "carlos.gomez@example.com", "+1234567890",
                "M123456", "Pediatría", "Universidad Nacional",
                10, "Hospital Central", true,
                "Lunes a Viernes 8:00 - 16:00");



        System.out.println(medico2);

        Enfermedad enfermedad1 =new Enfermedad();
        Enfermedad enfermedad2 =new Enfermedad(35L, "COVID-19",
                "Enfermedad respiratoria causada por el coronavirus SARS-CoV-2.",
                "Infección por el virus SARS-CoV-2 a través de gotas respiratorias.",
                true, "Aérea y contacto directo.",
                2.0, 97.0,
                "Adultos mayores y personas con condiciones preexistentes.",
                "Ambos géneros, aunque con diferencias en la mortalidad.");

        System.out.println(enfermedad2);

        Medicamento medicamento1 = new Medicamento();
        Medicamento medicamento2 = new Medicamento(132L, "Ibuprofeno", "Ibuprofeno", "400 mg",
                "Tableta", "Laboratorios Ejemplo S.A.",
                "1 tableta cada 8 horas, no exceder 3 tableta al día.",
                "Oral", false, 5.50);


        SignoVital signoVital1 =new SignoVital();
        SignoVital signoVital2 = new SignoVital(51L, LocalDateTime.now(), 72.0,
                120.0, 80.0, 16.0,
                36.5, 98.0, 90.0, 75.0);



        System.out.println(signoVital2);


        System.out.println("Recoleccion de datos desde la consola para paciente");

        Paciente paciente1 =new Paciente();

        System.out.println("Ingrese el ID");
        paciente1.setId(recogerDatos.nextLong());
        recogerDatos.nextLine();

        System.out.println("Ingrese el nombre:");
        paciente1.setNombre(recogerDatos.nextLine());


        System.out.println("Ingrese los apellidos");
        paciente1.setApellido(recogerDatos.nextLine());


        System.out.println("Ingrese el tipo de sangre");
        paciente1.setTipoSangre(recogerDatos.nextLine());


        System.out.println("Ingrese el tipo numero de celular");
        paciente1.setCelular(recogerDatos.nextLine());


        System.out.println("¿Tiene seguro?");
        paciente1.setTieneSeguro(recogerDatos.nextBoolean());


        System.out.println("Ingrese la fecha de nacimiento");
        String fechanacimientostr = recogerDatos.nextLine();
        paciente1.setFechaNacimiento(LocalDateTime.parse(fechanacimientostr));


        System.out.println("Ingrese la direccion");
        paciente1.setDireccion(recogerDatos.nextLine());

        System.out.print("Ingrese el email: ");
        paciente1.setEmail(recogerDatos.nextLine());

        System.out.print("Ingrese el género: ");
        paciente1.setGenero(recogerDatos.nextLine());

        System.out.print("Ingrese el peso (en kg): ");
        paciente1.setPeso(recogerDatos.nextDouble());


        System.out.print("Ingrese la altura (en metros): ");
        paciente1.setAltura(recogerDatos.nextDouble());


        System.out.print("Ingrese el historial médico: ");
        paciente1.setHistorialMedico(recogerDatos.nextLine());

        System.out.print("Ingrese la edad: ");
        paciente1.setEdad(recogerDatos.nextInt());


        System.out.print("Ingrese el contacto de emergencia: ");
        paciente1.setContactoEmergencia(recogerDatos.nextLine());

        System.out.print("Ingrese el número de emergencia: ");
        paciente1.setNumeroEmergencia(recogerDatos.nextLine());




        System.out.println("Recoleccion de datos desde la consola para Medico");


        System.out.print("Ingrese ID: ");
        medico1.setId(recogerDatos.nextLong());
        recogerDatos.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el nombre: ");
        medico1.setNombre(recogerDatos.nextLine());

        System.out.print("Ingrese el apellido: ");
        medico1.setApellido(recogerDatos.nextLine());

        System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
        String fechaNacimientoStr = recogerDatos.nextLine();
        medico1.setFechaNacimiento(LocalDateTime.parse(fechaNacimientoStr + "T00:00:00"));

        System.out.print("Ingrese el género: ");
        medico1.setGenero(recogerDatos.nextLine());

        System.out.print("Ingrese la dirección: ");
        medico1.setDireccion(recogerDatos.nextLine());

        System.out.print("Ingrese el email: ");
        medico1.setEmail(recogerDatos.nextLine());

        System.out.print("Ingrese el teléfono: ");
        medico1.setTelefono(recogerDatos.nextLine());

        System.out.print("Ingrese el número de licencia: ");
        medico1.setNumeroLicencia(recogerDatos.nextLine());

        System.out.print("Ingrese la especialidad: ");
        medico1.setEspecialidad(recogerDatos.nextLine());

        System.out.print("Ingrese la universidad de graduación: ");
        medico1.setUniversidadGraduacion(recogerDatos.nextLine());

        System.out.print("Ingrese los años de experiencia: ");
        medico1.setAniosExperiencia(recogerDatos.nextInt());
        recogerDatos.nextLine();

        System.out.print("Ingrese el hospital actual: ");
        medico1.setHospitalActual(recogerDatos.nextLine());

        System.out.print("¿Acepta nuevos pacientes? (true/false): ");
        medico1.setAceptaNuevosPacientes(recogerDatos.nextBoolean());
        recogerDatos.nextLine();

        System.out.print("Ingrese el horario de atención: ");
        medico1.setHorarioAtencion(recogerDatos.nextLine());



        System.out.println("Recoleccion de datos desde la consola para la enfermedad");

        System.out.print("Ingrese ID: ");
        enfermedad1.setId(recogerDatos.nextLong());
        recogerDatos.nextLine();

        System.out.print("Ingrese el nombre: ");
        enfermedad1.setNombre(recogerDatos.nextLine());

        System.out.print("Ingrese la descripción: ");
        enfermedad1.setDescripcion(recogerDatos.nextLine());

        System.out.print("Ingrese las causas: ");
        enfermedad1.setCausas(recogerDatos.nextLine());

        System.out.print("¿Es contagiosa? (true/false): ");
        enfermedad1.setEsContagiosa(recogerDatos.nextBoolean());
        recogerDatos.nextLine();

        System.out.print("Ingrese el tipo de transmisión: ");
        enfermedad1.setTipoTransmision(recogerDatos.nextLine());

        System.out.print("Ingrese la tasa de mortalidad: ");
        enfermedad1.setTasaMortalidad(recogerDatos.nextDouble());


        System.out.print("Ingrese la tasa de recuperación: ");
        enfermedad1.setTasaRecuperacion(recogerDatos.nextDouble());


        System.out.print("Ingrese el grupo de edad afectado: ");
        enfermedad1.setGrupoEdadAfectado(recogerDatos.nextLine());

        System.out.print("Ingrese el género afectado: ");
        enfermedad1.setGeneroAfectado(recogerDatos.nextLine());



        System.out.println("Recoleccion de datos desde la consola para Medicamento");

        System.out.print("Ingrese ID: ");
        medicamento1.setId(recogerDatos.nextLong());
        recogerDatos.nextLine();

        System.out.print("Ingrese el nombre: ");
        medicamento1.setNombre(recogerDatos.nextLine());

        System.out.print("Ingrese el principio activo: ");
        medicamento1.setPrincipioActivo(recogerDatos.nextLine());

        System.out.print("Ingrese la concentración: ");
        medicamento1.setConcentracion(recogerDatos.nextLine());

        System.out.print("Ingrese la forma farmacéutica: ");
        medicamento1.setFormaFarmaceutica(recogerDatos.nextLine());

        System.out.print("Ingrese el fabricante: ");
        medicamento1.setFabricante(recogerDatos.nextLine());

        System.out.print("Ingrese la dosis recomendada: ");
        medicamento1.setDosisRecomendada(recogerDatos.nextLine());

        System.out.print("Ingrese el modo de administración: ");
        medicamento1.setModoAdministracion(recogerDatos.nextLine());

        System.out.print("¿Requiere receta? (true/false): ");
        medicamento1.setRequiereReceta(recogerDatos.nextBoolean());
        recogerDatos.nextLine();

        System.out.print("Ingrese el precio: ");
        medicamento1.setPrecio(recogerDatos.nextDouble());
        recogerDatos.nextLine();


        System.out.println("Recoleccion de datos desde la consola para el signo vital");

        System.out.print("Ingrese ID: ");
        signoVital1.setId(recogerDatos.nextLong());
        recogerDatos.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese la fecha de registro (YYYY-MM-DDTHH:MM): ");
        String fechaInput = recogerDatos.nextLine();
        signoVital1.setFechaRegistro(LocalDateTime.parse(fechaInput));

        System.out.print("Ingrese la frecuencia cardíaca: ");
        signoVital1.setFrecuenciaCardiaca(recogerDatos.nextDouble());


        System.out.print("Ingrese la presión sistólica: ");
        signoVital1.setPresionSistolica(recogerDatos.nextDouble());


        System.out.print("Ingrese la presión diastólica: ");
        signoVital1.setPresionDiastolica(recogerDatos.nextDouble());


        System.out.print("Ingrese la frecuencia respiratoria: ");
        signoVital1.setFrecuenciaRespiratoria(recogerDatos.nextDouble());


        System.out.print("Ingrese la temperatura corporal: ");
        signoVital1.setTemperaturaCorporal(recogerDatos.nextDouble());


        System.out.print("Ingrese la saturación de oxígeno: ");
        signoVital1.setSaturacionOxigeno(recogerDatos.nextDouble());


        System.out.print("Ingrese el nivel de glucosa: ");
        signoVital1.setGlucosa(recogerDatos.nextDouble());


        System.out.print("Ingrese el peso: ");
        signoVital1.setPeso(recogerDatos.nextDouble());












































    }
}