package pl.itacademy.enums;

public enum Month {
    JANUARY("January", "Styczeń", 31),
    FEBRUARY("February", "Luty", 28),
    MARCH("March", "Marzec", 31),
    APRIL("April", "Kwiecień", 30),
    MAY("", "", 0),
    JUNE("", "", 0),
    JULY("", "", 0),
    AUGUST("", "", 0),
    SEPTEMBER("", "", 0),
    OCTOBER("October", "Październik", 31),
    NOVEMBER("", "", 0),
    DECEMBER("December", "Grudzień", 31);

    private final String englishName;
    private final String polishName;
    private final int days;

    Month(String englishName, String polishName, int days) {
        this.englishName = englishName;
        this.polishName = polishName;
        this.days = days;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getPolishName() {
        return polishName;
    }

    public int getDays() {
        return days;
    }

    public static Month fromPolishName(String polishName) {
        for (Month month : Month.values()) {
            if (month.polishName.equals(polishName)) {
                return month;
            }
        }
        throw new IllegalArgumentException("Month with Polish name \"" + polishName + "\" does not exists!");
    }

    @Override
    public String toString() {
        return englishName + " - " + polishName;
    }
}
