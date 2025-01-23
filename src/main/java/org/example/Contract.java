package org.example;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate startDate;

    private Integer contractDuration;

    private BigDecimal salaryAmount;

    @ManyToMany(mappedBy = "contracts")
    private Set<Person> persons;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public Contract(Long id, LocalDate startDate, Integer contractDuration, BigDecimal salaryAmount, Set<Person> persons, Company company) {
        this.id = id;
        this.startDate = startDate;
        this.contractDuration = contractDuration;
        this.salaryAmount = salaryAmount;
        this.persons = persons;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Integer getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(Integer contractDuration) {
        this.contractDuration = contractDuration;
    }

    public BigDecimal getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(BigDecimal salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public Set<Person> getPersons() {
        return persons;
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
