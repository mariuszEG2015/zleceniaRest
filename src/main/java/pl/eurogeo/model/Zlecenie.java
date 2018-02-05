package pl.eurogeo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Zlecenie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataZgloszenia;
	private int numerZlecenia;
	private String zlecajacy;
	private String tresc;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate terminWykonania;
	private String wykonawca;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataWykonania;
	private int month;
	private int year;
	private String uwagi;

	public Zlecenie() {

	}

	public Zlecenie(LocalDate dataZgloszenia, int numerZlecenia, String zlecajacy, String tresc,
			LocalDate terminWykonania, String wykonawca, LocalDate dataWykonania, String uwagi) {
		super();
		this.dataZgloszenia = dataZgloszenia;
		this.numerZlecenia = numerZlecenia;
		this.zlecajacy = zlecajacy;
		this.tresc = tresc;
		this.terminWykonania = terminWykonania;
		this.wykonawca = wykonawca;
		this.dataWykonania = dataWykonania;
		this.month = dataZgloszenia.getMonthValue();
		this.year = dataZgloszenia.getYear();
		this.uwagi = uwagi;
	}

	public LocalDate getDataZgloszenia() {
		return dataZgloszenia;
	}

	public void setDataZgloszenia(LocalDate dataZgloszenia) {
		this.dataZgloszenia = dataZgloszenia;
	}

	public int getNumerZlecenia() {
		return numerZlecenia;
	}

	public void setNumerZlecenia(int numerZlecenia) {
		this.numerZlecenia = numerZlecenia;
	}

	public String getZlecajacy() {
		return zlecajacy;
	}

	public void setZlecajacy(String zlecajacy) {
		this.zlecajacy = zlecajacy;
	}

	public String getTresc() {
		return tresc;
	}

	public void setTresc(String tresc) {
		this.tresc = tresc;
	}

	public LocalDate getTerminWykonania() {
		return terminWykonania;
	}

	public void setTerminWykonania(LocalDate terminWykonania) {
		this.terminWykonania = terminWykonania;
	}

	public String getWykonawca() {
		return wykonawca;
	}

	public void setWykonawca(String wykonawca) {
		this.wykonawca = wykonawca;
	}

	public LocalDate getDataWykonania() {
		return dataWykonania;
	}

	public void setDataWykonania(LocalDate dataWykonania) {
		this.dataWykonania = dataWykonania;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getUwagi() {
		return uwagi;
	}

	public void setUwagi(String uwagi) {
		this.uwagi = uwagi;
	}

	@Override
	public String toString() {
		return "Zlecenie [dataZgloszenia=" + dataZgloszenia + ", numerZlecenia=" + numerZlecenia + ", zlecajacy="
				+ zlecajacy + ", tresc=" + tresc + ", terminWykonania=" + terminWykonania + ", wykonawca=" + wykonawca
				+ ", dataWykonania=" + dataWykonania + ", uwagi=" + uwagi + "]";
	}

}
