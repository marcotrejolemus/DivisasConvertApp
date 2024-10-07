import java.util.List;

public record Moneda(
        String result,
        String documentation,
        String terms_of_use,
        String base_code,
        String target_code,
        String conversion_rate,
        String time_last_update_utc) {
}
