package trabajos_programacion_def;

import java.util.Scanner;

public class Displaying_current_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Obtain the total milliseconds since midnight, Jan 1m 1970
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;

		totalSeconds = totalSeconds % (60 * 60 * 24);
		// System.out.println(totalSeconds);

		long totalMinutes = totalSeconds / 60;
		// System.out.println(totalMinutes);

		long totalHours = totalMinutes / 60 + 2;

		long currentSeconds = totalSeconds % 60;
		long currentMinutes = totalMinutes % 60;

		System.out.println("Current time is " + totalHours + " : " + currentMinutes + " : " + currentSeconds + " GMT");

	}

	private static long totalSeconds(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
