package io.github.maranommv.cadastro.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;

@Service
public class EmailService implements CommandLineRunner{
    
    private final EnviaEmailService enviaEmailService;

    public EmailService(EnviaEmailService enviaEmailService) {
        this.enviaEmailService = enviaEmailService;
    }

    @Override
    public void run(String... args) throws MessagingException {
    }

}
