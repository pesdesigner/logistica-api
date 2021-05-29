package com.graficoeweb.api.domain.service;

import org.springframework.stereotype.Service;

import com.graficoeweb.api.domain.exception.EntidadeNaoEncontradaException;
import com.graficoeweb.api.domain.model.Entrega;
import com.graficoeweb.api.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
	
	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}
}
