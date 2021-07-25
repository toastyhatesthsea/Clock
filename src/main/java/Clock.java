/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/


public class Clock
{


    public int minutes, hours;


    public Clock(int aHours, int aMinutes)
    {
        /*
        int minutesFromHours = aHours * 60;
        int totalMinutes = minutesFromHours + aMinutes;

        int totalHours = totalMinutes / 60;
        totalHours = totalHours % 24;
        int remainingMinutes = totalMinutes % 60;

        if (totalHours < 0)
        {
            totalHours = 24 + totalHours;
        }

        this.minutes = remainingMinutes;
        this.hours = totalHours; */

        int totalHours;
        int totalMinutes = aMinutes % 60;

        int addedHours = aMinutes / 60;
        totalHours = (aHours + addedHours) % 24;

        if (totalHours < 0)
        {
            totalHours += 24;
        }

        if (totalMinutes < 0)
        {
            totalHours -= 1;
            totalMinutes += 60;
        }

        this.hours = totalHours;
        this.minutes = totalMinutes;
    }


    private int calculateMinutes(int hours)
    {
        return hours * 60;
    }

    public void add(int minutes)
    {

    }

    @Override
    public String toString()
    {
        String answer = "";

        String hours = "";
        String minutes = "";

        if (this.hours < 10)
        {
            hours = "0" + this.hours;
        } else
        {
            hours = Integer.toString(this.hours);
        }

        if (this.minutes < 10)
        {
            minutes = "0" + this.minutes;
        } else
        {
            minutes = Integer.toString(this.minutes);
        }

        answer = hours + ":" + minutes;
        return answer;

    }
}