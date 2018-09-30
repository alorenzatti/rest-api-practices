/**
 * 
 */
package restapi.learn.service;

import restapi.learn.model.Juice;
import restapi.learn.model.dto.JuiceDTO;

/**
 * @author Alexandre Lorenzatti <alorenza@gmail.com>
 * 2018-09-30
 *
 */
public interface JuiceService {
	
	public Juice createJuice(JuiceDTO juiceDTO);
}
