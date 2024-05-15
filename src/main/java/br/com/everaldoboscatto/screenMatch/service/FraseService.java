package br.com.everaldoboscatto.screenMatch.service;

import br.com.everaldoboscatto.screenMatch.dto.FraseDTO;
import br.com.everaldoboscatto.screenMatch.model.Frase;
import br.com.everaldoboscatto.screenMatch.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Faz injeção de dependência
@Service
public class FraseService {
    // Indica ao Spring que ele fará a gerenciamento da classe
    @Autowired
    private FraseRepository repositorio;
    public FraseDTO obterobterFaseAleatoria() {
        Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
