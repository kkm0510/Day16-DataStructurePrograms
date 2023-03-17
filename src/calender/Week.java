package calender;

import java.util.ArrayList;

public class Week {

    ArrayList<WeekDay> weekDaysList;

    public Week(){
        weekDaysList=new ArrayList<>();
    }

    public void storeWeekDaysInList(){
        Week week=new Week();
        for(int i=1; i<=30; i++){
            String day="";
            int d=i%7;
            switch(d){
                case 0 -> day="Sunday";
                case 1 -> day="Monday";
                case 2 -> day="Tuesday";
                case 3 -> day="Wednesday";
                case 4 -> day="Thursday";
                case 5 -> day="Friday";
                case 6 -> day="Saturday";
            }
            WeekDay weekDay=new WeekDay(day, i);
            week.weekDaysList.add(weekDay);
        }
    }
}
