/**
 * 
 */
package restapi.learn.service;

import org.springframework.stereotype.Service;

import restapi.learn.model.Juice;
import restapi.learn.model.dto.JuiceDTO;

/**
 * @author Alexandre Lorenzatti <alorenza@gmail.com>
 * 2018-09-30
 *
 */

@Service
public class JuiceServiceImpl implements JuiceService {
	
	@Override
	public Juice createJuice(JuiceDTO juiceDTO) {
		
		final Juice juice = new Juice(juiceDTO.getName());
		
		return juice;
	}
}
