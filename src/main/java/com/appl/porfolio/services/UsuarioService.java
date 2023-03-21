package com.appl.porfolio.services;

import com.appl.porfolio.exception.UserNotFoundException;
import com.appl.porfolio.models.Usuario;
import com.appl.porfolio.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    public UsuarioService(UsuarioRepository usuarioRepository) {this.usuarioRepository = usuarioRepository;}

    public Usuario addUsuario(Usuario usuario) {return usuarioRepository.save(usuario);}
    public List<Usuario> buscarUsuario(){
        return usuarioRepository.findAll();
    }
    public Usuario editarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public void borrarUsuario(Long id){
        usuarioRepository.deleteById(id);}
    public Usuario buscarUsuarioPorId(Long id){return usuarioRepository.findById(id).orElseThrow(() ->new UserNotFoundException("usuario no encontrado"));}
}
