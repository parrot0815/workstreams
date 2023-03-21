package de.peter.uebersicht.adapter.out.webapp;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import de.peter.uebersicht.domain.entity.Angebot;
import de.peter.uebersicht.domain.entity.Anzeige;

@Named("angebotAbgebenBean")
@ViewScoped
public class AngebotAbgebenBean implements Serializable {
	private static final long serialVersionUID = -3102843074911465252L;
	private Anzeige actAnzeige;
	private Angebot angebot;
	
	@PostConstruct
	public void init() {
		actAnzeige = new Anzeige();
		angebot = new Angebot();
	}
	
	public void reset() {
		angebot = new Angebot();
	}

	public void angebotAbgeben(ActionEvent event) {
		actAnzeige.addAngebot(angebot);
	}

	public Anzeige getAnzeige() {
		return actAnzeige;
	}

	public void setAnzeige(Anzeige pAnzeige) {
		this.actAnzeige = pAnzeige;
	}

	public Angebot getAngebot() {
		return angebot;
	}

	public void setAngebot(Angebot angebot) {
		this.angebot = angebot;
	}
}
