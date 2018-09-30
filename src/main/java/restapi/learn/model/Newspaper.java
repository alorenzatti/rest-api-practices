
package restapi.learn.model;

/**
 * @author Alexandre Lorenzatti <alorenza@gmail.com>
 * 2018-09-30
 *
 */

public class Newspaper {
	
	private int id;
	private String name;

	public Newspaper(int id, String name) {
		super();
		this.id = id;
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
		return "Book [id=" + id + ", name=" + name + "]";
	}
}
