package hu.unideb.demo.asd;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsdRepository extends JpaRepository<Asd, Long> {

    Asd findAsdByName(final String name);
}
