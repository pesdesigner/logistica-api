package com.graficoeweb.api.model.input;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EntregaInput {
	
	@Valid
	@NotNull
	private ClienteIdInput cliente;
	@Valid
	@NotNull
	private DestinatarioIdInput destinatario;
	@NotNull
	private BigDecimal taxa;
	
}
