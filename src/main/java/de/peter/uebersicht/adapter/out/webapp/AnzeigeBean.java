package de.peter.uebersicht.adapter.out.webapp;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import de.peter.uebersicht.domain.entity.Anzeige;

@Named("anzeigeBean")
@ViewScoped
public class AnzeigeBean implements Serializable {
	private static final long serialVersionUID = -2632293636693903639L;

	private Anzeige actAnzeige = new Anzeige();

	public void saveAnzeige(Anzeige selected) {
		actAnzeige = selected;
	}

	public Anzeige getAnzeige() {
		return actAnzeige;
	}

	public void setAnzeige(Anzeige pAnzeige) {
		this.actAnzeige = pAnzeige;
	}

}
