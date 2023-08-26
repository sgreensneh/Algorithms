package chapterThree;

public class Clock {
    private int hour;
    private int minutes;
    private int seconds;

    public Clock(int hour, int minutes, int seconds) {
        setHour(hour);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {

        if (hour > 23 || hour < 0) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes > 59 || minutes < 0) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }

    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds > 59 || seconds < 0) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }

    }

    public void displayTime() {
        String hourInString = hour < 10 ? "0" + hour : String.valueOf(hour);
        String minutesInString = minutes < 10 ? "0" + minutes : String.valueOf(minutes);
        String secondInString = seconds < 10 ? "0" + seconds : String.valueOf(seconds);
        System.out.printf("%s:%s:%s", hourInString,minutesInString, secondInString);

    }


}
