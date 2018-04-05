package tr.com.altpro.jsondb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;

    @Embedded
    private Adress adress;
    @Embedded
    private Company company;

    public User() {}
}
