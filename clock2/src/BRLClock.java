public class BRLClock extends Clock {

	@Override
	public Clock convert(final Clock clock) {
		this.second = clock.getSecond();
		this.minute = clock.getMinute();
		
		switch(clock) {
			case USClock usClock : {
				this.second = (usClock.getPeriodIndicator().equals("PM")) ?
				usClock.getHour() + 12 :
				usClock.getHour();
		}
			case BRClock brClock : {
				this.hour = brClock.getHour();
	}
		
		return this;
	}

}
