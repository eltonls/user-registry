package com.eltonls.greatsystem.Model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * User
 */
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String cpf;
    private String rg;
    private String mothersName;
    private String accountCreationDate;

    public User() {}

    public User( String firstName, String lastName, String dateOfBirth,
        String cpf, String rg, String mothersName, String accountCreationDate ) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.cpf = cpf;
        this.rg = rg;
        this.mothersName = mothersName;
        this.accountCreationDate = accountCreationDate;
    }

    @Override
    public boolean equals(Object o) {
            if(this == o) return true;
            if(o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return  Objects.equals(id, user.id) &&
                    Objects.equals(firstName, user.firstName) &&
                    Objects.equals(lastName, user.lastName) &&
                    Objects.equals(dateOfBirth, user.dateOfBirth) &&
                    Objects.equals(cpf, user.cpf) &&
                    Objects.equals(rg, user.rg) &&
                    Objects.equals(mothersName, user.mothersName) &&
                    Objects.equals(accountCreationDate, user.accountCreationDate);
    }

    @Override
    public int hashCode() {
        return  Objects.hash(id, firstName, lastName, dateOfBirth,
                cpf, rg, mothersName, accountCreationDate);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    @Override
    public String toString() {
        return  "User{" +
                "id= '" + id +
                ", firstName = '" + firstName + "'" +
                ", lastName = '" + lastName + "'" +
                ", dateOfBirth = '" + dateOfBirth + "'" +
                ", cpf = '" + cpf + "'" +
                ", rg = '" + rg + "'" +
                ", mothersName = '" + mothersName + "'" +
                ", accountCreationDate = '" + accountCreationDate + "'" +
                "}";
    }
}
