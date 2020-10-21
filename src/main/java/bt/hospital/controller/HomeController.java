package bt.hospital.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import bt.hospital.modal.DzongkahgModal;
import bt.hospital.services.HomeService;

@Controller
public class HomeController {
	@Autowired
	HomeService service;
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@RequestMapping("/")
    public String index(Model model) {
		List<DzongkahgModal> dzongkhag = service.getDzongkhag();
		model.addAttribute("dzongkhaglist", dzongkhag);
        return "pages/index";
    }
}
