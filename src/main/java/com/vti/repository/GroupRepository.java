package com.vti.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.vti.dto.filter.GroupFilter;
import com.vti.entity.Group;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Short>, JpaSpecificationExecutor<Group> {

	public Group findByName(String name);

	public boolean existsByName(String name);

	public Page<Group> findAll(Pageable pageable, GroupFilter filter, String search);
}
