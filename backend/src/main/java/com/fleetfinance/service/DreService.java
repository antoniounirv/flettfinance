
package com.fleetfinance.service;

import org.springframework.stereotype.Service;
import java.util.*;
import java.math.BigDecimal;
import com.fleetfinance.model.*;
import com.fleetfinance.repository.*;

@Service
public class DreService {

    private final ParcelaRepository parcelaRepository;
    private final ParticipacaoRepository participacaoRepository;
    private final EstoqueSaidaRepository estoqueSaidaRepository;
    private final ParcelaFinanciamentoRepository parcelaFinanciamentoRepository;

    public DreService(ParcelaRepository parcelaRepository,
                      ParticipacaoRepository participacaoRepository,
                      EstoqueSaidaRepository estoqueSaidaRepository,
                      ParcelaFinanciamentoRepository parcelaFinanciamentoRepository) {
        this.parcelaRepository = parcelaRepository;
        this.participacaoRepository = participacaoRepository;
        this.estoqueSaidaRepository = estoqueSaidaRepository;
        this.parcelaFinanciamentoRepository = parcelaFinanciamentoRepository;
    }

    // REGRA:
    // - DRE olha PARCELAS
    // - Se parcelado, divide pelos produtos (participações)
    // - Financiamentos: parcela entra no DRE
    // - Estoque: só entra quando houver saída
    public BigDecimal calcularResultadoMensal() {
        BigDecimal total = BigDecimal.ZERO;

        List<Participacao> participacoes = participacaoRepository.findAll();
        for (Parcela p : parcelaRepository.findAll()) {
            Despesa despesa = p.getDespesa();
            if (despesa == null || despesa.getId() == null) {
                continue;
            }
            Long despesaId = despesa.getId();
            for (Participacao part : participacoes) {
                Despesa partDespesa = part.getDespesa();
                if (partDespesa != null && despesaId.equals(partDespesa.getId())) {
                    total = total.add(part.getValor());
                }
            }
        }

        for (EstoqueSaida saida : estoqueSaidaRepository.findAll()) {
            total = total.add(saida.getValorCusto());
        }

        for (ParcelaFinanciamento p : parcelaFinanciamentoRepository.findAll()) {
            total = total.add(p.getValor());
        }

        return total;
    }
}
