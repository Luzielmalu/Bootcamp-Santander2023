package luzielma.dio.projeto.Java.modeloAp;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "dados_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;
    private String Agency;

    
    private BigDecimal balance;

    @Column(name = "additional_limit", precision = 13, scale = 2)
    private BigDecimal limit;

public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getNumber() {
    return number;
}
public void setNumber(String number) {
    this.number = number;
}
public String getAgency() {
    return Agency;
}
public void setAgency(String agency) {
    Agency = agency;
}
public BigDecimal getBalance() {
    return balance;
}
public void setBalance(BigDecimal balance) {
    this.balance = balance;
}
public BigDecimal getLimit() {
    return limit;
}
public void setLimit(BigDecimal limit) {
    this.limit = limit;
}
    
}
