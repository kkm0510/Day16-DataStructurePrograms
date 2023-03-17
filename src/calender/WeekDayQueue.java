package calender;

import cashcounter.MyQueue;

public class WeekDayQueue {

    public static void main(String[] args) {
        Week week=new Week();
        week.storeWeekDaysInList();
        MyQueue<WeekDay> queue=new MyQueue<>();
        for(WeekDay weekDay : week.weekDaysList){
            queue.enqueue(weekDay);
        }
    }
}
