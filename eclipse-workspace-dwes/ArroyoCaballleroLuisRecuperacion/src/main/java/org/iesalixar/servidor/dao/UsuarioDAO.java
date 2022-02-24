package org.iesalixar.servidor.dao;

import org.iesalixar.servidor.models.Usuario;

public interface UsuarioDAO {

	public boolean registerUsuario(Usuario usuario);
	public Usuario getUsuario(String email);
}
