package com.apex.fairtrade.company.repository;

import com.apex.fairtrade.company.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    Optional<Company> findByTickerSymbol(String symbol);
}
