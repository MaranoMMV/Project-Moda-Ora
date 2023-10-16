package io.github.maranommv.cadastro.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import io.github.maranommv.cadastro.domain.entity.Contato;
import io.github.maranommv.cadastro.domain.repository.ContatoRepository;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/contatos")
public class ContatoController {
    
    private final ContatoRepository contatoRepository;

    @Autowired
    public ContatoController(ContatoRepository contatoRepository){
        this.contatoRepository = contatoRepository;
    }

    @GetMapping("{id}")
    public Contato getContatoById(@PathVariable Long id){
        return contatoRepository
                    .findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND , "Contato nao encontrado"));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Contato salvar( @RequestBody @Valid Contato contato ){
        return contatoRepository.save(contato);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        contatoRepository.findById(id)
                .map(contato -> {
                    contatoRepository.delete(contato);
                    return contato;
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Contato nao encontrado para ser deletado"));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizar(@PathVariable Long id, @RequestBody @Valid Contato contatoAtualizado){
        contatoRepository.findById(id)
                .map(contato -> {
                    contato.setEmail(contatoAtualizado.getEmail());
                    contato.setNome(contatoAtualizado.getNome());
                    contato.setTelefone(contatoAtualizado.getTelefone());
                    return contatoRepository.save(contato);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Contato nao encontrado para ser atualizado"));
    }


}
