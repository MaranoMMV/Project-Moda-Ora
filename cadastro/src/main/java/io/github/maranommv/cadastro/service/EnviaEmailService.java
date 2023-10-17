package io.github.maranommv.cadastro.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EnviaEmailService {
    
    
    private final JavaMailSender javaMailSender;

    public EnviaEmailService(final JavaMailSender javaMailSender){
        this.javaMailSender = javaMailSender;
    }

    public void enviar(String para, String titulo, String conteudo){
        log.info("Enviando email simples");

        var mensagem = new SimpleMailMessage();
        mensagem.setTo(para);
        mensagem.setSubject(titulo);
        mensagem.setText(conteudo);
        javaMailSender.send(mensagem);
        log.info("Email enviado com sucesso!");
    }
}
