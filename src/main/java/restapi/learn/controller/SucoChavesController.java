/**
 * 
 */
package restapi.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restapi.learn.service.SucoChavesService;

/**
 * @author Alexandre Lorenzatti <alorenza@gmail.com>
 * 2018-09-30
 *
 */
@RestController
@RequestMapping("/api/chaves")
public class SucoChavesController {
	
	@Autowired
	private SucoChavesService sucoChavesService;
	
	@PostMapping("/GetSucoChavesDeleted/{sucoId}")
	public ResponseEntity<String> getJuiceDeleted(@PathVariable("sucoId") int sucoId) {
		
		this.sucoChavesService.deleteSuco(sucoId);
		return ResponseEntity.ok(String.format("Suco removido: %d", sucoId));
	}
}
