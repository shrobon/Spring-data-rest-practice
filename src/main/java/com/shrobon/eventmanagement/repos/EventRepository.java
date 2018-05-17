package com.shrobon.eventmanagement.repos;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.shrobon.eventmanagement.entities.Event;

public interface EventRepository extends PagingAndSortingRepository<Event, Long> {

	//List<Event> findByName(@Param("name")String name);
	// To enable paging support for custom finder methods 
	Page<Event> findByName(@Param("name")String name,Pageable pageable);

}
