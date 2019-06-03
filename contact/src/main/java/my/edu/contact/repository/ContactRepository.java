package my.edu.contact.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import my.edu.contact.entity.Contact;

import java.util.List;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {

	List<Contact> findByNameContaining(String term);

	 

}