package de.peter.uebersicht.adapter.out.webapp;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.model.FilterMeta;
import org.primefaces.model.MatchMode;
import org.primefaces.util.LangUtils;

import de.peter.uebersicht.domain.entity.Anzeige;
import de.peter.uebersicht.domain.entity.Kategorie;

@Named("uebersichtBean")
@ViewScoped
public class UebersichtBean implements Serializable {
	private static final long serialVersionUID = -4036108828006342688L;

	private List<Anzeige> anzeigen;
	private List<Anzeige> filteredAnzeigen;

	private List<FilterMeta> filterBy;

//	@Inject
//	SecurityIdentity identity;

	@PostConstruct
	public void init() {
		anzeigen = new ArrayList<>();
		final Anzeige anzeige1 = new Anzeige();
		anzeige1.setId(1L);
		anzeige1.setName("Der böse Opa");
		anzeige1.setDatum(LocalDate.of(2022, 10, 7));
		anzeige1.setBeschreibung("Wer räumt meinen Schuppen auf? Ich zahle 2 Äpfel die Stunde.");
		anzeige1.setKategorie(Kategorie.SUCHE);
		anzeigen.add(anzeige1);

		final Anzeige anzeige2 = new Anzeige();
		anzeige2.setId(2L);
		anzeige2.setName("Pascal");
		anzeige2.setDatum(LocalDate.of(2022, 8, 13));
		anzeige2.setBeschreibung("Ich füttere Ihre Kaninchen für 1 Euro/Stunde");
		anzeige2.setKategorie(Kategorie.BIETE);
		anzeigen.add(anzeige2);

		final Anzeige anzeige3 = new Anzeige();
		anzeige3.setId(3L);
		anzeige3.setName("Poketyp");
		anzeige3.setDatum(LocalDate.of(2022, 10, 5));
		anzeige3.setBeschreibung("Verkaufe umfangreiche Pokémon-Sammlung");
		anzeige3.setKategorie(Kategorie.BIETE);
		anzeigen.add(anzeige3);

		final Anzeige anzeige4 = new Anzeige();
		anzeige4.setId(4L);
		anzeige4.setName("Mandara");
		anzeige4.setDatum(LocalDate.of(2022, 10, 7));
		anzeige4.setBeschreibung("Wer hat den letzten Band von \"Dragonegg\"? Zahle den Originalpreis!");
		anzeige4.setKategorie(Kategorie.SUCHE);
		anzeigen.add(anzeige4);

		filterBy = new ArrayList<>();
		filterBy.add(FilterMeta.builder().field("kategorie").filterValue(Kategorie.SUCHE).matchMode(MatchMode.EQUALS)
				.build());
	}

	public List<Anzeige> getAnzeigen() {
		return anzeigen;
	}

	public void setAnzeigen(List<Anzeige> anzeigen) {
		this.anzeigen = anzeigen;
	}

	public List<Anzeige> getFilteredAnzeigen() {
		return filteredAnzeigen;
	}

	public void setFilteredAnzeigen(List<Anzeige> filteredAnzeigen) {
		this.filteredAnzeigen = filteredAnzeigen;
	}

	public boolean globalFilterFunction(Object value, Object filter, Locale locale) {
		String filterText = (filter == null) ? null : filter.toString().trim().toLowerCase();
		if (LangUtils.isBlank(filterText)) {
			return true;
		}

		Anzeige customer = (Anzeige) value;
		return customer.getName().toLowerCase().contains(filterText)
				|| customer.getBeschreibung().toLowerCase().contains(filterText)
				|| customer.getKategorie().name().toLowerCase().contains(filterText);
	}

	public List<FilterMeta> getFilterBy() {
		return filterBy;
	}

	public void anzeigeSchliessen(Anzeige pAnzeige) {
		pAnzeige.schliessen();
	}
}
