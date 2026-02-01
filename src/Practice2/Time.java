package Practice2;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hour must be 0-23");
        }
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Minute must be 0-59");
        }
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Second must be 0-59");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int standardHour = hour % 12;
        if (standardHour == 0) standardHour = 12;
        String amPm = (hour < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, amPm);
    }

    private int toSeconds() {
        return hour * 3600 + minute * 60 + second;
    }

    public void add(Time other) {
        int totalSeconds = this.toSeconds() + other.toSeconds();
        totalSeconds %= 24 * 3600;
        this.hour = totalSeconds / 3600;
        this.minute = (totalSeconds % 3600) / 60;
        this.second = totalSeconds % 60;
    }

    public static void main(String[] args) {
        Time t1 = new Time(23, 5, 6);
        System.out.println(t1.toUniversal());
        System.out.println(t1.toStandard());

        Time t2 = new Time(4, 24, 33);
        t1.add(t2);

        System.out.println(t1.toUniversal());
        System.out.println(t1.toStandard());
    }
}
