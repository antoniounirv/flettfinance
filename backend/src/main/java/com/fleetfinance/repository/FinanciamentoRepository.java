
package com.fleetfinance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fleetfinance.model.*;

public interface FinanciamentoRepository extends JpaRepository<Financiamento, Long> {
}
