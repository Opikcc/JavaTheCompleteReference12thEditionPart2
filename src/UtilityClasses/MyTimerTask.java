package UtilityClasses;

import java.util.Calendar;
import java.util.TimerTask;

// Demonstrate Timer and TimerTask.
public class MyTimerTask extends TimerTask {
	public void run() {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Timer task executed. " + calendar.getTime());
	}
}
