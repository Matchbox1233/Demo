package hu.unideb.demo.asd;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean("asdBean")
@ViewScoped
public class AsdBean {

    @Getter
    @Setter
    private String name;

    private final AsdService asdService;

    public AsdBean(AsdService asdService) {
        this.asdService = asdService;
    }

    public List<Asd> getAsdList() {
        return asdService.listAsds();
    }

    public String getAsdId(String name) {
        return asdService.findByName(name).getName();
    }

    public void save() {
        if (name != null && !name.isEmpty() && !name.matches("\\s*")) {
            asdService.saveAsd(new Asd(null, name.trim()));
        }
        name = null;
    }
}
