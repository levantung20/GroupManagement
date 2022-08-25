package com.vti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vti.dto.filter.GroupFilter;
import com.vti.entity.Group;
import com.vti.service.IGroupService;

@RestController
@RequestMapping(value = "api/v1/groups")
public class GroupController {

	@Autowired
	private IGroupService service;

	@GetMapping()
	public Page<Group> getAllGroups(Pageable pageable , GroupFilter filter ,
			@RequestParam(required = false)String search) {
		Page<Group> entities = service.getAllGroups(pageable , filter ,search);
		return entities;
	}

}
