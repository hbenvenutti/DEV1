package br.ifrs.edu.restinga;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import br.ifrs.edu.restinga.domain.model.Cozinha;
import br.ifrs.edu.restinga.jpa.CadastroCozinha;

public class CadastroCozinhaMain {
    public static void main(String[] args){
        ApplicationContext applicationContext = 
            new SpringApplicationBuilder(PersistenciaSpringApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
        
        CadastroCozinha cadastro = applicationContext.getBean(CadastroCozinha.class);

        Cozinha japonesa = new Cozinha();
        japonesa.setNome("Japonesa");
        
        Cozinha uruguaia = new Cozinha();
        uruguaia.setNome("Uruguaia");

        cadastro.salvar(japonesa);
        cadastro.salvar(uruguaia);

        System.out.println("Cozinha adicionada: " + japonesa.getId() + "\n" + japonesa.getNome());
        System.out.println("Cozinha adicionada: " + uruguaia.getId() + "\n" + uruguaia.getNome());
    }
}
