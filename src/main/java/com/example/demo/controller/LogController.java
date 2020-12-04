package com.example.demo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.component.PrimerComponente;

@Controller
@RequestMapping("/")
public class LogController {
	
	private static final Log log = LogFactory.getLog("LogController");

	@Autowired
	@Qualifier("primerComponente")
	private PrimerComponente primerComponente;
	
	@GetMapping("/metodo1")
	public String metodo1() {
		primerComponente.ejemploComponente();
		
		log.info("Estamos entrando en el método 1");
		return "view1";
	}
	
	@GetMapping("/metodo2")
	public String metodo2() {
		log.info("Estamos entrando en el método 2");
		return "view2";
	}

}
