import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTimeApp {
    public static void main(String[] args) {
        // TODO: Code inside
        // create Date and Time
        LocalDate date = LocalDate.of(2024, 8, 23);
        LocalTime time = LocalTime.of(12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        LocalDateTime otherDateTime = LocalDateTime.of(1990, 1, 12, 23, 42);

        // formatting
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(dateFormatter.format(date));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println(dateTimeFormatter.format(dateTime));

        // parse strings
        String dateString = "20.04.2025";
        LocalDate parsedDate = LocalDate.parse(dateString, dateFormatter);
        System.out.println(parsedDate);

        // calculate durations / time spans
        LocalDateTime start = LocalDateTime.of(2025, 1, 20, 12, 0);
        LocalDateTime end = LocalDateTime.of(2025, 1, 20, 14, 0);
        Duration worktime = Duration.between(start, end);
        System.out.printf("Duration: %s minutes\n", worktime.toMinutes());

        LocalDate startDay = LocalDate.of(2025, 1, 27);
        LocalDate endDay = LocalDate.of(2025, 1, 31);
        long days = ChronoUnit.DAYS.between(startDay, endDay);
        System.out.printf("Workshop days: %d\n", days);

        // adjust values
        LocalDate newDay = date.plusDays(1L);
        LocalTime newTime = time.minusMinutes(35);
        LocalDateTime newDateTime = dateTime.plusDays(3L).plusMinutes(26);

        // machine readable times
        Instant now = Instant.now();
        for (int i = 0; i < 1_000_000; i++) {
            double x = Math.sin(i);
        }
        Instant endTime = Instant.now();

        Duration duration = Duration.between(now, endTime);

        System.out.println("Seconds: " + duration.toMillis());
    }
}
