package SimplestClassesAndObjects;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public Time(int hour, int minute, int second) {

        this.hour = hour;
        this.minute = minute;
        this.second = second;

        if(hour<0|hour>=60){
            this.hour = 0;

        }
        if(minute<0|minute>=60){
            this.minute = 0;
        }
        if(second<0|second>=60){
            this.second =0;
        }
    }

    @Override
    public String toString() {
        return "Время: " + hour +
                ":" + minute +
                ":" + second;
    }
    public void changeHour(int hour){
        this.hour+=hour;
    }
    public void changeMinute(int minute){
        this.minute+=minute;
    }
    public void changeSecond(int second){
        this.second+=second;
    }
}
