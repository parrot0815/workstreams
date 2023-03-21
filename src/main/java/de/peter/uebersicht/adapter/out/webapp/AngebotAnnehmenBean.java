package de.peter.uebersicht.adapter.out.webapp;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import de.peter.uebersicht.domain.entity.Angebot;
import de.peter.uebersicht.domain.entity.Anzeige;

@Named("angebotAnnehmenBean")
@ViewScoped
public class AngebotAnnehmenBean implements Serializable {
	private static final long serialVersionUID = -8451363931224198939L;

	private Anzeige actAnzeige;
	private Angebot selectedAngebot;

	@PostConstruct
	public void init() {
		actAnzeige = new Anzeige();
		setSelectedAngebot(new Angebot());
	}

	public Anzeige getAnzeige() {
		return actAnzeige;
	}

	public void setAnzeige(Anzeige pAnzeige) {
		this.actAnzeige = pAnzeige;
	}

	public Angebot getSelectedAngebot() {
		return selectedAngebot;
	}

	public void setSelectedAngebot(Angebot selectedAngebot) {
		this.selectedAngebot = selectedAngebot;
	}

	public void selectedAngebotAnnehmen(Angebot pAngebot) {
		selectedAngebot = pAngebot;
		selectedAngebot.annehmen();
	}
}
