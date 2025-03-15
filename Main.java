import services.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class App {

    @Autowired
    private ContatoService contatoService;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

    }

    @Bean
    CommandLineRunner initialization () {

        System.out.println(contatoService.listarContatos());

        return args -> {
            System.out.println("Servidor no ar na porta 8080 ...");
        };
    }


}
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }
}
