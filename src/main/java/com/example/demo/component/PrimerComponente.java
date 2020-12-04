package com.example.demo.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("primerComponente")
public class PrimerComponente {

	private static final Log log = LogFactory.getLog("PrimerComponente");
	
	public void ejemploComponente() {
		log.info("Estamos entrando en el componente");
	}
	
}
