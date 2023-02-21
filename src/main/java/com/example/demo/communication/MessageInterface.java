package com.example.demo.communication;

import java.util.List;

import com.example.demo.Model.entity.communication.Messagerie;


public interface MessageInterface {
	public List<Messagerie>findAll();
	public Messagerie CreateMessage(Messagerie message);
	public Messagerie findOneMessage(long idMessage);
	public void DeleteOne(long idMessage);
	public void deleteAll();
}
