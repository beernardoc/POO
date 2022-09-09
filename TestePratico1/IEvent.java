package EP105926;

import java.time.LocalDate;

public interface IEvent {
    Activity addActivity(Activity activity);
    LocalDate getDate();
    double eventPrice();
}
