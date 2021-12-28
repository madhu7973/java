package conditionalStatements;

public class Switch {

	public static void main(String[] args) {
		int dayNum = 1;

		String day;
		String week;

//		switch (dayNum) {
//		case 1:
//			day = "Monday";
//			break;
//		case 2:
//			day = "Tuesday";
//			break;
//		case 3:
//			day = "Wednesday";
//			break;
//		case 4:
//			day = "Thursday";
//			break;
//		case 5:
//			day = "Friday";
//			break;
//		case 6:
//			day = "Saturday";
//			break;
//		case 7:
//			day = "Sunday";
//			break;
//		default:
//			day = "Invalid day";
//		}

		switch (dayNum) {
		case 1 -> day = "Monday";
		case 2 -> day = "Tuesday";
		case 3 -> day = "Wednesday";
		case 4 -> day = "Thursday";
		case 5 -> day = "Friday";
		case 6 -> day = "Saturday";
		case 7 -> day = "Sunday";
		default -> day = "Invalid day";
		}

//		switch (day) {
//		default:
//			week = "Invalid week";
//			break;
//		case "Monday":
//		case "Tuesday":
//		case "Wednesday":
//		case "Thursday":
//		case "Friday":
//			week = "Weekday";
//			break;
//		case "Saturday":
//		case "Sunday":
//			week = "Weekend";
//			break;
//		}

		switch (day) {
		default -> week = "Invalid week";
		case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> week = "Weekday";
		case "Saturday", "Sunday" -> week = "Weekend";
		}

		System.out.println(day);
		System.out.println(week);

	}
}
