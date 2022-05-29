package br.com.crud.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.crud.model.Usuario;
import br.com.crud.repository.IUsuario;

@Service
public class UsuarioService {

    private IUsuario repository;

    public UsuarioService(IUsuario repository) {
        this.repository = repository;
    }

    public List<Usuario> listarUsuarios() {
        List<Usuario> lista = repository.findAll();
        return lista;
    }

    public Usuario criarUsuario(Usuario usuario) {
		Usuario usuarioNovo = repository.save(usuario);
		return usuarioNovo;
	}

    public Usuario editarUsuario(Usuario usuario) {
		Usuario usuarioNovo = repository.save(usuario);
		return usuarioNovo;
	}

    public Boolean excluirUsuario(Long id) {
		repository.deleteById(id);
		return true;
	}
}
