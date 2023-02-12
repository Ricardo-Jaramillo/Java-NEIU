import java.time.LocalTime;

public final class Time {

    private final int hour;
    private final int min;
    private final int sec;
    private final char meridiem;

    public Time(){
        this.hour = 12;
        this.min = 0;
        this.sec = 0;
        this.meridiem = 'A';
    }

    public Time(int hour, int min, int sec, char a){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        this.meridiem = a;
    }

    public int getHour(){
        return this.hour;
    }

    public int getMin(){
        return this.min;
    }

    public int getSec(){
        return this.sec;
    }

    public char getMeridiem(){
        return this.meridiem;
    }

    public int getTotalMinutes(){
        int hours = this.hour;

        if(this.meridiem == 'P'){
            if (hours < 12) {
                hours += 12;
            }
        }
        else if(hours == 12){
            hours = 0;
        }
        return (hours * 60) + this.min;
    }

    public int getTotalSeconds(){
        return (this.getTotalMinutes() * 60) + this.sec;
    }

    public static Time localTimeToTimeObject(LocalTime localTime){
        int h = localTime.getHour();
        int m = localTime.getMinute();
        int s = localTime.getSecond();
        char a;

        if(h < 12){
            a = 'A';
        }
        else if(h == 12){
            a = 'P';
        }
        else{
            a = 'P';
            h -= 12;
        }

        return new Time(h, m, s, a);
    }

    public static Time[] getMultipleTimes(LocalTime[] localTimeArray){
        int len = localTimeArray.length;
        Time[] timeObjectArray = new Time[len];

        for (int i = 0; i < len; i++){
            timeObjectArray[i] = Time.localTimeToTimeObject(localTimeArray[i]);
        }
        return timeObjectArray;
    }
}
