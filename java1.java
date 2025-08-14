import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
File name
@Component
public class SecurityCredentialsPrinter implements CommandLineRunner {
Hello world  
    @Value("${spring.security.user.name}")
    private String username;

    @Value("${spring.security.user.password}")
    private String password;
hey


    @Override
    public void run(String... args) {
        System.out.println("🔐 Default Spring Security Credentials:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
