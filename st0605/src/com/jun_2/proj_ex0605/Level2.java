package com.jun_2.proj_ex0605;

enum Level2 {
	LOW("Low level"),
	MEDIUM("Medium level"),
	HIGH("high level");
	
	private String description;
	
	private Level2(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

}
