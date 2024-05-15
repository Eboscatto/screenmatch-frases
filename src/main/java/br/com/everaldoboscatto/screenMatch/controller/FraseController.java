package br.com.everaldoboscatto.screenMatch.controller;

import br.com.everaldoboscatto.screenMatch.dto.FraseDTO;
import br.com.everaldoboscatto.screenMatch.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // Indica ao Spring que esse é um controlador
public class FraseController {
    @Autowired // Faz a injenção dependência do serviço
    private FraseService servico;

    @GetMapping("/series/frases") // Faz o mapeamento de rota
    public FraseDTO obterFaseAleatoria() {
        return servico.obterobterFaseAleatoria();
    }

}
