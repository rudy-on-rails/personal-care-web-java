package br.com.elogroup.personalcareweb.core;

public abstract class Entity {
	private long Id;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}
}
