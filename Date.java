package vehicle.main;
import java.text.DecimalFormat;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if(isDay(day)){
            this.day = day;
        }else{
            throw new IllegalArgumentException("Invalid day");
        }
        if(isMonth(month)){
            this.month = month;
        }else{
            throw new IllegalArgumentException("Invalid month");
        }
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(isDay(day)){
            this.day = day;
        }else{
            throw new IllegalArgumentException("Invalid day");
        }

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(isMonth(month)){
            this.month = month;
        }else{
            throw new IllegalArgumentException("Invalid month");
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day,int month,int year){
        if(isDay(day)){
            this.day = day;
        }else{
            throw new IllegalArgumentException("Invalid day");
        }
        if(isMonth(month)){
            this.month = month;
        }else{
            throw new IllegalArgumentException("Invalid month");
        }
        this.year = year;

    }

    public String getDate(){
        DecimalFormat formatter = new DecimalFormat("00");
        return formatter.format(this.day)+"/"+formatter.format(this.month)+"/"+this.year;
    }

    @Override
    public String toString() {
//        return "Date{" +
//                "day=" + day +
//                ", month=" + month +
//                ", year=" + year +
//                '}';
        DecimalFormat formatter = new DecimalFormat("00");
        return formatter.format(this.day)+"/"+formatter.format(this.month)+"/"+this.year;
    }


    private boolean isMonth(int month){
        return month < 13 && month > 0;
    }

    private boolean isDay(int day){
        return day<32&& day>0;
    }

}
