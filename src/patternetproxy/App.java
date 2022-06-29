package patternetproxy;

public class App {

    public static void main(String[] args) {
        Access login = new LoginProxy();
        final Credential wrongCredential = new Credential("fulano", "123");
        final Credential rightCredential = new Credential("sysAdmim", "sysPwd");
        loginStatus(login, wrongCredential);
        loginStatus(login, rightCredential);
    }

    private static void loginStatus(Access login, final Credential credential) {
        boolean access = login.access(credential);
        if (access) {
            System.out.println("Logget In: true");
        } else {
            System.out.println("Logged In: false");
        }
    }

}
