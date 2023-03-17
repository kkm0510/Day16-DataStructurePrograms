package calender;

import balancedparantheses.MyStack;
import cashcounter.MyQueue;


public class WeekDayQueueAndStacks {

    public static void printUsingTwoStacks(MyStack<WeekDay> s1, MyStack<WeekDay> s2) {
        while (!s1.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            System.out.println(s2.pop());
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
    }

    public static void main(String[] args) {
        Week week = new Week();
        week.storeWeekDaysInList();
        MyQueue<WeekDay> queue = new MyQueue<>();
        for (WeekDay weekDay : week.weekDaysList) {
            queue.enqueue(weekDay);
        }
        MyStack<WeekDay> stack1 = new MyStack<>();
        MyStack<WeekDay> stack2 = new MyStack<>();
        while (!queue.isEmpty()) {
            stack1.push(queue.dequeue());
        }
        printUsingTwoStacks(stack1, stack2);
    }
}
