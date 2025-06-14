
public class Main {

	public static void main(String[] args) {
		Clock brclock = new BRLClock();
		brclock.setSecond(0);
		brclock.setMinute(0);
		brclock.setHour(25);
		
		System.out.println(brclock.getTime());
		
		System.out.println(new USClock().convert(brclock).getTime());
	}
}
