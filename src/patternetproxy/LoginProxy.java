package patternetproxy;

public class LoginProxy implements Access {

    private Access user = new Login();

    @Override
    public boolean access(Credential credential) {
        if (!isExpired(credential)) {
            return true;
        }
        return user.access(credential);
    }

    @Override
    public boolean isExpired(Credential credential) {
        return user.isExpired(credential);
    }
}
