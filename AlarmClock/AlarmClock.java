public class AlarmClock extends Clock{
    private int alarmHours;
    private int alarmMinutes;

    public AlarmClock(){
        super(0, 0, 0);
    }

    public AlarmClock(int h, int m){
        super(h,m,0);
    }

    public AlarmClock(int h, int m, int s){
        super(h,m,s);
    }

    public void setAlarm(int h, int m){
        if (h < 0 || h >= 24){
            throw new IllegalArgumentException("invalid alarm hours");
        }
        if (m < 0 || m >= 60){
            throw new IllegalArgumentException("invalid alarm minutes");
        }
        alarmHours=h;
        alarmMinutes=m;
    }
    public int getAlarmHours(){
        return alarmHours;
    }
    public int getAlarmMinutes(){
        return alarmMinutes;
    }

    public boolean isRinging() {
        if (getMinutes() == getAlarmMinutes() && getHours() == getAlarmHours() && getSeconds() <= 14) {
            return true;
        }
        return false;
    }

    @Override
    public void display() {
        if (this.isRinging()){
            System.out.println(this + " - WAKE UP!");
        }
        else{
            System.out.println(this);
        }
    }
}
