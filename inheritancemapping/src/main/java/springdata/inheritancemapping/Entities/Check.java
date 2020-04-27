package springdata.inheritancemapping.Entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("ch")
@Table(name = "bankcheck")
public class Check extends Payment {
    private String CheckNumber;

    public String getCheckNumber() {
        return CheckNumber;
    }

    public void setCheckNumber(String checkNumber) {
        CheckNumber = checkNumber;
    }
}
