package com.example.contactbook3.model;

import com.example.contactbook3.model.util.Label;
import lombok.Data;
import lombok.Generated;
import lombok.ToString;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Data
@ToString
@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String surname;

    private String phone;

   @Enumerated(EnumType.STRING)
    private Label phoneLabel;


    @Column(nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    private Label emailLabel;


    public String stringify() {
        return "" + name +
                "" + surname +
                "" + phone +
                "" + phoneLabel +
                "" + email +
                "" + emailLabel;
    }
}
