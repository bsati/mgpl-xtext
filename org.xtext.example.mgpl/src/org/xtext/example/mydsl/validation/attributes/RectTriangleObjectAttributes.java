package org.xtext.example.mydsl.validation.attributes;

public enum RectTriangleObjectAttributes implements AttributeEnum {
	ANIMATION_BLOCK(false),
	H(true),
	W(true),
	X(true),
	Y(true),
	VISIBLE(false);
	
	private boolean mandatory;
	
	private RectTriangleObjectAttributes(boolean mandatory) {
		this.mandatory = mandatory;
	}
	
	@Override
	public boolean isMandatory() {
		return mandatory;
	}
	
	public static RectTriangleObjectAttributes getByName(String name) {
		for(RectTriangleObjectAttributes x : RectTriangleObjectAttributes.values()) {
			if(x.name().toLowerCase().equals(name)) {
				return x;
			}
		}
		return null;
	}
}
