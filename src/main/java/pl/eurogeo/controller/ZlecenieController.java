package pl.eurogeo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.eurogeo.model.UserDao;
import pl.eurogeo.model.Zlecenie;
import pl.eurogeo.model.ZlecenieDao;

@CrossOrigin
@RequestMapping(value ="/zlecenie")
public class ZlecenieController {
	@Autowired
	UserDao userDao;
	@Autowired
	ZlecenieDao zlecenieDao;

	private List<Zlecenie> getAllZlecenia() {
		List<Zlecenie> listaZlecen = new ArrayList<Zlecenie>();
		zlecenieDao.findAll().forEach(listaZlecen::add);

		return listaZlecen;

	}
	
	
	@PostMapping()
	public String noweZlecenie(@RequestBody Zlecenie zlecenieHttp, Model model){
		zlecenieDao.save(zlecenieHttp);
		model.addAttribute("zlecenia",getAllZlecenia());
		return "jsonTemplate";
	}
	
	@GetMapping
	public String getAll(Model model){
		model.addAttribute("zlecenia", getAllZlecenia());
		return "jsonTemplate";
	}
}
