package de.mil.workstream.gedanken_erfassen.domain.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Gedanke {
	private String parentStream = "Mainstream";
	private String text;
	private String titel;

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	private LocalDateTime date;

	public Gedanke(String pTitel, String pText) {
		date = LocalDateTime.now();
		text = pText;
		titel = pTitel;
	}

	public String getParentStream() {
		return parentStream;
	}

	public void setParentStream(String parentStream) {
		this.parentStream = parentStream;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getDateAsString() {
		return date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
	}
}
