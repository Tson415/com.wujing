package com.wujing.enums;

public enum UserType implements BaseEnum{
	USER("队员"),
	TIMER("队长"),
	MANAGER("总队长");
	
	private final String key;
	
	private UserType(String key) {
		this.key = key;
	}

	@Override
	public String getKey() {
		return key;
	}

}
