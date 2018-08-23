package com.github.nwt248.common;

public class DateInterval {

	private SimpleDate start;

	private SimpleDate end;

	public DateInterval(SimpleDate start, SimpleDate end) {
		this.start = start;
		this.end = end;
	}

	public SimpleDate getStart() {
		return start;
	}

	public SimpleDate getEnd() {
		return end;
	}
}
