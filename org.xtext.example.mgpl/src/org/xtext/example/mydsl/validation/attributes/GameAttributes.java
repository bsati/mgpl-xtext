package org.xtext.example.mydsl.validation.attributes;

public enum GameAttributes implements AttributeEnum {
	SPEED(true),
	X(false),
	Y(false),
	W(true),
	H(true);
		
	private boolean mandatory;
		
	private GameAttributes(boolean mandatory) {
		this.mandatory = mandatory;
	}
		
	@Override
	public boolean isMandatory() {
		return mandatory;
	}
	
	public static GameAttributes getByName(String name) {
		for(GameAttributes x : GameAttributes.values()) {
			if(x.name().toLowerCase().equals(name)) {
				return x;
			}
		}
		return null;
	}
}