package CodeListing;

public class EnumDemo {
	enum Day {
			SUNDAY, MONDAY, TUESDAY, WEDNESDAY , THURSDAY , FRIDAY , SATURDAY
	}
	public static void main(String[] args) {
		Day workDay = Day.WEDNESDAY;
		
		System.out.println(workDay);
		System.out.println(" -------------");
		System.out.println("The ordinal of Monday is :" + Day.MONDAY.ordinal());
		
		System.out.println("The ordinal of Saturday is : " + Day.SATURDAY.ordinal());
		
		if(Day.FRIDAY.compareTo(Day.FRIDAY) == 0) {
			System.out.println(Day.FRIDAY + " is greater " + Day.MONDAY	);
		}else {
			System.out.println(Day.FRIDAY + " is NOT greater than " + Day.MONDAY);
		}
		
		//phép trừ 2 trị số tại saturday và monday
		System.out.println(Day.SATURDAY.compareTo(Day.MONDAY));
	}

}
