package de.mil.workstream.gedanken_erfassen.adapter.out.webapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import de.mil.workstream.gedanken_erfassen.domain.entity.Gedanke;

@Named("gedankenErfassenBean")
@ViewScoped
public class GedankenErfassenBean implements Serializable {
	private static final long serialVersionUID = -4036108828006342688L;

	private List<Gedanke> gedanken;

	@PostConstruct
	public void init() {
		setGedanken(new ArrayList<>());
	}

	public List<Gedanke> getGedanken() {
		return gedanken;
	}

	public void setGedanken(List<Gedanke> gedanken) {
		this.gedanken = gedanken;
	}
}
