package model;

public class Fruit {
	private String FOOD_NAME;
	private String SCIENTIFIC_NAME;
	private String GROUP;
	private String SUBGROUP;

	public Fruit(String FOOD_NAME, String SCIENTIFIC_NAME, String GROUP, String SUBGROUP) {
		this.FOOD_NAME = FOOD_NAME;
		this.SCIENTIFIC_NAME = SCIENTIFIC_NAME;
		this.GROUP = GROUP;
		this.SUBGROUP = SUBGROUP;
	}

	public String getFOOD_NAME() {
		return FOOD_NAME;
	}

	public String getSCIENTIFIC_NAME() {
		return SCIENTIFIC_NAME;
	}

	public String getGROUP() {
		return GROUP;
	}

	public String getSUBGROUP() {
		return SUBGROUP;
	}
}
