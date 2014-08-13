package br.com.elogroup.personalcareweb.core;
import javax.persistence.*;

@MappedSuperclass
public abstract class Entity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}
}
