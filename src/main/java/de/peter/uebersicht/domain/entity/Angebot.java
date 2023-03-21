package de.peter.uebersicht.domain.entity;

import java.util.Date;

public class Angebot {
	private Long id;
	private String name;
	private String beschreibung;
	private Date datum;
	private Date datumAngenommen;
	private boolean angenommen = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public boolean isAngenommen() {
		return angenommen;
	}

	public void setAngenommen(boolean angenommen) {
		this.angenommen = angenommen;
	}	
	
	public Date getDatumAngenommen() {
		return datumAngenommen;
	}

	public void setDatumAngenommen(Date datumAngenommen) {
		this.datumAngenommen = datumAngenommen;
	}

	public void annehmen() {
		if(!isAngenommen()) {
			setDatumAngenommen(new Date());
			setAngenommen(true);
		}
	}

	@Override
	public String toString() {
		return "Angebot [id=" + id + ", name=" + name + ", beschreibung=" + beschreibung + ", datum=" + datum
				+ ", datumAngenommen=" + datumAngenommen + ", angenommen=" + angenommen + "]";
	}
}
