
package restapi.learn.model.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author Alexandre Lorenzatti <alorenza@gmail.com>
 * 2018-09-30
 *
 */

public class JuiceDTO {
	
	private int id;
	private String name;
	
	public JuiceDTO() {
		super();
	}
	
	public JuiceDTO(int id, String name) {
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
	
	@NotNull
	@NotEmpty
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "JuiceDTO [id=" + id + ", name=" + name + "]";
	}
}
