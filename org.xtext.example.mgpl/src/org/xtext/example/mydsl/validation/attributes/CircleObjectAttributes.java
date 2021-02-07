package org.xtext.example.mydsl.validation.attributes;

public enum CircleObjectAttributes implements AttributeEnum {
	ANIMATION_BLOCK(false),
	R(true),
	X(true),
	Y(true),
	VISIBLE(false);
	
	private boolean mandatory;
	
	private CircleObjectAttributes(boolean mandatory) {
		this.mandatory = mandatory;
	}
	
	@Override
	public boolean isMandatory() {
		return mandatory;
	}
	
	public static CircleObjectAttributes getByName(String name) {
		for(CircleObjectAttributes x : CircleObjectAttributes.values()) {
			if(x.name().toLowerCase().equals(name)) {
				return x;
			}
		}
		return null;
	}
}