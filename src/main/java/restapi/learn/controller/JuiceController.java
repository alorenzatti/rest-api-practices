/**
 * 
 */
package restapi.learn.controller;

import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restapi.learn.model.Juice;
import restapi.learn.model.dto.JuiceDTO;
import restapi.learn.service.JuiceService;

/**
 * @author Alexandre Lorenzatti <alorenza@gmail.com>
 * 2018-09-30
 *
 */

@RestController
@RequestMapping("/api/")
public class JuiceController {
	
	@Autowired
	private JuiceService juiceService;
	
	@PostMapping("/juice")
	public ResponseEntity<?> createJuice(@Valid @RequestBody JuiceDTO juiceDTO, BindingResult result) {
		
		if(result.hasErrors()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result.getAllErrors().stream().collect(Collectors.toList()));
		}
		final Juice juice = this.juiceService.createJuice(juiceDTO);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(new JuiceDTO(juice.getId(), juice.getName()));
	}
}
