package pl.eurogeo.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ZlecenieDao extends CrudRepository<Zlecenie, Long> {
	List<Zlecenie> findByDataZgloszenia(LocalDate dataZgloszenia);
	List<Zlecenie> findByTerminWykonania(LocalDate terminWykonania);
	List<Zlecenie> findByDataWykonania(LocalDate dataWykonania);
	Zlecenie findByNumerZlecenia (int numerZlecenia);
	List<Zlecenie> findByMonthAndYear(int month,int year);
	List<Zlecenie> findByZlecajacyAndMonthAndYear(String zlecajacy, int month, int year);
}

