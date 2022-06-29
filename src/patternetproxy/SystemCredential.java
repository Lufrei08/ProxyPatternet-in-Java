package patternetproxy;

public class SystemCredential {

    private Credential credential;
    private String username;
    private String password;

    public SystemCredential(Credential credential) {
        this.credential = credential;
        // simulando acesso valido
        this.username = "sysAdmim";
        this.password = "sysPwd";
    }

    public boolean canAccess() {
        final boolean isUsernameOK = username.equals(credential.getUsername());
        final boolean isPasswordOK = password.equals(credential.getPassword());
        boolean sucess = isUsernameOK && isPasswordOK;
        if (sucess) {

        }
        return sucess;
    }
}
