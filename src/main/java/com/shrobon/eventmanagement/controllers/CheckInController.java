package com.shrobon.eventmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shrobon.eventmanagement.controllers.exceptions.AlreadyCheckedInException;
import com.shrobon.eventmanagement.entities.Participant;
import com.shrobon.eventmanagement.repos.ParticipantRepository;

@RepositoryRestController
@RequestMapping("/events")
public class CheckInController {

	@Autowired
	private ParticipantRepository participantRepository;
	@PostMapping("/checkin/{id}")
	public ResponseEntity<PersistentEntityResource> checkIn(@PathVariable Long id, PersistentEntityResourceAssembler assembler) throws Throwable{
		//using assemblers to convert our entities 
		Participant participant = participantRepository.findById(id).orElseThrow((new AlreadyCheckedInException()));
		if(participant != null) {
			if(participant.getCheckedIn()) {
				throw new AlreadyCheckedInException();
			}
		}
		participant.setCheckedIn(true);
		participantRepository.save(participant);
		return ResponseEntity.ok(assembler.toResource(participant));
	}
}
