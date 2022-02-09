package _07_Meeting_Scheduler;

import java.util.ArrayList;
import java.util.HashMap;

public class MeetingScheduler {
    /*
     * Your task is to code a method to find a meeting time for two people
     * given their schedules.
     * 
     * Code the method below so that it returns a Schedule object that contains
     * all the times during the week that are in BOTH people's schedules. The
     * Schedule class is included in this package.
     * 
     * Example:
     * person1 availability - Monday at 9, Tuesday at 14, and Friday 10
     * person2 availability - Tuesday at 14, Friday 8, and Monday at 9
     * The returned HashMap should contain: Tuesday 14 and Monday 9
     * 
     * The returned Schedule object represents the times both people are
     * available for a meeting.
     * 
     * Time availability is always at the top of the hour, so 9:30 is not valid
     * Time availability always represents 1 hour
     * Assume both schedules are in the same time zones
     */
    public static Schedule getMutualAvailability(Schedule person1, Schedule person2) {
Schedule MS = new Schedule();
HashMap<String, ArrayList<Integer>> Person1schedule = person1.getSchedule();
HashMap<String, ArrayList<Integer>> Person2schedule = person2.getSchedule();
for(String ScheduleSTR : Person1schedule.keySet()) {
ArrayList<Integer> person1Times = Person1schedule.get(ScheduleSTR);
ArrayList<Integer> person2Times = Person2schedule.get(ScheduleSTR);
for (int i = 0; i < person1Times.size(); i++) {
if (person2Times.contains(person1Times.get(i))) {
MS.addAvailability(ScheduleSTR, person1Times.get(i));
}	
}
		
}

        return MS;
    }
}
