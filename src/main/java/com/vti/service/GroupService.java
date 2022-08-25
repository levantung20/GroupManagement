package com.vti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vti.dto.filter.GroupFilter;
import com.vti.entity.Group;
import com.vti.repository.GroupRepository;

@Service
public class GroupService implements IGroupService {

	@Autowired
	private GroupRepository repository;

	public Page<Group> getAllGroups(Pageable pageable) {

		return repository.findAll(pageable);
	}

	@Override
	public Page<Group> getAllGroups(Pageable pageable, GroupFilter filter, String search) {

		return repository.findAll(pageable ,filter , search);
	}

}
