package calender;

public class WeekDay implements Comparable<WeekDay> {

    String day;
    int date;

    WeekDay(String day, int date){
        this.date=date;
        this.day=day;
    }

    public String toString(){
        return "Date: "+date+"  "+day;
    }

    @Override
    public int compareTo(WeekDay o) {
        return this.date-o.date;
    }
}
