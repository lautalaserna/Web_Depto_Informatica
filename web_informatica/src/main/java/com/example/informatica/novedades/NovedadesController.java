package com.example.informatica.novedades;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@RequestMapping(path="")
@Controller
public class NovedadesController {
	
	private NovedadesService novedadesService;
	
	@Autowired
	public NovedadesController(NovedadesService novedadesService) {
		this.novedadesService = novedadesService;
	}
	
	@GetMapping(value="/noticias")
	public String noticias(@RequestParam Map<String, Object> params, Model model) {
		int page = params.get("page") != null ? (Integer.valueOf(params.get("page").toString())-1):0;
		//cantidad de noticias por pagina = 10
		PageRequest pageRequest = PageRequest.of(page, 10);
		Page<Novedades> pageNoticias = novedadesService.getPageNoticias(pageRequest);
		
		int totalpages = pageNoticias.getTotalPages();
		if(totalpages > 0) {
			List<Integer> pages = IntStream.rangeClosed(1, totalpages).boxed().collect(Collectors.toList());
			model.addAttribute("pages", pages);
		}
		model.addAttribute("list", pageNoticias.getContent());
		model.addAttribute("current", page+1);
		model.addAttribute("prev", page);
		model.addAttribute("next", page+2);
		model.addAttribute("last", totalpages);
		
		return "noticias";
	}
	
	@GetMapping(value="/novedad")
	public String novedad(@RequestParam Map<String, Object> params, Model model) {
		Optional<Novedades> novedad = novedadesService.getNovedad(Integer.valueOf(params.get("id").toString()));
		model.addAttribute("novedad", novedad.get());
		if(novedad.get().getIs_bolsa_trabajo() == 'Y'){
			model.addAttribute("entidad","bolsatrabajo");
		}else {
			model.addAttribute("entidad","noticias");
		}
		return "novedad";
	}
	
	
	@GetMapping(value="/bolsatrabajo")
	public String bolsatrabajo(@RequestParam Map<String, Object> params, Model model) {
		int page = params.get("page") != null ? (Integer.valueOf(params.get("page").toString())-1):0;
		//cantidad de noticias por pagina = 10
		PageRequest pageRequest = PageRequest.of(page, 10);
		Page<Novedades> pageTrabajos = novedadesService.getPageTrabajos(pageRequest);
		
		int totalpages = pageTrabajos.getTotalPages();
		if(totalpages > 0) {
			List<Integer> pages = IntStream.rangeClosed(1, totalpages).boxed().collect(Collectors.toList());
			model.addAttribute("pages", pages);
		}
		model.addAttribute("list", pageTrabajos.getContent());
		model.addAttribute("current", page+1);
		model.addAttribute("prev", page);
		model.addAttribute("next", page+2);
		model.addAttribute("last", totalpages);
		
		return "bolsatrabajo";
	}
	
}