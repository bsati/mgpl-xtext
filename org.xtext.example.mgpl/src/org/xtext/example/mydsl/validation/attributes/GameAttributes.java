package org.xtext.example.mydsl.validation.attributes;

public enum GameAttributes {
	SPEED(true),
	X(false),
	Y(false),
	W(true),
	H(true);
		
	private boolean mandatory;
		
	private GameAttributes(boolean mandatory) {
		this.mandatory = mandatory;
	}
		
	public boolean isMandatory() {
		return mandatory;
	}
}