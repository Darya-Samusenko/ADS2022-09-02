package by.it.group151001.maliauka.lesson02;

import java.util.*;
/*
даны интервальные события events
реализуйте метод calcStartTimes, так, чтобы число принятых к выполнению
непересекающихся событий было максимально.
Алгоритм жадный. Для реализации обдумайте надежный шаг.
*/

public class B_Sheduler{
    //событие у аудитории(два поля: начало и конец)
    static class Event {
        int start;
        int stop;

        Event(int start, int stop) {
            this.start = start;
            this.stop = stop;
        }
        int getStart(){
            return start;
        }
        int getStop(){
            return stop;
        }

        @Override
        public String toString() {
            return "("+ start +":" + stop + ")";
        }

        static class EventStopComparator implements Comparator<Event>{

            public int compare(Event a, Event b){
                return a.getStop() - b.getStop();
            }
        }
    }


    public static void main(String[] args) {
        B_Sheduler instance = new B_Sheduler();
        Event[] events = {  new Event(0, 3),  new Event(0, 1), new Event(1, 2), new Event(3, 5),
                new Event(1, 3),  new Event(1, 3), new Event(1, 3), new Event(3, 6),
                new Event(2, 7),  new Event(2, 3), new Event(2, 7), new Event(7, 9),
                new Event(3, 5),  new Event(2, 4), new Event(2, 3), new Event(3, 7),
                new Event(4, 5),  new Event(6, 7), new Event(6, 9), new Event(7, 9),
                new Event(8, 9),  new Event(4, 6), new Event(8, 10), new Event(7, 10)
        };

        List<Event> starts = instance.calcStartTimes(events,0,10);  //рассчитаем оптимальное заполнение аудитории
        System.out.println(starts);                                 //покажем рассчитанный график занятий
    }



    List<Event> calcStartTimes(Event[] events, int from, int to) {
        //events - события которые нужно распределить в аудитории
        //в период [from, int] (включительно).
        //оптимизация проводится по наибольшему числу непересекающихся событий.
        //начало и конец событий могут совпадать.
        //ваше решение.

        List<Event> result = new ArrayList<>();
        Arrays.sort(events, new Event.EventStopComparator()); //сортируем по правой границе
        result.add(events[0]); //выбираем первое событие

        //сравниваем конец предыдущего события со start следующего
        //так же проверяем на диапазон
        int j = 0;
        for (int i = 1; i < events.length; i++) {
            boolean inRange = events[i].start >= from && events[i].stop <= to;
            boolean isPrompt = events[i].start >= result.get(j).stop;

            if (isPrompt && inRange) {
                result.add(events[i]);
                j++;
            }
        }

        return result;
    }
}