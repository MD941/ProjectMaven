package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class App {
        public static void main(String[] args) {
                Company company1 = new Company(1L, "Company1", new HashSet<Contract>());
                Company company2 = new Company(1L, "Company2", new HashSet<Contract>());

                Contract contract1 = new Contract(1L, LocalDate.now(),2, BigDecimal.valueOf(1221.12), new HashSet<>(), company1);
                Contract contract2 = new Contract(1L, LocalDate.now(),2, BigDecimal.valueOf(1221.12), new HashSet<>(), company2);

                Set<Contract> contracts = new HashSet<Contract>();
                contracts.add(contract1);
                contracts.add(contract2);

                Person person = new Person(1L, "Ivan", contracts);

                for (Contract contract : contracts){
                        System.out.println(contract.getCompany().getName());
                }

                contract1.setContractDuration(4);
                company2.getContracts().remove(contract1);


        }
}
