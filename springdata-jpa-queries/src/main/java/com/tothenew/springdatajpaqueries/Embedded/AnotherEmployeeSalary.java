package com.tothenew.springdatajpaqueries.Embedded;

import javax.persistence.Embeddable;

@Embeddable
public class AnotherEmployeeSalary {
    private Long basicSalary;
    private Long bonusSalary;
    private Long taxAmount;
    private Long specialAllownaceSalary;

    public AnotherEmployeeSalary() {
    }


    public AnotherEmployeeSalary(Long basicSalary,Long bonusSalary,Long taxAmount,Long specialAllownaceSalary) {
        this.basicSalary=basicSalary;
        this.bonusSalary=bonusSalary;
        this.specialAllownaceSalary=specialAllownaceSalary;
        this.taxAmount=taxAmount;
    }

    public Long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Long getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(Long bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public Long getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Long taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Long getSpecialAllownaceSalary() {
        return specialAllownaceSalary;
    }

    public void setSpecialAllownaceSalary(Long specialAllownaceSalary) {
        this.specialAllownaceSalary = specialAllownaceSalary;
    }
}
