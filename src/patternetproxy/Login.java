package patternetproxy;

import java.util.Random;

public class Login implements Access {

    @Override
    public boolean access(Credential credential) {
        return new SystemCredential(credential).canAccess();
    }

    @Override
    public boolean isExpired(Credential credential) {
        // simulando alguma quesição ou algo do tipo
        final Random random = new Random();
        final int nextInt = random.nextInt(2);
        return nextInt == 0;
    }
}
