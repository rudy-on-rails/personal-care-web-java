package br.com.elogroup.personalcareweb.core;
import javax.persistence.*;

@MappedSuperclass
public abstract class Entity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
