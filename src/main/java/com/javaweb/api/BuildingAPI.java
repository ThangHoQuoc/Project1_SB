package com.javaweb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.exception.InvalidBuildingException;
import com.javaweb.model.dto.BuildingRequestDTO;
import com.javaweb.model.dto.BuildingResponseDTO;
import com.javaweb.model.dto.BuildingSearchRequestDTO;
import com.javaweb.service.BuildingService;

@RestController
@RequestMapping(value = "/buildings")
public class BuildingAPI {

	@Autowired
	private BuildingService buildingService;
	



	@GetMapping("/search")
	public List<BuildingResponseDTO> searchBuildings(@ModelAttribute BuildingSearchRequestDTO request) {
		return buildingService.searchBuildings(request);
		
		
		
		
		//coment1
		

	}

	@PostMapping()
	public Object createBuilding(@RequestBody BuildingRequestDTO building) {

		return building;
	}

	private void validateData(BuildingRequestDTO building) throws InvalidBuildingException {
		if (building.getName() == null || building.getName().equals("") || building.getNumberOfBasement() == null) {
			throw new InvalidBuildingException("name and numberofbasement not be empty");
		}
	}

//	@DeleteMapping("{ids}")
//	public String deleteBuilding(@PathVariable List<Long> ids,
//			@RequestParam(name = "name", required = false) String name) {
//		System.out.println(name);
//		return null;
//	}

}
