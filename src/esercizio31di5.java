import java.time.*;
import java.time.format.DateTimeFormatter;

public class esercizio31di5 {
    public static void main(String[] args) {

        OffsetDateTime fecha = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime fecha2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        String dateFormat = fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String date2Format = fecha2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(fecha.isBefore(fecha2));
        System.out.println(fecha2.isAfter(fecha));

        OffsetDateTime fechaAhora = OffsetDateTime.now();
        String dateNowFormat = fechaAhora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(dateNowFormat);
        System.out.println(dateFormat);
        System.out.println(fecha.equals(fechaAhora));
        System.out.println("Is the same date that " + date2Format + "?:");
        System.out.println(fecha2.equals(fechaAhora));

    }
}