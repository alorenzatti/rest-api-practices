
package restapi.learn.model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Alexandre Lorenzatti <alorenza@gmail.com>
 * 2018-09-30
 *
 */

public class Juice {
	
	private static final AtomicInteger ID_COUNTER;
	
	private int id;
	private String name;
	
	static {
		ID_COUNTER = new AtomicInteger();
	}

	public Juice(String name) {
		super();
		
		this.id = ID_COUNTER.getAndIncrement();
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Juice [id=" + id + ", name=" + name + "]";
	}
}
