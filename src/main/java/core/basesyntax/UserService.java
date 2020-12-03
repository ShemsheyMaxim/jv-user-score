package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {
    public int getUserScore(String[] records, String email) {
        for (String user : records) {
            if (user.length() != email.length() && user.startsWith(email)) {
                return Integer.parseInt(user.substring(email.length() + 1));
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
