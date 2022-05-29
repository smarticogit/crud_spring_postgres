package br.com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crud.model.Usuario;

public interface IUsuario extends JpaRepository<Usuario, Long> {

}
