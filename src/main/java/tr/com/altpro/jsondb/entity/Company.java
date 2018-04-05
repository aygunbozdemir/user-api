package tr.com.altpro.jsondb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@Embeddable
public class Company {

    @Column(name = "company_name")
    private String name;
    private String cathPhrase;
    private String bs;

    public Company() {
    }
}