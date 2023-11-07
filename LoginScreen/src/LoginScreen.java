import java.util.HashMap;
import java.util.Map;

/**
 * A classe LoginScreen representa um sistema simples de autenticação de usuário.
 * Ela permite verificar as credenciais de um usuário e adicionar novos usuários ao banco de dados.
 */
public class LoginScreen {
    private Map<String, String> userDatabase;

    /**
     * Construtor da classe
     * Inicializa o banco de dados de usuários com alguns dados de exemplo.
     */
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("John", "password123");
        userDatabase.put("alice", "securepass");
    }

    /**
     * Verifica se as credenciais do usuário são válidas.
     *
     * @param username O nome de usuário fornecido.
     * @param password A senha fornecida.
     * @return true se as credenciais são válidas, caso contrário, false.
     */
    public boolean login(String username, String password) {
        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username);
            if (storedPassword.equals(password)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adiciona um novo usuário ao banco de dados.
     *
     * @param username O nome de usuário do novo usuário.
     * @param password A senha do novo usuário.
     */
    public void addUser(String username, String password) {
        userDatabase.put(username, password);
    }

    /**
     * Método principal usado para testar a classe. Não faz parte da funcionalidade principal.
     *
     * @param args Argumentos da linha de comando (não são usados neste exemplo).
     */
    public static void main(String[] args) {
        // Este é o ponto de entrada do programa, não faz parte da classe de teste.
        // Aqui você pode adicionar código para testar ou usar a classe LoginScreen.
    }
}
