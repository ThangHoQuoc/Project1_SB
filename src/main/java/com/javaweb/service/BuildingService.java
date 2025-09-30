package com.javaweb.service;

import java.util.List;

import com.javaweb.model.dto.BuildingRequestDTO;
import com.javaweb.model.dto.BuildingResponseDTO;
import com.javaweb.model.dto.BuildingSearchRequestDTO;

public interface BuildingService {
  List<BuildingResponseDTO> searchBuildings(BuildingSearchRequestDTO request);
  
  
  
}
