package de.peter.uebersicht.domain.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Anzeige {
	private Long id;
	private String name;
	private Kategorie kategorie;
	private String Beschreibung;
	private LocalDate datum;
	private List<Angebot> angebote;
	private boolean geschlossen = false;

	public Anzeige() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Kategorie getKategorie() {
		return kategorie;
	}

	public void setKategorie(Kategorie kategorie) {
		this.kategorie = kategorie;
	}

	public String getBeschreibung() {
		return Beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		Beschreibung = beschreibung;
	}

	public LocalDate getDatum() {
		return datum;
	}

	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}

	public List<Angebot> getAngebote() {
		return angebote;
	}

	public void setAngebote(List<Angebot> angebote) {
		this.angebote = angebote;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addAngebot(Angebot angebot) {
		if (angebote == null) {
			angebote = new ArrayList<>();
		}
		this.angebote.add(angebot);
	}

	public int getAnzahlAngebote() {
		if (angebote != null) {
			return angebote.size();
		}
		return 0;
	}

	public boolean isGeschlossen() {
		return geschlossen;
	}

	public void setGeschlossen(boolean geschlossen) {
		this.geschlossen = geschlossen;
	}

	@Override
	public String toString() {
		return "Anzeige [id=" + id + ", name=" + name + ", kategorie=" + kategorie + ", Beschreibung=" + Beschreibung
				+ ", datum=" + datum + ", angebote=" + angebote + ", geschlossen=" + geschlossen + "]";
	}

	public void schliessen() {
		setGeschlossen(true);
	}
}
