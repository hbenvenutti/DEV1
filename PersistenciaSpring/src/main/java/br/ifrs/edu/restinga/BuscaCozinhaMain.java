package br.ifrs.edu.restinga;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import br.ifrs.edu.restinga.domain.model.Cozinha;
import br.ifrs.edu.restinga.jpa.CadastroCozinha;

public class BuscaCozinhaMain {
    public static void main(String[] args){
        ApplicationContext applicationContext = 
            new SpringApplicationBuilder(PersistenciaSpringApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
        
        CadastroCozinha cadastro = applicationContext.getBean(CadastroCozinha.class);

        Cozinha cozinha = cadastro.buscar(1L);

        System.out.println(cozinha.getNome());
    }
}
