package com.shrobon.eventmanagement.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shrobon.eventmanagement.entities.Event;
import com.shrobon.eventmanagement.repos.EventRepository;

@RepositoryRestController
@RequestMapping("/events")
public class EventKickOffController {
	
	@Autowired
	private EventRepository eventRepository;
	@PostMapping("start/{id}")
	public ResponseEntity start(@PathVariable Long id) {
        Event event1 = eventRepository.findById(id).orElseThrow(()->new ResourceNotFoundException());
        event1.setStarted(true);
        eventRepository.save(event1);
        return ResponseEntity.ok("Event "+event1.getName()+" started");		
	}
}
