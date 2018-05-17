package com.shrobon.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.shrobon.eventmanagement.entities.Participant;
@RepositoryRestResource(collectionResourceRel = "participant", path = "participant")
public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

}
