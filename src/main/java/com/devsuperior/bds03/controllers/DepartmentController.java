package com.devsuperior.bds03.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds03.dto.DepartmentDTO;
import com.devsuperior.bds03.services.DepartmentService;

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
