package br.ifrs.edu.restinga;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import br.ifrs.edu.restinga.domain.model.Cozinha;
import br.ifrs.edu.restinga.jpa.CadastroCozinha;

public class UpdateCozinhaMain {
    public static void main(String[] args){
        ApplicationContext applicationContext = 
            new SpringApplicationBuilder(PersistenciaSpringApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
        
        CadastroCozinha cadastro = applicationContext.getBean(CadastroCozinha.class);

        
        Cozinha australiana = new Cozinha();
        australiana.setId(1L);
        australiana.setNome("Uruguaia");

        cadastro.salvar(australiana);

        System.out.println("Cozinha atualizada: " + australiana.getId() + "\n" + australiana.getNome());
    }
}
