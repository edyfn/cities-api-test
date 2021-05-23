package com.edirley.citiesapi.coutries.repository;

import com.edirley.citiesapi.coutries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
