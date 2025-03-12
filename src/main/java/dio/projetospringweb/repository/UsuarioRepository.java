package dio.projetospringweb.repository;

import dio.projetospringweb.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if(usuario.getId()==null){
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        }
        else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }

        System.out.println(usuario);

    }

    public void deleteById(String id) {
        System.out.println("DELETE/id - Recebendo o id " + id + " para excluir um usuário na camada de repositório");
        System.out.println("ID: " + id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando todos os usuários na camada de repositório");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gabriel", "password1"));
        usuarios.add(new Usuario("joao", "password2"));
        return usuarios;

    }

    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id %d para buscar um usuário na camada de repositório", id));
        return new Usuario("gabriel", "password1");
    }

    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username %s para buscar um usuário na camada de repositório", username));
        return new Usuario("gabriel", "password1");
    }
}
