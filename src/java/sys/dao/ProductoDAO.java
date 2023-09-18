
package sys.dao;

import java.util.List;
import sys.modelo.Producto;

/**
 *
 * @author Alex
 */
public interface ProductoDAO {
    public List<Producto> select();
    public void insert (Producto producto);
    public void update (Producto producto);
    public void delete (Producto producto);
}
