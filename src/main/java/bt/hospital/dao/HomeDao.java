package bt.hospital.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import bt.hospital.modal.DzongkahgModal;



@Repository
@Transactional
public class HomeDao {
	@PersistenceContext
	private EntityManager entityManager;
	public List<DzongkahgModal>  getdzongkhag() {
		return entityManager.createQuery("from dzongkhag_master").getResultList();
		//return entityManager.unwrap(Session.class).createQuery("from dzongkhag_master").getResultList();
	}
}
