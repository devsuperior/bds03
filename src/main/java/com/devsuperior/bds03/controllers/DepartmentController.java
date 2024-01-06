package com.devsuperior.bds03.controllers;

import com.devsuperior.bds03.dto.DepartmentDTO;
import com.devsuperior.bds03.services.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

	private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @GetMapping
	public ResponseEntity<List<DepartmentDTO>> findAll() {
		List<DepartmentDTO> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
}
