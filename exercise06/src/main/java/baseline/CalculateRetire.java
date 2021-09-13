package baseline;

import java.time.Year;

public class CalculateRetire {
    private int userAge;
    private int retireAge;
    private static final int CURRENT_YEAR = Year.now().getValue();

    public CalculateRetire(int userAge, int retireAge) {
        this.userAge = userAge;
        this.retireAge = retireAge;
    }

    public int yearsTillRetire() {
        return (retireAge - userAge);
    }

    public int retireYear() {
        return (CURRENT_YEAR + yearsTillRetire());
    }

    public int getCurrentYear() {
        return CURRENT_YEAR;
    }
}
