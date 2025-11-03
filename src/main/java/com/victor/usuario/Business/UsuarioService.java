package com.victor.usuario.Business;

import com.victor.usuario.Business.Converter.UsuarioConverter;
import com.victor.usuario.Business.dto.UsuarioDTO;
import com.victor.usuario.infraestructure.Entity.Usuario;
import com.victor.usuario.infraestructure.Repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvarUSuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        usuario = usuarioRepository.save(usuario);
        return usuarioConverter.paraUsuarioDTO(usuario);
    }
}
