import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Fechas {
    public static void main(String[] args) {

        LocalDateTime fechaActualLocal = LocalDateTime.now();
        DateTimeFormatter formatoEspañol = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Fecha actual en España: " + fechaActualLocal.format(formatoEspañol));

        ZoneId zonaCaracas = ZoneId.of("America/Caracas");
        ZonedDateTime fechaCaracas = ZonedDateTime.now(zonaCaracas);
        System.out.println("Fecha actual en Caracas: " + fechaCaracas.format(formatoEspañol));

        LocalDate descubrimientoAmerica = LocalDate.of(1492, 10, 12);
        LocalDate fechaActual = LocalDate.now();
        long añosTranscurridos = ChronoUnit.YEARS.between(descubrimientoAmerica, fechaActual);
        System.out.println("Años transcurridos desde el descubrimiento de América: " + añosTranscurridos);

        LocalTime horaActualLocal = LocalTime.now();
        System.out.println("Hora actual en España: " + horaActualLocal);

        LocalTime horaCaracas = LocalTime.now(zonaCaracas);
        System.out.println("Hora actual en Caracas: " + horaCaracas);

        ZoneId zonaMadrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime horaMadrid = ZonedDateTime.now(zonaMadrid);
        long diferenciaHoras = ChronoUnit.HOURS.between(horaCaracas, horaMadrid);
        System.out.println("Diferencia de horas entre Madrid y Caracas: " + diferenciaHoras + " horas");

        LocalDateTime fechaHoraLuna = LocalDateTime.of(1969, 7, 21, 3, 56);
        System.out.println("Fecha y hora cuando Neil Armstrong pisó la luna: " + fechaHoraLuna.format(formatoEspañol));
    }
}

