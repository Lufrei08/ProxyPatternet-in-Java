package patternetproxy;

public interface Access {

    public boolean access(Credential credential);

    public boolean isExpired(Credential credential);
}
