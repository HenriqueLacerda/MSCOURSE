package br.com.henriquelacerda.hrworker.repository;

import br.com.henriquelacerda.hrworker.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WokerRepository extends JpaRepository<Worker, Long> {

}
