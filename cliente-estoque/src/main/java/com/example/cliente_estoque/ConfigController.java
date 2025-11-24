package com.example.cliente_estoque;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${mensagem.boasvindas:Erro ao carregar}")
    private String mensagem;

    @GetMapping("/mensagem")
    public String getMensagem() {
        return this.mensagem;
    }
}