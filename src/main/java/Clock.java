/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/


import java.util.Objects;

public class Clock
{

    public int minutes, hours;

    public Clock(int aHours, int aMinutes)
    {

        clockCreator(aHours, aMinutes);
    }

    public void add(int minutes)
    {
        clockCreator(0, minutes);
    }

    /**
     * A helper function that creates a 24 hour clock according to the hours and minutes
     * @param aHours int
     * @param aMinutes int
     */
    public void clockCreator(int aHours, int aMinutes)
    {

        int totalHours;
        int totalMinutes = (this.minutes + aMinutes) % 60;

        int addedHours = (this.minutes + aMinutes) / 60;
        totalHours = (this.hours + aHours + addedHours) % 24;

        if (totalHours < 0)
        {
            totalHours += 24;
        }

        if (totalMinutes < 0)
        {
            totalHours -= 1;
            if (totalHours < 0)
            {
                totalHours = 23;
            }
            totalMinutes += 60;
        }

        this.hours = totalHours;
        this.minutes = totalMinutes;
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

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clock clock = (Clock) o;
        return minutes == clock.minutes && hours == clock.hours;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(minutes, hours);
    }
}