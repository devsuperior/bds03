package com.devsuperior.bds03.services;

import com.devsuperior.bds03.dto.DepartmentDTO;
import com.devsuperior.bds03.entities.Department;
import com.devsuperior.bds03.repositories.DepartmentRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentService {

	private final DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    public List<DepartmentDTO> findAll() {
		List<Department> list = repository.findAll(Sort.by("name"));
		return list.stream().map(DepartmentDTO::new).collect(Collectors.toList());
	}
}
