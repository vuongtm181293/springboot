package my.edu.contact.service;

import java.util.List;
import java.util.Optional;

import my.edu.contact.entity.Contact;

public interface ContactService {

	Iterable<Contact> findAll();

	List<Contact> search(String term);

	Optional<Contact> findOne(Integer id);

	void save(Contact contact);

	void delete(Integer id);
}
