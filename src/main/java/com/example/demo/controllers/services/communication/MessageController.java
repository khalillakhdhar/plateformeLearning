package com.example.demo.controllers.services.communication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.entity.communication.Messagerie;

import jakarta.validation.Valid;

@RestController
@CrossOrigin

@RequestMapping("Message")
public class MessageController {
@Autowired
MessageService messageService;


@GetMapping
public List<Messagerie> findMessagees()
{
return messageService.findAll();	
}
@PostMapping
public Messagerie createOne(@Valid @RequestBody Messagerie message)
{
return messageService.CreateMessage(message);	

}
@GetMapping("/{id}")
public Messagerie findOne(@PathVariable long id)
{
return messageService.findOneMessage(id);	
}
@DeleteMapping("/{id}")
public void deleteOne(long id)
{
messageService.DeleteOne(id);	

}

}
