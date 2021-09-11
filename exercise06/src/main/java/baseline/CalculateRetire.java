package baseline;

import java.time.Year;

public class CalculateRetire {
    private int userAge;
    private int retireAge;
    private static final int currentYear = Year.now().getValue();

    public CalculateRetire(int userAge, int retireAge) {
        this.userAge = userAge;
        this.retireAge = retireAge;
    }

    public int yearsTillRetire() {
        return (retireAge - userAge);
    }

    public int retireYear() {
        return (currentYear + yearsTillRetire());
    }

    public int getCurrentYear() {
        return currentYear;
    }
}
