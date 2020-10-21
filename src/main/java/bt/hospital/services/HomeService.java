package bt.hospital.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.hospital.modal.DzongkahgModal;
import bt.hospital.dao.HomeDao;

@Service
public class HomeService {
	@Autowired
	HomeDao dao;
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	public List<DzongkahgModal> getDzongkhag() {
        try {
            return dao.getdzongkhag();
        } catch (Exception e) {
        	log.error("Exception in retrieving dzongkhag list:"+e);
            return null;
        }
    }
}
