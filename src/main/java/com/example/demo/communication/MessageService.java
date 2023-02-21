package com.example.demo.communication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Model.entity.communication.Messagerie;
import com.example.demo.Model.repositories.communication.MessagerieRepository;


public class MessageService implements MessageInterface {
	@Autowired
	private MessagerieRepository messageRepo;
		@Override
		public List<Messagerie> findAll() {
			// TODO Auto-generated method stub
			return messageRepo.findAll();
		}

		@Override
		public Messagerie CreateMessage(Messagerie message) {
			// TODO Auto-generated method stub
			return messageRepo.save(message);
		}

		@Override
		public Messagerie findOneMessage(long idMessagerie) {
			// TODO Auto-generated method stub
			return messageRepo.findById(idMessagerie).get();
		}

		@Override
		public void DeleteOne(long idMessagerie) {
			// TODO Auto-generated method stub
			messageRepo.deleteById(idMessagerie);
			
		}

		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			messageRepo.deleteAll();
		}

}
