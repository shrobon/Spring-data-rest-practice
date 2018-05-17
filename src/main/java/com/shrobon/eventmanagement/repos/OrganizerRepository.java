package com.shrobon.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.shrobon.eventmanagement.entities.Organizer;
@RepositoryRestResource(collectionResourceRel = "organizer", path = "organizer")
public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}
