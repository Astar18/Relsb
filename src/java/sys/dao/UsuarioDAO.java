
package sys.dao;

import sys.modelo.Usuario;

/**
 *
 * @author Alex
 */
public interface UsuarioDAO {
    
    public Usuario search(Usuario usuario);

    public Usuario login(Usuario usuario);
}
