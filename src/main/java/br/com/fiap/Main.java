package br.com.fiap;

import br.com.fiap.domain.entity.Aluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory( "maria-db" );

        EntityManager manager = factory.createEntityManager();

//        Aluno benezinho = new Aluno();
//        benezinho.setNome( "Benefrancis do Nascimento" ).setRm( "RM202308" );
//
//        Aluno chapolim = new Aluno();
//        chapolim.setNome( "Chapolim Colorado" ).setRm( "RM123456" );
//
//        manager.getTransaction().begin();
//
//        manager.persist( benezinho );
//        manager.persist( chapolim );
//
//        manager.getTransaction().commit();


        Long id = Long.valueOf( JOptionPane.showInputDialog( "Informe o ID do aluno" ) );

        var encontrei = manager.find( Aluno.class, id );

        manager.close();
        factory.close();

        System.out.println(encontrei);

    }
}