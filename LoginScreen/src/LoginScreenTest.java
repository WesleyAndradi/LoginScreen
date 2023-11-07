import org.junit.Test;


public class LoginScreenTest {

    
    public void testSuccessfulLogin() {
        LoginScreen loginScreen = new LoginScreen();
        assertTrue(loginScreen.login("John1", "password123"));
    }

    
    public void testFailedLogin() {
        LoginScreen loginScreen = new LoginScreen();
        assertFalse(loginScreen.login("john", "wrongpassword"));
    }

    
    private void assertFalse(boolean login) {
		// TODO Auto-generated method stub
		
	}


	public void testAddUser() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.addUser("testuser", "testpassword");
        assertTrue(loginScreen.login("testuser", "testpassword"));
    }

    private void assertTrue(boolean login) {
		// TODO Auto-generated method stub
		
	}


	public static void main(String[] args) {
        // Este é o ponto de entrada do programa, não faz parte dos testes.
    }
}
