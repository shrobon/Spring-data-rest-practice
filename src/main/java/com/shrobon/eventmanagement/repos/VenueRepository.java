package com.shrobon.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.shrobon.eventmanagement.entities.Venue;
@RepositoryRestResource(collectionResourceRel = "venue", path = "venue")
public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {

}
