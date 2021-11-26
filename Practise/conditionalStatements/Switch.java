package conditionalStatements;

public class Switch {

	public static void main(String[] args) {
		int dayNum = 001;

		String day;
		String week;

		switch (dayNum) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;
		default:
			day = "Invalid day";
		}

		switch (day) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			week = "Weekday";
			break;
		case "Saturday":
		case "Sunday":
			week = "Weekend";
			break;
		default:
			week = "Invalid week";
		}

		System.out.println(day);
		System.out.println(week);

	}
}
