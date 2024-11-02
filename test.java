import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class test {
    public LocalDate ngayThangNam;
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        // dinh dang
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("MM/yyyy");
        String formatDatetime = today.format(dt);
        System.out.println(formatDatetime);
        //  ngay cu ther
        LocalDate ngay = LocalDate.of(2024, 12, 11);
        System.out.println(ngay.format(dt));
    }
}
