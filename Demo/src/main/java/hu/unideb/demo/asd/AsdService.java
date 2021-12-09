package hu.unideb.demo.asd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsdService {

    @Autowired
    AsdRepository asdRepository;

    public List<Asd> listAsds() {
        return asdRepository.findAll();
    }

    public Asd findByName(String name) {
        return asdRepository.findAsdByName(name);
    }

    public void saveAsd(Asd asd) {
        asdRepository.save(asd);
    }
}
